package com.eugenefe.producer;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.eugenefe.qualifiers.HttpParam;

/** 
 * Ominfaces @Param is Alternavite workthrough.
*/
public class HttpParamProducer {
	@Inject
    FacesContext facesContext;

    @Produces
    @HttpParam
    String getHttpParameter(InjectionPoint ip) {
        String name = ip.getAnnotated().getAnnotation(HttpParam.class).value();
        if ("".equals(name)) name = ip.getMember().getName();
        return facesContext.getExternalContext()
                .getRequestParameterMap()
                .get(name);
    }

    /*@Produces @HttpParam("")  
    String getParamValue(ServletRequest request, InjectionPoint ip) {  
       return request.getParameter(ip.getAnnotation(HttpParam.class).value());  
    }*/  
}
