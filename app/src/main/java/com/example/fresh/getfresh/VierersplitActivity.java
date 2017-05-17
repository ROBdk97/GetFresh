package com.example.fresh.getfresh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.fresh.getfresh.helpjars.MyDatabase;

/**
 * Created by Benedict on 06.05.2017.
 */

public class VierersplitActivity extends AppCompatActivity
{
    private TextView set1b;
    private TextView wid1b;
    private TextView set1t;
    private TextView wid1t;
    private TextView set2r;
    private TextView wid2r;
    private TextView set2b;
    private TextView wid2b;
    private TextView set3be;
    private TextView wid3be;
    private TextView set3ba;
    private TextView wid3ba;
    private TextView set4s;
    private TextView wid4s;

    MyDatabase db;
    Boolean auf;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4ersplit);

        set1b=(TextView)findViewById(R.id.set1b);
        wid1b=(TextView)findViewById(R.id.wid1b);
        set1t=(TextView)findViewById(R.id.set1t);
        wid1t=(TextView)findViewById(R.id.wid1t);
        set2r=(TextView)findViewById(R.id.set2r);
        wid2r=(TextView)findViewById(R.id.wid2r);
        set2b=(TextView)findViewById(R.id.set2b);
        wid2b=(TextView)findViewById(R.id.wd2b);
        set3be=(TextView)findViewById(R.id.set3be);
        wid3be=(TextView)findViewById(R.id.wid3be);
        set3ba=(TextView)findViewById(R.id.set3ba);
        wid3ba=(TextView)findViewById(R.id.wid3ba);
        set4s=(TextView)findViewById(R.id.set4s);
        wid4s=(TextView)findViewById(R.id.wid4s);

        db = new MyDatabase(this);
        Bundle c = getIntent().getExtras();
        auf=c.getInt("training")!= 0;
        ausfuellen();
    }

    public void onClickErnaehrungsplan4(View v)    {
        Intent intent = new Intent(getApplicationContext(), ErnahrungsplanActivity.class);
        Bundle c = getIntent().getExtras();
        Bundle b = new Bundle();
        b.putInt("training",c.getInt("training"));
        intent.putExtras(b);
        startActivity(intent);
    }

    private void ausfuellen(){
        set1b.setText(db.getTraining(auf,"Brust").getSaetze());
        wid1b.setText(db.getTraining(auf,"Brust").getWiederholungen());
        if (auf) {
            set1t.setText(db.getTraining(auf, "Trizeps").getSaetze());
            wid1t.setText(db.getTraining(auf, "Trizeps").getWiederholungen());
            set2b.setText(db.getTraining(auf,"Bizeps").getSaetze());
            wid2b.setText(db.getTraining(auf,"Bizeps").getWiederholungen());
        }else {
            set1t.setText(db.getTraining(auf, "Arme").getSaetze());
            wid1t.setText(db.getTraining(auf, "Arme").getWiederholungen());
        }
        set2r.setText(db.getTraining(auf,"Ruecken").getSaetze());
        wid2r.setText(db.getTraining(auf,"Ruecken").getWiederholungen());
        set3be.setText(db.getTraining(auf,"Beine").getSaetze());
        wid3be.setText(db.getTraining(auf,"Beine").getWiederholungen());
        set3ba.setText(db.getTraining(auf,"Bauch").getSaetze());
        wid3ba.setText(db.getTraining(auf,"Bauch").getWiederholungen());
        set4s.setText(db.getTraining(auf,"Schultern").getSaetze());
        wid4s.setText(db.getTraining(auf,"Schultern").getWiederholungen());
    }
}
