package com.eugenefe.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import org.omnifaces.util.Messages;

import com.eugenefe.controller.Theme;
import com.eugenefe.service.ThemeService;

@FacesConverter("themeConverter")
public class ThemeConverter implements Converter {
	@Inject
	private ThemeService service;
	
	
	public ThemeConverter() {
	}
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
//                ThemeService service = (ThemeService) fc.getExternalContext().getApplicationMap().get("themeService");
                System.out.println("themeServices" + service.getThemes().get(Integer.parseInt(value)));
                
                Messages.addInfo(uic.getClientId(fc), "Converter currently used: {0}", this);
                Messages.addInfo(uic.getClientId(fc), "CDI injected in converter: {0}", service);
                
                return service.getThemes().get(Integer.parseInt(value));
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
            }
        }
        else {
            return null;
        }
    }

	@Override
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
        	System.out.println("aaa" + ((Theme) object).getId());
            return String.valueOf(((Theme) object).getId());
        }
        else {
            return null;
        }
    } 

}
