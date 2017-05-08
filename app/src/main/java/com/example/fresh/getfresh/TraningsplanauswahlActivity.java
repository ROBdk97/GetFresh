package com.example.fresh.getfresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class TraningsplanauswahlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traningsplanauswahl);
    }
    public void onClickweiter(View v)
    {
        Intent intent=new Intent(getApplicationContext(),SplitwahlActivity.class);
        startActivity(intent);
    }
}
