package com.eugenefe.controller;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("localeSelector")
@SessionScoped
public class LocaleController implements Serializable{
private static final long serialVersionUID = 1L;
    
	
	private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	
    private static Map<String, String> availableLanguages;
    private static String  language;

    static {
        availableLanguages = new LinkedHashMap<String, String>();
        availableLanguages.put("Español", "es");
        availableLanguages.put("English", "en");
        availableLanguages.put("Français", "fr");
        availableLanguages.put("Korean", "ko");
    }

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
