package com.eugenefe.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;
import org.primefaces.extensions.component.gchart.model.GChartModel;
import org.primefaces.extensions.component.gchart.model.GChartModelBuilder;
import org.primefaces.extensions.component.gchart.model.GChartType;
import org.primefaces.model.map.Marker;

@Named
@ViewScoped
public class GeoChartController implements Serializable{
	private static final long serialVersionUID = 253762400419864192L;  
	
	private String geoCode;
	  
    private GChartModel chartModel = null;  
    
    public GChartModel getChart() {  
        return chartModel;  
    }  
  
    public GChartModel getChartModel() {
		return chartModel;
	}

	public void setChartModel(GChartModel chartModel) {
		this.chartModel = chartModel;
	}
	

	public String getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}

	public GeoChartController() {
	}
	public String getDate(){
		return "Date1";
	}
	public String getLable(){
		return "package";
	}
	
	
	public String getArea(){
		return "area";
	}

	
	@PostConstruct  
    public void generateModel() {  
  
        Locale englishLocale = Locale.ENGLISH;  
  
        Map<String, Object> colorAxis = new HashMap<String, Object>();  
        colorAxis.put("colors", new String[] { "blue", "white","red" });  
        
        Map<String, Object> magnifyingGlass = new HashMap<String, Object>();  
        magnifyingGlass.put("zoomFactor", 200);
        magnifyingGlass.put("enable", true);
        
        chartModel = new GChartModelBuilder().setChartType(GChartType.GEO)  
                .addColumns("Country", "Label", "Popularity")  
                .addRow(Locale.GERMANY.getDisplayCountry(englishLocale), "1200", 1200)  
                .addRow(Locale.FRANCE.getDisplayCountry(englishLocale), "100",1800)  
                .addRow("Russia", "up",1800)  
                .addRow(Locale.ITALY.getDisplayCountry(englishLocale), "120",2000)  
                .addRow(Locale.JAPAN.getDisplayCountry(englishLocale), "12",2500)
                .addRow("Shanghai", "13",2500)
                .addRow("Shimchun", "14",2500)
                .addRow("HongKong", "15",2500)
                .addRow("Singapore", "16",2500)
                .addRow("NewYork", "17",2500)
                .addRow("Chicago", "18",2500)
                .addRow("Brazil", "19",200)
                .addOption("colorAxis", colorAxis)  
                .addOption("displayMode", "markers")
//                .addOption("displayMode", "text")
                .addOption("textSize", 20)
//                .addOption("backgroundColor", "white")
//                .addOption("region", 155)
//                .addOption("resolution", "provinces")
                .addOption("legend", "none")
                .addOption("backgroundColor.stroke", "red")
                .addOption("magnifyingGlass", magnifyingGlass)

                
//                .addOption("datalessRegionColor", "HonnyDew")
                .build();  
        
//        chartModel = new GChartModelBuilder().setChartType(GChartType.GEO)  
//                .addColumns("Country", "Popularity")  
//                .addRow(Locale.GERMANY.getDisplayCountry(englishLocale), 1200)  
//                .addRow(Locale.FRANCE.getDisplayCountry(englishLocale), 1800)  
//                .addRow("Russia", 1800)  
//                .addRow(Locale.ITALY.getDisplayCountry(englishLocale), 2000)  
//                .addRow(Locale.CHINA.getDisplayCountry(englishLocale), 2200)  
//                .addRow(Locale.US.getDisplayCountry(englishLocale), 2500)  
//                .addOption("colorAxis", colorAxis)  
//                .build();  
    }  
	
	public void geoCodeSelect(){
		chartModel.getOptions().put("region", geoCode);
		System.out.println("select geoCode" + chartModel.getColumns());
	}
}
