package com.example.fresh.getfresh;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.fresh.getfresh.helpjars.Dbzugriff;
import com.example.fresh.getfresh.helpjars.test.DBHandler;
import com.example.fresh.getfresh.helpjars.test.Konto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //public static String dataPath = getFilesDir();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TEST##############################
        System.err.println("#####Dir:"+getFilesDir());
        Konto k1 = new Konto(1,"Hans", 199.9);
        DBHandler db = new DBHandler(this);
        db.addKonnto(k1);
        System.err.println("#############");
        List<Konto> kontos = db.getAllShops();
        for(int i=0;i<kontos.size();i++){
            System.out.println(kontos.get(i).getKonntonummer()+" "+kontos.get(i).getKname()+" "+kontos.get(i).getKontostand());
        }
        System.err.println("#############");
        //Test-ENDE ################
    }

    public void onClickKochbuch(View v)    {
        Intent intent = new Intent(getApplicationContext(), Kochbuch.class);
        startActivity(intent);
    }

    public void onClickTraining(View v)    {
        Intent intent = new Intent(getApplicationContext(), TraningsplanauswahlActivity.class);
        startActivity(intent);
    }

    public void onClickTest(View v) {
        Intent intent = new Intent(getApplicationContext(), Test_main.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.m, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onClickOptions(this.getCurrentFocus());
        return true;
    }

    public void onClickOptions(View v){
        Intent intent = new Intent(getApplicationContext(), KoerperdatenActivity.class);
        startActivity(intent);
    }
}
