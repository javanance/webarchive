package com.eugenefe.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

import com.eugenefe.entities.MarketVariable;
import com.eugenefe.ncm.NcmErpTxIfr;
import com.eugenefe.util.Navigatable;

public class LazyMultiSortNavigatable<T extends Navigatable> implements Comparator<T> {

    private List<SortMeta> sortMeta;
    
    public LazyMultiSortNavigatable(List<SortMeta> sortMeta) {
       this.sortMeta = sortMeta;
    }

    
    public int compare(T car1, T car2) {
    	int sortSeq =0;
    	int i=0;
    	for(SortMeta aa : sortMeta){
    		sortSeq =compareSingle(aa, car1, car2);
    		if(sortSeq !=0 ){
    			return sortSeq;
    		}
    	}
        
    	return  sortSeq;
    }
    
    private int compareSingle(SortMeta sort, T car1, T car2){
    	try {
            Field field1 = car1.getClass().getDeclaredField(sort.getSortField());
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
             
            return SortOrder.ASCENDING.equals(sort.getSortOrder()) ? value : -1 * value;
        }
        catch(Exception e) {
//            throw new RuntimeException();
        	System.out.println("LazyMultiSort Exception");
            return 0;
        }
    }
}
