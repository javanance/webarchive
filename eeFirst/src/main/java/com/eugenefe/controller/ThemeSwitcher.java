package com.eugenefe.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;

import com.eugenefe.service.ThemeService;

@Named
@SessionScoped
public class ThemeSwitcher implements Serializable{
	@Inject
	private Logger logger;

	@Inject
    private ThemeService service;
	
	@Inject
	private GuestPreferences guestPref;

	private Theme	selectedTheme;
	private String  selectedThemeName;
	
	private List<Theme> themeList;

	public ThemeSwitcher() {
	}
	
	
	@PostConstruct
	public void init() {
		if ( guestPref== null){
			logger.info("Prep Null");
		}
		logger.info("Prep:{}", guestPref.getTheme());
//		theme = guestPref.getTheme();

		themeList = service.getThemes();
		 selectedTheme = themeList.get(28);
	}


	public GuestPreferences getGuestPref() {
		return guestPref;
	}

	public void setGuestPref(GuestPreferences guestPref) {
		this.guestPref = guestPref;
	}

	public Theme getSelectedTheme() {
		return selectedTheme;
	}


	public void setSelectedTheme(Theme selectedTheme) {
		this.selectedTheme = selectedTheme;
	}


	public List<Theme> getThemeList() {
		return themeList;
	}


	public void setThemeList(List<Theme> themes) {
		this.themeList = themes;
	}


	public void saveTheme() {
//		log.info("Selected Theme1 :#0", guestPref.getTheme());
		guestPref.setTheme(selectedTheme.getName());
//		guestPref.setTheme(selectedThemeName);
		logger.info("Selected Theme : {}", guestPref.getTheme());
	}

	 

}
