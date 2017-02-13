package com.eugenefe.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.omnifaces.converter.SelectItemsConverter;

import com.eugenefe.model.DataTableColumn;


/** this Class can be deleted when omnifaces.SelectItemConveter works in the xhtml file 
*/
@Named
//@SessionScoped
public class DataTableColumnConverter extends SelectItemsConverter {
	@Override
  public String getAsString(FacesContext context, UIComponent component, Object value) {
      String name = (value instanceof DataTableColumn) ? ((DataTableColumn) value).idString() : null;
      return (name != null) ? name : null;
  }
}