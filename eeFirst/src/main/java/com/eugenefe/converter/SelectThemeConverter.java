package com.eugenefe.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

import org.omnifaces.converter.SelectItemsConverter;

import com.eugenefe.model.Theme;


/** this Class can be deleted when omnifaces.SelectItemConveter works in the xhtml file 
*/
@FacesConverter("selectThemeConverter")
public class SelectThemeConverter extends SelectItemsConverter {
	@Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String name = (value instanceof Theme) ? ((Theme) value).getName() : null;
        return (name != null) ? name : null;
    }
}
