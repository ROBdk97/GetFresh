package com.example.fresh.getfresh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fresh.getfresh.helpjars.Dbzugriff;

public class MainActivity extends AppCompatActivity {

    //public static String dataPath = "/com.example.fresh.getfresh/data/data";
    public Dbzugriff db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new Dbzugriff();
    }

    public void onClickKochbuch(View v)    {
        Intent intent = new Intent(getApplicationContext(), Kochbuch.class);
        startActivity(intent);
    }

    public void onClickTraining(View v)    {
        Intent intent = new Intent(getApplicationContext(), Training_main.class);
        startActivity(intent);
    }

    public void onClickTest(View v) {
        //db.holen(1);
        Intent intent = new Intent(getApplicationContext(), Test_main.class);
        startActivity(intent);
    }
}
