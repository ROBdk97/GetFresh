package com.example.fresh.getfresh;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ErnahrungsplanActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ernahrungsplan);
    }
    private double gesamtKalorienbedar,groesse,gewicht,kalorienbedarf,fett,eiweiss;
    private int alter;
    private boolean geschlecht;

    private double gesamterKalorienbedarfBerechnen()
    {
        if(geschlecht)//Wenn True(1) dann Man ansonst Frau
        {
            return 66+(gewicht*13.8)+(groesse*5.8)+(alter*6.8);
        }
        else
        {
            return 665+(gewicht*9.5)+(groesse*1.9)+(alter*4.7);
        }
    }
    private double kohlenhydratebgedarfberechnen()
    {
        if(geschlecht)
        {
            return gesamtKalorienbedar*kalorienbedarf;
        }
        else
        {
            return gesamtKalorienbedar*kalorienbedarf;
        }
    }
    private double fettbgedarfberechnen()
    {
        if(geschlecht)
        {
            return gesamtKalorienbedar*fett;
        }
        else
        {
            return gesamtKalorienbedar*fett;
        }
    }
    private double eiweissbedarfberechnen()
    {
        if(geschlecht)
        {
            return gesamtKalorienbedar*eiweiss;
        }
        else
        {
            return gesamtKalorienbedar*eiweiss;
        }
    }


}
