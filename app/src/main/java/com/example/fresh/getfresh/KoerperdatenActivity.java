package com.example.fresh.getfresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class KoerperdatenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koerperdaten);

        final Button field_button = (Button) findViewById(R.id.field_button);
        final RadioButton field_maennlich = (RadioButton) findViewById(R.id.radioButton_m);
        final RadioButton field_weiblich = (RadioButton) findViewById(R.id.radioButton_w);
        final EditText field_alter = (EditText) findViewById(R.id.field_alter);
        final EditText field_groesse = (EditText) findViewById(R.id.field_groesse);
        final EditText field_gewicht = (EditText) findViewById(R.id.field_gewicht);
        final EditText field_ergebnis = (EditText) findViewById(R.id.field_ergebnis);



    }

}

