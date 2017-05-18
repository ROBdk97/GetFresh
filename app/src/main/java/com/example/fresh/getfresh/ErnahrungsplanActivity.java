package com.example.fresh.getfresh;


import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.fresh.getfresh.helpjars.Koerperdaten;
import com.example.fresh.getfresh.helpjars.MyDatabase;

public class ErnahrungsplanActivity extends AppCompatActivity
{
    //GUI Elemente
    private TextView text_gesKal;
    private TextView text_kohlHyd;
    private TextView text_fett;
    private TextView text_eiweis;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ernahrungsplan);
        text_kohlHyd = (TextView)findViewById(R.id.kohlhyd);
        text_gesKal = (TextView)findViewById(R.id.gesKal);
        text_fett = (TextView)findViewById(R.id.fett);
        text_eiweis = (TextView)findViewById(R.id.eiweis);

	//bekommen der informationen aus der vorherigen Activity
        Bundle b = getIntent().getExtras();
        training=(b.getInt("training") != 0);
	//Funktionen zum anzeigen der Informationen
        getData();
        berechnen();
    }



    //Variabeln
    private Koerperdaten koerperDaten;

    private double kalorienbedarf;
    private double fett;
    private double eiweiss;
    private boolean training=true; //True=Aufbau, False=Abnehmen

	//Berechnungen
    private double gesamterKalorienbedarfBerechnen()
    {
        if(koerperDaten.isGeschlecht())//Wenn True(1) dann Man ansonst Frau
        {
            return 66+(koerperDaten.getGewicht()*13.8)+(koerperDaten.getGroesse()*5.8)+(koerperDaten.getAlter()*6.8);
        }
        else
        {
            return 665+(koerperDaten.getGewicht()*9.5)+(koerperDaten.getGroesse()*1.9)+(koerperDaten.getAlter()*4.7);
        }
    }
    private double kohlenhydratebgedarfberechnen()
    {
        if(training)
        {
            return gesamterKalorienbedarfBerechnen()*.6;
        }
        else
        {
            return gesamterKalorienbedarfBerechnen()*.1;
        }
    }
    private double fettbgedarfberechnen()
    {
        if(training)
        {
            return gesamterKalorienbedarfBerechnen()*.1;
        }
        else
        {
            return gesamterKalorienbedarfBerechnen()*.4;
        }
    }
    private double eiweissbedarfberechnen()
    {
        if(training)
        {
            return gesamterKalorienbedarfBerechnen()*.3;
        }
        else
        {
            return gesamterKalorienbedarfBerechnen()*.5;
        }
    }

	//Button um zum Hauptmenü zurück zu kommen
    public void onCLickToMain(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
	//Informationen aus der Datenbank bekommen
    private void getData(){
        MyDatabase db = new MyDatabase(this);
        koerperDaten = db.loadKoerperdaten();
    }
	//Berechnungen werden in die Felder eingetragenund berechnet
    private void berechnen(){
        text_eiweis.setText(formatG(eiweissbedarfberechnen()/4.1));
        text_fett.setText(formatG(fettbgedarfberechnen()/9.3));
        text_gesKal.setText(format(gesamterKalorienbedarfBerechnen()));
        text_kohlHyd.setText(formatG(kohlenhydratebgedarfberechnen()/4.1));
    }

	//Formatierung der Ausgabe
    private String formatG(double zahl){
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00 g");
        return  df.format(zahl);
    }
    private String format(double zahl){
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00 kal");
        return  df.format(zahl);
    }


}
