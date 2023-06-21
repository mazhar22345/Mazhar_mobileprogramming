package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bezsucukluhellecorbasi extends AppCompatActivity {
    TextView txt,Return9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bezsucukluhellecorbasi);

        this.setTitle("Bezsucukluhellecorbasi");

        Return9 = (TextView) findViewById(R.id.Return9);
        Return9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(Bezsucukluhellecorbasi.this, Tokatfood.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.TextView8);
        txt.setText("Sivas ve Tokat başta olmak üzere farklı yörelerde farklı şekillerde hazırlanabilen helle çorbasını bu kez Tokat'ın bir başka meşhur lezzeti olan bez sucukla hazırlıyoruz! Bez torbalarda kıvam ve lezzet alması beklenen sucuklar sayesinde neredeyse ana yemek gücünde nefis bir çorba hazırlamak mümkün.");

    }
}