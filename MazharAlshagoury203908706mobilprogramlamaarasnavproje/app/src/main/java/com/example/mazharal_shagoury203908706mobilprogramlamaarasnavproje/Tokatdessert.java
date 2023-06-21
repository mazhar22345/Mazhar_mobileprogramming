package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tokatdessert extends AppCompatActivity {
    TextView dessert1,dessert2,dessert3,Return10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokatdessert);

        this.setTitle("dessert in Tokat");

        Return10= (TextView) findViewById(R.id.Return10);
        Return10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(Tokatdessert.this, MainActivity.class);
                startActivity(ana);
            }
        });

        dessert1 = (TextView) findViewById(R.id.dessert1);
        dessert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessert1 = new Intent(Tokatdessert.this, ayvatatlisi.class);
                startActivity(dessert1);
            }
        });

        dessert2 = (TextView) findViewById(R.id.dessert2);
        dessert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessert2 = new Intent(Tokatdessert.this, zilepekmezi.class);
                startActivity(dessert2);
            }
        });

        dessert3 = (TextView) findViewById(R.id.dessert3);
        dessert3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessert3 = new Intent(Tokatdessert.this, yufkatatlisi.class);
                startActivity(dessert3);
            }
        });

    }
}