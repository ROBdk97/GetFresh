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
    TextView set1r;
    TextView wid1r;
    TextView set1t;
    TextView wid1t;
    TextView set1b;
    TextView wid1b;
    TextView set2b;
    TextView wid2b;
    TextView set2s;
    TextView wid2s;
    TextView set3b;
    TextView wid3b;
    TextView set3bi;
    TextView wid3bi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3ersplit);
        //Text
        TextView set1r=(TextView)findViewById(R.id.set1r);
        TextView wid1r=(TextView)findViewById(R.id.wid1r);
        TextView set1t=(TextView)findViewById(R.id.set1t);
        TextView wid1t=(TextView)findViewById(R.id.wid1t);
        TextView set1b=(TextView)findViewById(R.id.set1b);
        TextView wid1b=(TextView)findViewById(R.id.wid1b);
        TextView set2b=(TextView)findViewById(R.id.set2b);
        TextView wid2b=(TextView)findViewById(R.id.wid2b);
        TextView set2s=(TextView)findViewById(R.id.set2s);
        TextView wid2s=(TextView)findViewById(R.id.wid2s);
        TextView set3b=(TextView)findViewById(R.id.set3b);
        TextView wid3b=(TextView)findViewById(R.id.wid3b);
        TextView set3bi=(TextView)findViewById(R.id.set3bi);
        TextView wid3bi=(TextView)findViewById(R.id.set3bi);


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
