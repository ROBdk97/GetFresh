package com.example.fresh.getfresh.helpjars;

import java.sql.*;
/**
 * Created by Robin on 17.03.2017.
 */

public class Dbzugriff {
    Connection dbVerbindung=null;
    Statement sqlBefehl = null;
    String sqlText;
    ResultSet sqlErgebnis = null;


    //Öffne Datenbank
    public void oeffnenDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            dbVerbindung = DriverManager.getConnection("jdbc:sqlite:" + getFilesDir()"+/testDB.db");
            //System.out.println("Verbindung erfolgreich Hergestellt");
            sqlBefehl=dbVerbindung.createStatement();
            //System.out.println("SQLStatement erfolgreich Erzeugt");
            //System.out.println("#geöffnet#");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void holen(int pkontoNummer){
        oeffnenDB();
        try {
            sqlErgebnis=sqlBefehl.executeQuery("SELECT * FROM test WHERE kontonummer = "+pkontoNummer);
            sqlErgebnis.next();
            System.out.println(sqlErgebnis.getInt(1)+" "+sqlErgebnis.getString(2)+" "+sqlErgebnis.getDouble(3));
            close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            close();
            System.exit(0);
        }
    }

    public void holen(){
        oeffnenDB();
        try {
            sqlErgebnis=sqlBefehl.executeQuery("SELECT * FROM test");
            while(sqlErgebnis.next()){
                System.out.println(sqlErgebnis.getInt(1)+" "+sqlErgebnis.getString(2)+" "+sqlErgebnis.getDouble(3));
            }
            close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            close();
            System.exit(0);
        }
    }

    //Schließe Datenbank
    public void close(){
        try {
            dbVerbindung.close();
            //sqlBefehl.close();
            //System.out.println("#Schließen#");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
