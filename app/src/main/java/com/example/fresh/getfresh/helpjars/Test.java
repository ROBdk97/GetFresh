package com.example.fresh.getfresh.helpjars;

import java.util.ArrayList;

public class Test {
	private String name;
	private String typ;
	private ArrayList<Frage> fragenliste;
	
	//Methoden
	
	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public ArrayList<Frage> getFragenliste() {
		return fragenliste;
	}
	public void setFragenliste(ArrayList<Frage> fragenliste) {
		this.fragenliste = fragenliste;
	}
	
	
	//Konstruktor
	public Test(String name, String typ, ArrayList<Frage> fragenliste) {
		this.name = name;
		this.typ = typ;
		this.fragenliste = fragenliste;
	}
}
