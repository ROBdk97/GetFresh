package com.example.fresh.getfresh.helpjars;

public class Uebung {
	private String name;
	private String geraet;
	
	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGeraet() {
		return geraet;
	}
	public void setGeraet(String geraet) {
		this.geraet = geraet;
	}
	
	//Konstruktor
	public Uebung(String name, String geraet) {
		this.name = name;
		this.geraet = geraet;
	}
}
