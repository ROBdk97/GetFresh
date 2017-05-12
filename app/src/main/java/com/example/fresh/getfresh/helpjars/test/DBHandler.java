package com.example.fresh.getfresh.helpjars.test;

/**
 * Created by Robin on 08.05.2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "testDB";
    // Contacts table name
    private static final String TABLE_KONTO = "test";
    // Shops Table Columns names
    private static final String KEY_ID = "kontonummer";
    private static final String KEY_NAME = "name";
    private static final String KEY_KON_STAND = "kontostand";
    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_KONTO + "("
        + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
        + KEY_KON_STAND + " REAL" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    ////UNÖTIG
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_KONTO);
// Creating tables again
        onCreate(db);
    }
    ////UNNÖTIG-ENDE


    public void addKonnto(Konto pKonto) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, pKonto.getKname()); // Shop Name
        values.put(KEY_KON_STAND, pKonto.getKontostand()); // Shop Phone Number
// Inserting Row
        db.insert(TABLE_KONTO, null, values);
        db.close(); // Closing database connection
    }

    public List<Konto> getAllShops() {
        List<Konto> shopList = new ArrayList<>();
// Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_KONTO;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Konto shop = new Konto();
                shop.setKonntonummer(Integer.parseInt(cursor.getString(0)));
                shop.setKname(cursor.getString(1));
                shop.setKontostand(cursor.getDouble(2));
// Adding contact to list
                shopList.add(shop);
            } while (cursor.moveToNext());
        }
// return contact list
        return shopList;
    }
}
