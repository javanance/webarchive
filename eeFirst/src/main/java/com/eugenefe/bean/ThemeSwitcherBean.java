package com.eugenefe.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;

import com.eugenefe.model.GuestPreferences;
import com.eugenefe.model.Theme;
import com.eugenefe.service.ThemeService;

@Named
@SessionScoped
public class ThemeSwitcherBean implements Serializable{
	@Inject
	private Logger logger;

	@Inject
    private ThemeService service;
	
	@Inject
	private GuestPreferences guestPref;

	private Theme	selectedTheme;
	private String  selectedThemeName;
	
	private List<Theme> themeList;

	public ThemeSwitcherBean() {
	}
	
//	public String goToHome(){
//		return "/view/home.xhtml?faces-redirect=true";
//	}
	
	@PostConstruct
	public void init() {
		themeList = service.getThemes();
		selectedTheme = themeList.get(28);
		if ( guestPref != null && !guestPref.getThemeString().isEmpty()){
			for(Theme aa : themeList) {
				if(aa.getDisplayName().equals(guestPref.getThemeString().toLowerCase())){
					selectedTheme =aa;
					break;
				}
			}
		}
		logger.info("Prep:{}", selectedTheme.getName());
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
//		guestPref.setTheme(selectedThemeName);
	}

	public String getSelectedThemeName() {
		return selectedThemeName;
	}

	public void setSelectedThemeName(String selectedThemeName) {
		this.selectedThemeName = selectedThemeName;
	}

	 	

}
