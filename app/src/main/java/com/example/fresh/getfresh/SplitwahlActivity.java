package com.example.fresh.getfresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class SplitwahlActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splitwahl);
    }
    public void onClick2ersplit(View v)
    {
        Intent intent=new Intent(getApplicationContext(),ZweiersplitActivity.class);
        startActivity(intent);
    }
    public void onClick3ersplit(View v)
    {
        Intent intent=new Intent(getApplicationContext(),DreiersplitActivity.class);
        startActivity(intent);
    }
    public void onClick4ersplit(View v)
    {
        Intent intent=new Intent(getApplicationContext(),VierersplitActivity.class);
        startActivity(intent);
    }
}
