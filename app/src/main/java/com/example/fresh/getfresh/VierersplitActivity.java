package com.example.fresh.getfresh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.fresh.getfresh.helpjars.MyDatabase;



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

        set1b=(TextView)findViewById(R.id.textView32);
        wid1b=(TextView)findViewById(R.id.textView46);
        set1t=(TextView)findViewById(R.id.textView33);
        wid1t=(TextView)findViewById(R.id.textView47);
        set2r=(TextView)findViewById(R.id.textView34);
        wid2r=(TextView)findViewById(R.id.textView48);
        set2b=(TextView)findViewById(R.id.textView35);
        wid2b=(TextView)findViewById(R.id.textView49);
        set3be=(TextView)findViewById(R.id.textView36);
        wid3be=(TextView)findViewById(R.id.textView50);
        set3ba=(TextView)findViewById(R.id.textView37);
        wid3ba=(TextView)findViewById(R.id.textView51);
        set4s=(TextView)findViewById(R.id.textView38);
        wid4s=(TextView)findViewById(R.id.textView52);

        db = new MyDatabase(this);
        Bundle c = getIntent().getExtras();
        auf=c.getInt("training") != 0;
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
        set1t.setText(db.getTraining(auf,"Trizeps").getSaetze());
        wid1t.setText(db.getTraining(auf,"Trizeps").getWiederholungen());
        set2r.setText(db.getTraining(auf,"Ruecken").getSaetze());
        wid2r.setText(db.getTraining(auf,"Ruecken").getWiederholungen());
        set2b.setText(db.getTraining(auf,"Bizeps").getSaetze());
        wid2b.setText(db.getTraining(auf,"Bizeps").getWiederholungen());
        set3be.setText(db.getTraining(auf,"Beine").getSaetze());
        wid3be.setText(db.getTraining(auf,"Beine").getWiederholungen());
        set3ba.setText(db.getTraining(auf,"Bauch").getSaetze());
        wid3ba.setText(db.getTraining(auf,"Bauch").getWiederholungen());
        set4s.setText(db.getTraining(auf,"Schultern").getSaetze());
        wid4s.setText(db.getTraining(auf,"Schultern").getWiederholungen());
    }
}
