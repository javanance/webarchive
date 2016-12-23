package com.eugenefe.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.diagram.Connection;
import org.primefaces.model.diagram.DefaultDiagramModel;
import org.primefaces.model.diagram.DiagramModel;
import org.primefaces.model.diagram.Element;
import org.primefaces.model.diagram.endpoint.BlankEndPoint;
import org.primefaces.model.diagram.endpoint.DotEndPoint;
import org.primefaces.model.diagram.endpoint.EndPointAnchor;
import org.primefaces.model.diagram.endpoint.ImageEndPoint;
import org.primefaces.model.diagram.endpoint.RectangleEndPoint;

@Named
@ViewScoped
public class DiagramBean implements Serializable {
	
	private DefaultDiagramModel model;

	public DiagramBean() {
	}

	@PostConstruct
	public void init() {
		System.out.println("DiagramBean Gen");
		model = new DefaultDiagramModel();
		model.setMaxConnections(-1);

		Element elementA = new Element("A", "20em", "6em");
		elementA.addEndPoint(new DotEndPoint(EndPointAnchor.BOTTOM));

		Element elementB = new Element("B", "10em", "18em");
		elementB.addEndPoint(new DotEndPoint(EndPointAnchor.TOP));

		Element elementC = new Element("C", "40em", "18em");
		elementC.addEndPoint(new DotEndPoint(EndPointAnchor.TOP));

		model.addElement(elementA);
		model.addElement(elementB);
		model.addElement(elementC);

		model.connect(new Connection(elementA.getEndPoints().get(0), elementB.getEndPoints().get(0)));
		model.connect(new Connection(elementA.getEndPoints().get(0), elementC.getEndPoints().get(0)));
	}

	
	public void addElement(){
		Element newEle = new Element("AAA", "2em", "6em");
		newEle.addEndPoint(new BlankEndPoint(EndPointAnchor.AUTO_DEFAULT));
//		newEle.addEndPoint(new RectangleEndPoint(EndPointAnchor.BOTTOM));
		model.addElement(newEle);
	}
	
	public DiagramModel getModel() {
		return model;
	}

	public void setModel(DefaultDiagramModel model) {
		this.model = model;
	}
	    
}
