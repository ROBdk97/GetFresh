package com.example.benedict.getfresh;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ErnahrungsplanActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ernahrungsplan);
    }
    private double gesamtKalorienbedar,groesse,gewicht;
    private int alter;

    private double gesamterKalorienbedarfBerechnen()
    {
        if(mann equal mann)
        {
            gesamtKalorienbedar=66+(gewicht*13,8)+(groesse*5.8)+(alter*6.8);
        }
        else
        {
            gesamtKalorienbedar=665+(gewicht*9.5)+(groesse*1.9)+(alter*4.7);
        }
    }
    private double kohlenhydratebgedarfberechnen()
    {
        if()
        {
            kohlenhydratebgedarf=gesamtKalorienbedar*kalorienbedarf;
        }
        else
        {
            kohlenhydratebgedarf=gesamtKalorienbedar*kalorienbedarf;
        }
    }
    private double fettbgedarfberechnen()
    {
        if()
        {
            fettbedarf=gesamtKalorienbedar*fett;
        }
        else
        {
            fettbedarf=gesamtKalorienbedar*fett;
        }
    }
    private double eiweissbedarfberechnen()
    {
        if()
        {
            eiweissbedarf=gesamtKalorienbedar*eiwess;
        }
        else
        {
            eiweissbedarf=gesamtKalorienbedar*eiweiss;
        }
    }


}
