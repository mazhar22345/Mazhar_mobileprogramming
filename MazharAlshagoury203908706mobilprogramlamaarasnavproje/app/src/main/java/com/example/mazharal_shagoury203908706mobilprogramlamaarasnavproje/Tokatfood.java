package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tokatfood extends AppCompatActivity {
    TextView Return6,food1,food2,food3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokatfood);

        this.setTitle("Food in Tokat");

        Return6= (TextView) findViewById(R.id.Return6);
        Return6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(Tokatfood.this, MainActivity.class);
                startActivity(ana);
            }
        });

        food1 = (TextView) findViewById(R.id.food1);
        food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent food1 = new Intent(Tokatfood.this, tokatyapragi.class);
                startActivity(food1);
            }
        });

        food2 = (TextView) findViewById(R.id.food2);
        food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent food2 = new Intent(Tokatfood.this, Tokatpagaci.class);
                startActivity(food2);
            }
        });

        food3 = (TextView) findViewById(R.id.food3);
        food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent food3 = new Intent(Tokatfood.this, Bezsucukluhellecorbasi.class);
                startActivity(food3);
            }
        });



    }
}

