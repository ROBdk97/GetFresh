package com.example.fresh.getfresh;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.fresh.getfresh.helpjars.Koerperdaten;
import com.example.fresh.getfresh.helpjars.MyDatabase;
import android.content.ContentValues;


public class KoerperdatenActivity extends AppCompatActivity {


    RadioButton field_maennlich;
    EditText field_alter;
    EditText field_groesse;
    EditText field_gewicht;
    EditText field_ergebnis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koerperdaten);


        final Button field_button = (Button) findViewById(R.id.field_button);
        field_maennlich = (RadioButton) findViewById(R.id.radioButton_m);
        final RadioButton field_weiblich = (RadioButton) findViewById(R.id.radioButton_w);
        field_alter = (EditText) findViewById(R.id.field_alter);
        field_groesse = (EditText) findViewById(R.id.field_groesse);
        field_gewicht = (EditText) findViewById(R.id.field_gewicht);
        field_ergebnis = (EditText) findViewById(R.id.field_ergebnis);


        lade();
    }

    public void onClickErgebniss(View v){
        System.out.println("Save");
        //MyDatabase db = new MyDatabase(this);
        //db.saveKoerperdaten(field_maennlich.hasSelection(),Integer.parseInt(field_groesse.getText().toString()),Integer.parseInt(field_alter.getText().toString()), Integer.parseInt(field_gewicht.getText().toString()));
    }

    private void lade(){
        MyDatabase db= new MyDatabase(this);
        Koerperdaten k = db.loadKoerperdaten();
        //field_ergebnis.setText(k.getString());
        field_maennlich.setChecked(k.isGeschlecht());
        field_alter.setText(Integer.toString(k.getAlter()));
        field_gewicht.setText(Integer.toString(k.getGewicht()));
        field_groesse.setText(Integer.toString(k.getGroesse()));
    }

    private void update(){
        MyDatabase db= new MyDatabase(this);
        Koerperdaten k = db.loadKoerperdaten();
        ContentValues values = new ContentValues();

// updating row

    }
}

