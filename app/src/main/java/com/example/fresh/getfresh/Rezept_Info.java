package com.example.fresh.getfresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fresh.getfresh.helpjars.Rezept;

public class Rezept_Info extends AppCompatActivity {

    private ImageView imageView;
    private TextView editText;
    private Rezept rezept;
    private Kochbuch kochbuch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezept__info);
        imageView = (ImageView)findViewById(R.id.imageView);
        editText = (TextView) findViewById(R.id.editText);
        Bundle b = getIntent().getExtras();
        editText.setText(b.getString("rezept"));
        imageView.setBackgroundResource(getResources().getIdentifier(("__food_"+b.getString("bild")) , "drawable", getPackageName()));
        //imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(b.getString("bild"), null, getPackageName())));
        //"R.drawable."+b.getString("bild")
        //rezept=kochbuch.giveRezept(value);
        //editText.setText(rezept.info());


    }
}
