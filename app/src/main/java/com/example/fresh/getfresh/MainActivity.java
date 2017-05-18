package com.example.fresh.getfresh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //public static String dataPath = getFilesDir();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
	//Button Klick und Öffenen neuer Activity
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
	
	//Button obenrechts
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
