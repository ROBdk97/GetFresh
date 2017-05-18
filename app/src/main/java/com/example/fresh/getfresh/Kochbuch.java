package com.example.fresh.getfresh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import com.example.fresh.getfresh.helpjars.Rezept;
import com.example.fresh.getfresh.helpjars.MyDatabase;


//implementiert die nötige methode onItemClickListener welche die einzelnen Elemente Klickbar macht  
public class Kochbuch extends AppCompatActivity implements AdapterView.OnItemClickListener {

	//Variabeln
    public ArrayList<Rezept> rezeptliste= new ArrayList<Rezept>();
    private int kilojule;
    public int rnr;

	//Für die anzeige liste nötig
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kochbuch);
	
	//
        ladeRezepte();

	//Füllt die Liste mit den einzelnen Rezepte
        arrayList=new ArrayList<String>();
        list = (ListView) findViewById(R.id.rlist);
        list.setOnItemClickListener(Kochbuch.this);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.rlist_item, arrayList);
        list.setAdapter(adapter);

        for(int i=0;i<rezeptliste.size();i++){
            arrayList.add(rezeptliste.get(i).getName());
        }
        adapter.notifyDataSetChanged();
    }

	//Lade Rezepte aus Datenbank in ArrayList
    private void ladeRezepte(){
        MyDatabase db = new MyDatabase(this);
        rezeptliste=db.getRezepte();
    }

	//Metode für die Interaktion mit den einzelnen Rezepten
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Rezept iRezept=rezeptliste.get((int)id);
        //System.out.println(iRezept.info());
        Intent intent = new Intent(getApplicationContext(), Rezept_Info.class);
	//Übergabe der Informationen an die Rezept Info anzeige
        Bundle b = new Bundle();
        b.putString("rezept",giveRezept((int)id).info());
        b.putString("bild",giveRezept((int)id).getBild());
        intent.putExtras(b);
        startActivity(intent);
    }

    public Rezept giveRezept(int id){
        return rezeptliste.get(id);
    }
}
