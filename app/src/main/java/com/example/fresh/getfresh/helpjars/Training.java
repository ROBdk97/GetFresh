package com.example.fresh.getfresh.helpjars;

import java.util.ArrayList;

public class Training {
	private int trainingsziel;
	private ArrayList<Uebung> uebungsliste;
	private int seatze;
	private int wiederholungen;
	
	//Methoden
	
	public void Trainingsplan(){
		//Generelle Informationen Anzeigen auf GUI
		
		//Erstellen der einzelnen GUI objekte und eintragen in Tabelle
		for (int i = 0; i < uebungsliste.size(); i++) {
			
		}
	}
	
	//Getter & Setter
	
	public int isTrainingsziel() {
		return trainingsziel;
	}
	public void setTrainingsziel(int trainingsziel) {
		this.trainingsziel = trainingsziel;
	}
	public ArrayList<Uebung> getUebungsliste() {
		return uebungsliste;
	}
	public void setUebungsliste(ArrayList<Uebung> uebungsliste) {
		this.uebungsliste = uebungsliste;
	}
	public int getSeatze() {
		return seatze;
	}
	public void setSeatze(int seatze) {
		this.seatze = seatze;
	}
	public int getWiederholungen() {
		return wiederholungen;
	}
	public void setWiederholungen(int wiederholungen) {
		this.wiederholungen = wiederholungen;
	}
	
	
	public void addUebungToList(Uebung pUebung){
		getUebungsliste().add(pUebung);
	}
	public void getUebungFromList(int pI){
		getUebungsliste().get(pI);
	}
	public void remUebungFromList(int pI){
		getUebungsliste().remove(pI);
	}
	
}
