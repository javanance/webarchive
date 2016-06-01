package com.eugenefe.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.eugenefe.controller.Theme;
@Named
@ApplicationScoped
public class ImageService implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<String> imageNames;
	
	public ImageService() {
	}

	@PostConstruct
	public void init() {
		imageNames = new ArrayList<String>();
		imageNames.add("modern-buildings-website-header.jpg");
		imageNames.add("path.jpg");
		imageNames.add("travel-road-near-sea-red-bg-header.jpg");
		imageNames.add("inkwell.jpg");
	}

	public List<String> getImageNames() {
		return imageNames;
	}

	public void setImageNames(List<String> imageNames) {
		this.imageNames = imageNames;
	}
}
