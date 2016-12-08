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
            Object value1 = NcmErpTxIfr.class.getField(this.sortField).get(car1);
            Object value2 = NcmErpTxIfr.class.getField(this.sortField).get(car2);
 
            int value = ((Comparable)value1).compareTo(value2);
             
            return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;
        }
        catch(Exception e) {
            throw new RuntimeException();
        }
    }
}
