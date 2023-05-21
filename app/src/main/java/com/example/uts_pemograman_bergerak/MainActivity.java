package com.example.uts_pemograman_bergerak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView zaki, metri, putra, ferdi, andre, ferdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zaki = (CardView) findViewById(R.id.zaki);
        metri = (CardView) findViewById(R.id.metri);
        putra = (CardView) findViewById(R.id.putra);
        ferdi = (CardView) findViewById(R.id.ferdi);
        andre = (CardView) findViewById(R.id.andre);
        ferdd = (CardView) findViewById(R.id.ferdd);


        zaki.setOnClickListener((View.OnClickListener) this);
        metri.setOnClickListener((View.OnClickListener) this);
        putra.setOnClickListener((View.OnClickListener) this);
        ferdi.setOnClickListener((View.OnClickListener) this);
        andre.setOnClickListener((View.OnClickListener) this);
        ferdd.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.zaki: i = new Intent(this, zaki.class); startActivity(i); break;
            case R.id.metri: i = new Intent(this, metri.class); startActivity(i); break;
            case R.id.putra: i = new Intent(this, putra.class); startActivity(i); break;
            case R.id.ferdi: i = new Intent(this, ferdi.class); startActivity(i); break;
            case R.id.andre: i = new Intent(this, andre.class); startActivity(i); break;
            case R.id.ferdd: i = new Intent(this, ferdd.class); startActivity(i); break;
        }
    }
}