package com.example.fresh.getfresh;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import com.example.fresh.getfresh.helpjars.Rezept;


public class Kochbuch extends AppCompatActivity implements AdapterView.OnItemClickListener {


    public ArrayList<Rezept> rezeptliste= new ArrayList<Rezept>();
    private int kilojule;
    public int rnr;

    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kochbuch);

        //test
        Rezept r1= new Rezept("Kuchen",500,"Eier + Mehl","mischen",10,"xx");
        rezeptliste.add(r1);
        rezeptliste.add(r1);
        //test ende

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


    private void ladeRezepte(){

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Rezept iRezept=rezeptliste.get((int)id);
        //System.out.println(iRezept.info());
        Intent intent = new Intent(getApplicationContext(), Rezept_Info.class);
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
