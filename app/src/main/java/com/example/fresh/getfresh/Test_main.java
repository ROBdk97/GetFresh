package com.example.fresh.getfresh;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;

public class Test_main extends AppCompatActivity {


    public static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
    }

    public void dialogevent(View view){
        AlertDialog.Builder altdial = new AlertDialog.Builder(Test_main.this);
        altdial.setMessage("Bitte kaufen sie die Premium-App im Playstore für weitere Funktionen").setCancelable(false)
                .setPositiveButton("Ja", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {finish();
                            }
                        })
                .setNegativeButton("Nein", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {dialog.cancel();
                            }
                        });
        AlertDialog alert = altdial.create();
        alert.setTitle("Premium kaufen");
        alert.show();
    }
}
