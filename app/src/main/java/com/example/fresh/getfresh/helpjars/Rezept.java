package com.example.fresh.getfresh.helpjars;

public class Rezept {
	private String name;
	private int kJ;
	private String zutaten;
	private String schritte;
	private int zeit;
	private String bild;
	
	//Methoden
	
	
	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getkJ() {
		return kJ;
	}
	public void setkJ(int kJ) {
		this.kJ = kJ;
	}
	public String getZutaten() {
		return zutaten;
	}
	public void setZutaten(String zutaten) {
		this.zutaten = zutaten;
	}
	public String getSchritte() {
		return schritte;
	}
	public void setSchritte(String schritte) {
		this.schritte = schritte;
	}
	public int getZeit() {
		return zeit;
	}
	public void setZeit(int zeit) {
		this.zeit = zeit;
	}
	public String getBild() {
		return bild;
	}
	public void setBild(String bild) {
		this.bild = bild;
	}

	public String info(){
		return (this.name+"\n "+this.kJ+"\n "+this.zutaten+"\n "+this.schritte+"\n "+this.zeit);
	}

	//Konstruktor
	public Rezept(String name, int kJ, String zutaten, String schritte, int zeit, String bild) {
		this.name = name;
		this.kJ = kJ;
		this.zutaten = zutaten;
		this.schritte = schritte;
		this.zeit = zeit;
		this.bild = bild;
	}	
}
