package com.example.fresh.getfresh.helpjars;


public class Koerperdaten {
	private boolean geschlecht; 
	private double groesse;
	private int alter;
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
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Konstruktor
	
	public Koerperdaten(boolean geschlecht, double groesse, int geburtstag, String name) {
		this.geschlecht = geschlecht;
		this.groesse = groesse;
		this.alter = geburtstag;
		this.name = name;
	}	
	
}
