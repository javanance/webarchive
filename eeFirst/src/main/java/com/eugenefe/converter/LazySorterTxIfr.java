package com.eugenefe.converter;

import java.lang.reflect.Field;
import java.util.Comparator;

import org.primefaces.model.SortOrder;

import com.eugenefe.entities.MarketVariable;
import com.eugenefe.ncm.NcmErpTxIfr;
import com.eugenefe.util.Navigatable;

public class LazySorterTxIfr implements Comparator<NcmErpTxIfr> {

    private String sortField;
    
    private SortOrder sortOrder;
    
    public LazySorterTxIfr(String sortField, SortOrder sortOrder) {
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }
    
    public int compare(NcmErpTxIfr car1, NcmErpTxIfr car2) {
        try {
            Field field1 = NcmErpTxIfr.class.getDeclaredField(this.sortField);
    		field1.setAccessible(true);
    		Object value1 = field1.get(car1);
    		Object value2 = field1.get(car2);
    		if(value1 ==null  ){
    			value1 = "";
    		}
    		if(value2 ==null){
    			value2="";
    		}
            int value = ((Comparable)value1).compareTo(value2);
             
            return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;
        }
        catch(Exception e) {
            throw new RuntimeException();
        }
    }
}
