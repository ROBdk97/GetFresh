package com.example.fresh.getfresh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fresh.getfresh.helpjars.MyDatabase;
import com.example.fresh.getfresh.helpjars.Training;

import java.util.ArrayList;

public class ZweiersplitActivity extends AppCompatActivity
{
    ArrayList<Training> trainingsliste;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2erspli);


        //#####
        MyDatabase db = new MyDatabase(this);
        Bundle c = getIntent().getExtras();
        trainingsliste=db.loadUebungen(c.getInt("training") != 0);
        ausfuellen();
    }

    public void onClickErnaehrungsplan2(View v)    {
        Intent intent = new Intent(getApplicationContext(), ErnahrungsplanActivity.class);
        Bundle c = getIntent().getExtras();
        Bundle b = new Bundle();
        b.putInt("training",c.getInt("training"));
        intent.putExtras(b);
        startActivity(intent);
    }

    private void ausfuellen(){
    }


}
