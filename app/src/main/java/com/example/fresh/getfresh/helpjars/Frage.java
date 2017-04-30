package com.example.fresh.getfresh.helpjars;

import java.util.ArrayList;

public class Frage {
	private String frage;
	private ArrayList<String> auswahlmoeglickeiten;
	private int answer;
	
	//Methoden
	
	
	//Getter & Setter
	public String getFrage() {
		return frage;
	}
	public void setFrage(String frage) {
		this.frage = frage;
	}
	public ArrayList<String> getAuswahlmoeglickeiten() {
		return auswahlmoeglickeiten;
	}
	public void setAuswahlmoeglickeiten(ArrayList<String> auswahlmoeglickeiten) {
		this.auswahlmoeglickeiten = auswahlmoeglickeiten;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
}
