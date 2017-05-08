package com.example.fresh.getfresh.helpjars.test;

/**
 * Created by Robin on 08.05.2017.
 */

public class Konto {
    private int konntonummer;
    private String kname;

    public Konto(int konntonummer, String kname, Double kontostand) {
        this.konntonummer = konntonummer;
        this.kname = kname;
        this.kontostand = kontostand;
    }
    public Konto(){}

    private Double kontostand;

    public int getKonntonummer() {
        return konntonummer;
    }

    public void setKonntonummer(int konntonummer) {
        this.konntonummer = konntonummer;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    public Double getKontostand() {
        return kontostand;
    }

    public void setKontostand(Double kontostand) {
        this.kontostand = kontostand;
    }
}
