package com.example.fresh.getfresh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.fresh.getfresh.helpjars.MyDatabase;
import com.example.fresh.getfresh.helpjars.Training;

import java.util.ArrayList;


/**
 * Created by Benedict on 06.05.2017.
 */

public class DreiersplitActivity extends AppCompatActivity
{
    Boolean auf;
    MyDatabase db;

    //Textviews
    private TextView set1r;
    private TextView wid1r;
    private TextView set1t;
    private TextView wid1t;
    private TextView set1b;
    private TextView wid1b;
    private TextView set2b;
    private TextView wid2b;
    private TextView set2s;
    private TextView wid2s;
    private TextView set3b;
    private TextView wid3b;
    private TextView set3bi;
    private TextView wid3bi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3ersplit);
        //Text
        set1r=(TextView)findViewById(R.id.set1r);
        wid1r=(TextView)findViewById(R.id.wid1r);
        set1t=(TextView)findViewById(R.id.set1t);
        wid1t=(TextView)findViewById(R.id.wid1t);
        set1b=(TextView)findViewById(R.id.set1b);
        wid1b=(TextView)findViewById(R.id.wid1b);
        set2b=(TextView)findViewById(R.id.set2b);
        wid2b=(TextView)findViewById(R.id.wid2b);
        set2s=(TextView)findViewById(R.id.set2s);
        wid2s=(TextView)findViewById(R.id.wid2s);
        set3b=(TextView)findViewById(R.id.set3b);
        wid3b=(TextView)findViewById(R.id.wid3b);
        set3bi=(TextView)findViewById(R.id.set3bi);
        wid3bi=(TextView)findViewById(R.id.set3bi);


        //#####
        db = new MyDatabase(this);
        Bundle c = getIntent().getExtras();
        auf=c.getInt("training") != 0;
        ausfuellen();
    }

    public void onClickErnaehrungsplan3(View v)    {
        Intent intent = new Intent(getApplicationContext(), ErnahrungsplanActivity.class);
        Bundle c = getIntent().getExtras();
        Bundle b = new Bundle();
        b.putInt("training",c.getInt("training"));
        intent.putExtras(b);
        startActivity(intent);
    }

    private void ausfuellen(){
        System.out.println("#1");
        set1r.setText(db.getTraining(auf,"Ruecken").getSaetze());
        wid1r.setText(db.getTraining(auf,"Ruecken").getWiederholungen());
        System.out.println("#2");
        set1t.setText(db.getTraining(auf,"Trizeps").getSaetze());
        wid1t.setText(db.getTraining(auf,"Trizeps").getWiederholungen());
        System.out.println("#3");
        set1b.setText(db.getTraining(auf,"Bauch").getSaetze());
        wid1b.setText(db.getTraining(auf,"Bauch").getWiederholungen());
        set2b.setText(db.getTraining(auf,"Beine").getSaetze());
        wid2b.setText(db.getTraining(auf,"Beine").getWiederholungen());
        set2s.setText(db.getTraining(auf,"Schultern").getSaetze());
        wid2s.setText(db.getTraining(auf,"Schultern").getWiederholungen());
        set3b.setText(db.getTraining(auf,"Brust").getSaetze());
        wid3b.setText(db.getTraining(auf,"Brust").getWiederholungen());
        set3bi.setText(db.getTraining(auf,"Bizeps").getSaetze());
        wid3bi.setText(db.getTraining(auf,"Bizeps").getWiederholungen());
    }
}
