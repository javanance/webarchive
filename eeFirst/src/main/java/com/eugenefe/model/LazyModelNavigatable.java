package com.eugenefe.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

import com.eugenefe.entities.MarketVariable;
import com.eugenefe.enums.model.ENamingConvention;
import com.eugenefe.util.Navigatable;

public class LazyModelNavigatable<T extends Navigatable>  extends LazyDataModel<T>{
	
//	@Logger
//	private Log log;
	
	private List<T> datasource;  
    
    
	public LazyModelNavigatable(List<T> datasource) {  
        this.datasource = datasource;  
    }  
      
    @Override  
    public T getRowData(String rowKey) {  
        for(Navigatable aa : datasource) {  
            if(aa.idString().equals(rowKey))  
                return (T)aa;  
        }  
        return null;  
    }  
  
    @Override  
    public Object getRowKey(T navi) {  
        return navi.idString();  
    }  
    
    
    @Override
    public List<T> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String,Object> filters) {  
        List<T> data = new ArrayList<T>();  
                
        //filter  
//        System.out.println("Before in the filter Market :"+ filters.keySet().size());
        for(Navigatable navi : datasource) {  
//        	System.out.println("In the Loop");
        	boolean match = true;
        	
            for(String it: filters.keySet()){	
            	try {  
//                    String filterProperty = ENamingConvention.SNAKE_CASE.convertToCamelCase(it);
                    String filterProperty = it;
                    
                    Field filterField = navi.getClass().getDeclaredField(filterProperty);
                    filterField.setAccessible(true);
                    
                    String fieldValue = String.valueOf(filterField.get(navi));
                    String filterValue = (String)filters.get(it);  
//                    String fieldValue = String.valueOf(aa.getClass().getField(filterProperty).get(aa));  
  
//                    System.out.println("LazyFilter:" + filterValue +"_" + fieldValue);
                    
                    if(filterValue == null || fieldValue.toLowerCase().contains(filterValue.toLowerCase())) {	
                        match = true;  
//                        System.out.println("LazyFilter:match" + filterValue +"_" + fieldValue);
                    }  
                    else {  
                        match = false;  
                        break;  
                    }  
                } catch(Exception e) {  
                    match = false;  
                }   
            }  
  
            if(match) {  
                data.add((T)navi);  
            }  
        }  
        //sort  
//        System.out.println("Before in the sort");
        if(sortField != null) {  
//        	System.out.println("in the sort1 :"+ data.size()+sortField +":" + sortOrder.toString());
        	Collections.sort(data, new LazySingleSortNavigatable(sortField, sortOrder));  
//            System.out.println("in the sort2");
        }  
//        System.out.println("After in the sort");
        //rowCount  
        int dataSize = data.size();  
        this.setRowCount(dataSize);  
  
        //paginate  
        if(dataSize > pageSize) {  
//        	System.out.println("in the pagination" + dataSize);
            try {  
                return data.subList(first, first + pageSize);  
            }  
            catch(IndexOutOfBoundsException e) {  
                return data.subList(first, first + (dataSize % pageSize));  
            }  
        }  
        else {  
            return data;  
        }  
    }
    
    @Override
    public List<T> load(int first, int pageSize, List<SortMeta> sortMeta, Map<String,Object> filters) {  
        List<T> data = new ArrayList<T>();  
                
        //filter  
//        System.out.println("Before in the filter Market :"+ filters.keySet().size());
        for(Navigatable navi : datasource) {  
//        	System.out.println("In the Loop");
        	boolean match = true;
        	
            for(String it: filters.keySet()){	
            	try {  
//                    String filterProperty = ENamingConvention.SNAKE_CASE.convertToCamelCase(it);
                    String filterProperty = it;
                    
                    Field filterField = navi.getClass().getDeclaredField(filterProperty);
                    filterField.setAccessible(true);
                    
                    String fieldValue = String.valueOf(filterField.get(navi));
                    String filterValue = (String)filters.get(it);  
//                    String fieldValue = String.valueOf(aa.getClass().getField(filterProperty).get(aa));  
  
//                    System.out.println("LazyFilter:" + filterValue +"_" + fieldValue);
                    
                    if(filterValue == null || fieldValue.toLowerCase().contains(filterValue.toLowerCase())) {	
                        match = true;  
//                        System.out.println("LazyFilter:match" + filterValue +"_" + fieldValue);
                    }  
                    else {  
                        match = false;  
                        break;  
                    }  
                } catch(Exception e) {  
                    match = false;  
                }   
            }  
  
            if(match) {  
                data.add((T)navi);  
            }  
        }  
        //sort  
        if(sortMeta != null && sortMeta.size()>0) {  
        	Collections.sort(data, new LazyMultiSortNavigatable<>(sortMeta));  
        }  
        //rowCount  
        int dataSize = data.size();  
        this.setRowCount(dataSize);  
  
        //paginate  
        if(dataSize > pageSize) {  
//        	System.out.println("in the pagination" + dataSize);
            try {  
                return data.subList(first, first + pageSize);  
            }  
            catch(IndexOutOfBoundsException e) {  
                return data.subList(first, first + (dataSize % pageSize));  
            }  
        }  
        else {  
            return data;  
        }  
    }
    
    /*@Override
    public void setRowIndex(int rowIndex) {
           if (getPageSize() == 0) {
                rowIndex = -11;
            }
            super.setRowIndex(rowIndex);
    }*/
    @Override
    public void setRowIndex(int rowIndex) {
        /*
         * The following is in ancestor (LazyDataModel):
         * this.rowIndex = rowIndex == -1 ? rowIndex : (rowIndex % pageSize);
         */
        if (rowIndex == -1 || getPageSize() == 0) {
//        	System.out.println("Row Index : " + rowIndex +":"+ getPageSize());
            super.setRowIndex(-1);
        }
        else{
//        	System.out.println("Row Index1 : " + rowIndex +":"+ getPageSize());
            super.setRowIndex(rowIndex % getPageSize());
        }    
    }
    
 
}
