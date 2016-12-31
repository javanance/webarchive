package com.eugenefe.model;
import java.io.Serializable;

public class Theme implements Serializable {
    
	private int id;
    private String displayName;
    private String name;
     
    public Theme() {}
 
    public Theme(int id, String displayName, String name) {
        this.id = id;
        this.displayName = displayName;
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getDisplayName() {
        return displayName;
    }
 
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
     
    @Override
    public boolean equals(Object other) {
        return (other instanceof Theme) && (name != null)
            ? name.equals(((Theme) other).name)
            : (other == this);
    }

    @Override
    public int hashCode() {
        return (name != null)
            ? (this.getClass().hashCode() + name.hashCode())
            : super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Theme[%d, %s]", id, name);
    }
}
