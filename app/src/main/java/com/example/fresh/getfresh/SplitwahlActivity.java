package com.example.fresh.getfresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class SplitwahlActivity extends AppCompatActivity
{

    Button bSplit2;
    Button bSplit3;
    Button bSplit4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splitwahl);
        bSplit2=(Button) findViewById(R.id.button_2ersplit);
        bSplit3=(Button) findViewById(R.id.button_3ersplit);
        bSplit4=(Button) findViewById(R.id.button_4ersplit);
    }

	//Öffnen der jeweiligenSplittwahl + Übergabe an andere activity
    public void onClick2ersplit(View v)
    {
        Intent intent=new Intent(getApplicationContext(),ZweiersplitActivity.class);
        Bundle c = getIntent().getExtras();
        Bundle b = new Bundle();
        b.putInt("training",c.getInt("training"));
        intent.putExtras(b);
        startActivity(intent);
    }
    public void onClick3ersplit(View v)
    {
        Intent intent=new Intent(getApplicationContext(),DreiersplitActivity.class);
        Bundle c = getIntent().getExtras();
        Bundle b = new Bundle();
        b.putInt("training",c.getInt("training"));
        intent.putExtras(b);
        startActivity(intent);
    }
    public void onClick4ersplit(View v)
    {
        Intent intent=new Intent(getApplicationContext(),VierersplitActivity.class);
        Bundle c = getIntent().getExtras();
        Bundle b = new Bundle();
        b.putInt("training",c.getInt("training"));
        intent.putExtras(b);
        startActivity(intent);
    }
}
