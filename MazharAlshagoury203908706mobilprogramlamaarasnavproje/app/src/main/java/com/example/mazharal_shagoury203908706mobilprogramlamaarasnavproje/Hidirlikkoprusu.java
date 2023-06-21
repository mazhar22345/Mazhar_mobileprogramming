package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Hidirlikkoprusu extends AppCompatActivity {
    TextView txt,Return5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidirlikkoprusu);

        this.setTitle("Hidirlikkoprusu");

        Return5 = (TextView) findViewById(R.id.Return5);
        Return5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(Hidirlikkoprusu.this, Tokat_places.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.TextView5);
        txt.setText("Hıdırlık Köprüsü Tokat'ta bulunan bir Selçuklu köprüsüdür. Selçuklu padişahlarından Gıyaseddin Keyhüsrev'in üç yıl savaşmış üç oğlu İzzeddin, Rükneddin ve Alaaddin'i barıştırmak için yapılmıştır. 1250 yılında Selçuklular döneminde yapılan Hıdırlık Köprüsü bugün hala kullanılmaktadır.[1] Doğu ve güney kervan yollarının kesiştiği noktadadır.");
    }
}