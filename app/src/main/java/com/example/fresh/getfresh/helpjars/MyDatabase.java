package com.example.fresh.getfresh.helpjars;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
import java.util.ArrayList;

public class MyDatabase extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "getFresh.db";
    private static final int DATABASE_VERSION = 1;
	
	//Konstruktor
    public MyDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

	//Methode um Rezepte aus datenbank auszulesen
    public ArrayList<Rezept> getRezepte(){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        qb.setTables("Rezepte");
        Cursor c = qb.query(db,null,null,null,null,null,null);
        c.moveToFirst();
        ArrayList<Rezept> rezeptliste = new ArrayList<>();
        do {
            //System.out.println(c.getString(0)+", "+c.getDouble(1)+", "+c.getString(2)+", "+c.getString(3)+", "+c.getInt(4)+", "+c.getString(5));
            Rezept r = new Rezept(c.getString(0),c.getInt(1),c.getString(2).replaceAll("#","\n"),c.getString(3),c.getInt(4),c.getString(5));
            rezeptliste.add(r);
        }while(c.moveToNext());
        return rezeptliste;
    }

	//Fehlerhafte methode um Koerperdaten zu speichern
    public void saveKoerperdaten(boolean geschlecht, int groesse, int alter, int gewicht){
        String name = "";
        SQLiteDatabase db = getReadableDatabase();
        System.out.println(geschlecht+","+groesse+","+alter+","+gewicht);
        ContentValues cv = new ContentValues();
        cv.put("Geschlecht", geschlecht);
        cv.put("Groesse", groesse);
        cv.put("Alter", alter);
        cv.put("Name", name);
        cv.put("Gewicht", gewicht);
        db.update("Koerperdaten", cv,null,null);
        System.out.println("Körperdaten gespeichert####");
    }

	//Laden der Körperdaten
    public Koerperdaten loadKoerperdaten(){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        qb.setTables("Koerperdaten");
        Cursor c = qb.query(db,null,null,null,null,null,null);
        c.moveToFirst();
        boolean b = (c.getInt(0)!=0);
        Koerperdaten k = new Koerperdaten(b,c.getInt(1),c.getInt(2),c.getInt(4),c.getString(3));
        k.print();
        return  k;
    }

	//Nicht benutzte Methode um liste aller Uebungen zu erhalten je nach trainingsart
    public ArrayList<Training> loadUebungen(boolean trainingsart){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        if (trainingsart) {
            qb.setTables("Training_aufbau");
        }
        else {
            qb.setTables("Training_abnehmen");
        }
        Cursor c = qb.query(db,null,null,null,null,null,null);
        c.moveToFirst();
        ArrayList<Training> trainingsliste = new ArrayList<>();
        do {
            Training t = new Training(c.getString(0),c.getString(1),c.getString(2),c.getString(3),c.getString(4),c.getString(5),c.getInt(6));
            trainingsliste.add(t);
            t.printT();
        }while(c.moveToNext());
        return trainingsliste;
    }

	//Training erhalten je nach trainingsart und angeforderter Muskeltyp
    public Training getTraining(boolean trainingsart,String mtyp){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        if (trainingsart) {
            qb.setTables("Training_aufbau");
        }
        else {
            qb.setTables("Training_abnehmen");
        }
        Cursor c = qb.query(db,null,("Muskelgruppe = '"+mtyp+"'"),null,null,null,null);
        c.moveToFirst();
        Training t = new Training(c.getString(0),c.getString(1),c.getString(2),c.getString(3),c.getString(4),c.getString(5),c.getInt(6));
        t.printT();
        return  t;
    }


}