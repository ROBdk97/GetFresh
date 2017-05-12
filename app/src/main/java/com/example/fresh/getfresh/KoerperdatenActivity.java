package com.example.fresh.getfresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class KoerperdatenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koerperdaten);

        final Button field_button = (Button) findViewById(R.id.field_button);
        final Button field_maennlich = (Button) findViewById(R.id.field_maennlich);
        final Button field_weiblich = (Button) findViewById(R.id.field_weiblich);
        final EditText field_alter = (EditText) findViewById(R.id.field_alter);
        final EditText field_groesse = (EditText) findViewById(R.id.field_groesse);
        final EditText field_gewicht = (EditText) findViewById(R.id.field_gewicht);
        final EditText field_ergebnis = (EditText) findViewById(R.id.field_ergebnis);



    }

}

