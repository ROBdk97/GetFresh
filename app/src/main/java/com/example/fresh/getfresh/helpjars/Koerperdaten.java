package com.example.fresh.getfresh.helpjars;


public class Koerperdaten {
	private boolean geschlecht; 
	private int groesse;
	private int alter;
	private String name;
	private int gewicht;
	
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
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
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

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	//Konstruktor
	
	public Koerperdaten(boolean geschlecht, int groesse, int alter, int gewicht, String name) {
		this.geschlecht = geschlecht;
		this.groesse = groesse;
		this.alter = alter;
		this.name = name;
		this.gewicht = gewicht;
	}

	public void print(){
        System.out.println(geschlecht+", "+groesse+", "+alter+", "+gewicht+", "+name);
    }
    public String getString(){
        return (geschlecht+", "+groesse+", "+alter+", "+gewicht+", "+name);
    }
}
