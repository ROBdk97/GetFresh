package com.example.fresh.getfresh.helpjars;

import java.util.Date;


public class Koerperdaten {
	private boolean geschlecht; 
	private double groesse;
	private Date geburtstag;
	private String name;
	
	//Methoden
	
	public void save(){
		//info aus felder bekommen
		
	}
	
	//Getter & Setter
	public boolean isGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(boolean geschlecht) {
		this.geschlecht = geschlecht;
	}
	public double getGroesse() {
		return groesse;
	}
	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}
	public Date getGeburtstag() {
		return geburtstag;
	}
	public void setGeburtstag(Date geburtstag) {
		this.geburtstag = geburtstag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Konstruktor
	
	public Koerperdaten(boolean geschlecht, double groesse, Date geburtstag, String name) {
		this.geschlecht = geschlecht;
		this.groesse = groesse;
		this.geburtstag = geburtstag;
		this.name = name;
	}	
	
}
