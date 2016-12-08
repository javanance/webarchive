package com.eugenefe.converter;

import java.lang.reflect.Field;
import java.util.Comparator;

import org.primefaces.model.SortOrder;

import com.eugenefe.entities.MarketVariable;
import com.eugenefe.util.Navigatable;

public class LazySorterNavigatable implements Comparator<Navigatable> {

    private String sortField;
    
    private SortOrder sortOrder;
    
    public LazySorterNavigatable(String sortField, SortOrder sortOrder) {
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }

    public int compare(Navigatable navi1, Navigatable navi2) {
    	
    	int value = navi1.idString().compareTo(navi2.idString());
    	
    	return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;
    }
}
