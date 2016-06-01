package com.eugenefe.controller;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.eugenefe.qualifiers.MessageBundle;

@Named("localeSelector")
@SessionScoped
public class LocaleController implements Serializable{
private static final long serialVersionUID = 1L;
    
	
	private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	
//	@Inject @MessageBundle
//	private ResourceBundle msg;
	
    private static Map<String, String> availableLanguages;
    private static String  language;

    static {
        availableLanguages = new LinkedHashMap<String, String>();
        availableLanguages.put("English", "en");
        availableLanguages.put("한국어", "ko");
        
//        availableLanguages.put("english", "en");
//        availableLanguages.put("korean", "ko");
//        availableLanguages.put("Español", "es");
//        availableLanguages.put("Français", "fr");
    }
    
//    @PostConstruct
//    public void inin(){
//    	 availableLanguages = new LinkedHashMap<String, String>();
//         availableLanguages.put(msg.getString("english"), "en");
//         availableLanguages.put(msg.getString("korean"), "ko");
//    }

    public Map<String, String> getAvailableLanguages() {
        return availableLanguages;
    }

    public Locale getLocale() {
        return locale;
    }

    public String getLanguage() {
        return locale.getLanguage();
    }

    public void setLanguage(String language) {
    	System.out.println("as is locale" + locale.toLanguageTag());
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
        System.out.println("locale set" + locale.toLanguageTag());
    }
    
    public Locale select(){
    	System.out.println("as is locale" + locale.toLanguageTag());
    	FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    	System.out.println("locale set in select");
    	return locale;
    }
}
