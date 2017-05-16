package com.example.fresh.getfresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;

public class TraningsplanauswahlActivity extends AppCompatActivity {

    RadioButton maufbau;
    RadioButton abnehmen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traningsplanauswahl);
        maufbau=(RadioButton)findViewById(R.id.radioButton_muskelaufbau);
    }
    public void onClickweiter(View v)
    {
        Intent intent=new Intent(getApplicationContext(),SplitwahlActivity.class);
        Bundle b = new Bundle();
        b.putInt("training",((maufbau.isChecked())?1:0));
        intent.putExtras(b);
        startActivity(intent);
    }
}
