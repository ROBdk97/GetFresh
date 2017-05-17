package com.example.fresh.getfresh.helpjars;

import java.util.ArrayList;

public class Training {
	private String muskelgruppe;
	private String grunduebung;
	private String uebung2;
	private String saetze;
	private String wiederholungen;
	private String intensitaet;
	private Integer dauer;
	
	//Methoden
	

	
	//Getter & Setter


	public String getMuskelgruppe() {
		return muskelgruppe;
	}

	public void setMuskelgruppe(String muskelgruppe) {
		this.muskelgruppe = muskelgruppe;
	}

	public String getGrunduebung() {
		return grunduebung;
	}

	public void setGrunduebung(String grunduebung) {
		this.grunduebung = grunduebung;
	}

	public String getUebung2() {
		return uebung2;
	}

	public void setUebung2(String uebung2) {
		this.uebung2 = uebung2;
	}

	public String getWiederholungen() {
		return wiederholungen;
	}

	public void setWiederholungen(String wiederholungen) {
		this.wiederholungen = wiederholungen;
	}

	public String getIntensitaet() {
		return intensitaet;
	}

	public void setIntensitaet(String intensitaet) {
		this.intensitaet = intensitaet;
	}

	public Integer getDauer() {
		return dauer;
	}

	public void setDauer(Integer dauer) {
		this.dauer = dauer;
	}

	public String getSaetze() {
		return saetze;
	}

	public void setSaetze(String saetze) {
		this.saetze = saetze;
	}

	public Training(String muskelgruppe, String grunduebung, String uebung2,String saetze, String wiederholungen, String intensitaet, Integer dauer) {
		this.muskelgruppe = muskelgruppe;
		this.grunduebung = grunduebung;
		this.uebung2 = uebung2;
		this.saetze=saetze;
		this.wiederholungen = wiederholungen;
		this.intensitaet = intensitaet;
		this.dauer = dauer;
	}

	public void printT(){
        System.out.println(muskelgruppe+", "+grunduebung+", "+uebung2+", "+saetze+", "+wiederholungen+", "+intensitaet+", "+dauer);
    }
}
