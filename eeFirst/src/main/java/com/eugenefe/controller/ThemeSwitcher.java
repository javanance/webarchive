package com.eugenefe.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;


@Named
@SessionScoped
public class ThemeSwitcher implements Serializable{
	@Inject
	private Logger logger;

	private Map<String, String> themes;

	private List<Theme> advancedThemes;

	private String theme;

	@Inject
	private GuestPreferences guestPref;

	public ThemeSwitcher() {
	}

	@PostConstruct
	public void init() {
		if ( guestPref== null){
			logger.info("Prep Null");
		}
		logger.info("Prep:{}", guestPref.getTheme());
		theme = guestPref.getTheme();

		advancedThemes = new ArrayList<Theme>();
		advancedThemes.add(new Theme("aristo", "aristo.png"));
		advancedThemes.add(new Theme("cupertino", "cupertino.png"));
		advancedThemes.add(new Theme("trontastic", "trontastic.png"));

		themes = new TreeMap<String, String>();
		themes.put("Afterdark", "afterdark");
		themes.put("Afternoon", "afternoon");
		themes.put("Afterwork", "afterwork");
		
		themes.put("Black-Tie", "black-tie");
		themes.put("Blitzer", "blitzer");
		themes.put("Bluesky", "bluesky");
		themes.put("Bootstrap", "bootstrap");
		
		themes.put("Casablanca", "casablanca");
		themes.put("Cruze", "cruze");
		themes.put("Cupertino", "cupertino");
		
		themes.put("Dark-Hive", "dark-hive");
		themes.put("Delta", "delta");
		themes.put("Eggplant", "eggplant");
		themes.put("Excite-Bike", "excite-bike");
		themes.put("Flick", "flick");
		themes.put("Glass-X", "glass-x");
		
		themes.put("Home", "home");
		themes.put("Hot-Sneaks", "hot-sneaks");
		themes.put("Humanity", "humanity");
		themes.put("Le-Frog", "le-frog");
		themes.put("Midnight", "midnight");
		themes.put("Mint-Choc", "mint-choc");
		themes.put("Overcast", "overcast");
		themes.put("Pepper-Grinder", "pepper-grinder");
		themes.put("Redmond", "redmond");
		themes.put("Rocket", "rocket");
		themes.put("Sam", "sam");
		themes.put("Smoothness", "smoothness");
		themes.put("South-Street", "south-street");
		themes.put("Start", "start");
		themes.put("Sunny", "sunny");
		themes.put("Swanky-Purse", "swanky-purse");
		themes.put("Trontastic", "trontastic");
		themes.put("UI-Darkness", "ui-darkness");
		themes.put("UI-Lightness", "ui-lightness");
		themes.put("Vader", "vader");
	}

	public Map<String, String> getThemes() {
		return themes;
	}

	public void setThemes(Map<String, String> themes) {
		this.themes = themes;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public GuestPreferences getGuestPref() {
		return guestPref;
	}

	public void setGuestPref(GuestPreferences guestPref) {
		this.guestPref = guestPref;
	}

	public void saveTheme() {
//		log.info("Selected Theme1 :#0", guestPref.getTheme());
		guestPref.setTheme(theme);
		logger.info("Selected Theme :#0", guestPref.getTheme());
	}

	public List<Theme> getAdvancedThemes() {
		return advancedThemes;
	}

}
