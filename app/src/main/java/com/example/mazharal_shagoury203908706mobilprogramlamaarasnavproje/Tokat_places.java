package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tokat_places extends AppCompatActivity {
    TextView Return1,place1,place2,place3,place4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokat_places);

        this.setTitle("Historical places in Tokat");

        Return1 = (TextView) findViewById(R.id.Return1);
        Return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(Tokat_places.this, MainActivity.class);
                startActivity(ana);
            }
        });
        place1 = (TextView) findViewById(R.id.place1);
        place1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent place1 = new Intent(Tokat_places.this, saatkulesi.class);
                startActivity(place1);
            }
        });
        place2 = (TextView) findViewById(R.id.place2);
        place2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tarihi2 = new Intent(Tokat_places.this, Alipasacami.class);
                startActivity(tarihi2);
            }
        });
        place3 = (TextView) findViewById(R.id.place3);
        place3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tarihi3 = new Intent(Tokat_places.this, Tokatkalesi.class);
                startActivity(tarihi3);
            }
        });
        place4 = (TextView) findViewById(R.id.place4);
        place4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent place4 = new Intent(Tokat_places.this, Hidirlikkoprusu.class);
                startActivity(place4);
            }
        });

    }
}