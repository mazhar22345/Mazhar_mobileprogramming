package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tokatpagaci extends AppCompatActivity {
    TextView txt,Return8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokatpagaci);

        this.setTitle("Tokatpagaci");

        Return8 = (TextView) findViewById(R.id.Return8);
        Return8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(Tokatpagaci.this, Tokatfood.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.textView7);
        txt.setText("İçine ceviz eklenen sert kıvamlı bir hamur fırınla buluşuyor. Normal ekmekten biraz daha sert olması en temel özelliği sayılıyor. Genellikle üzerine tereyağı ve bal sürülerek yenen bu nefis tat, Tokat köylerinde kahvaltıların da vazgeçilmezlerinden.");
    }
}