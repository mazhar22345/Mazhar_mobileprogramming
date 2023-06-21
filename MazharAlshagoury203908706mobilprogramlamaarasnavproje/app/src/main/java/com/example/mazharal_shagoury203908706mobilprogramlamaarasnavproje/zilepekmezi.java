package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class zilepekmezi extends AppCompatActivity {
    TextView txt,Return12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zilepekmezi);

        this.setTitle("zilepekmezi");

        Return12 = (TextView) findViewById(R.id.Return12);
        Return12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(zilepekmezi.this, Tokatdessert.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.TextView11);
        txt.setText("Ülkemizde pek çok farklı şekilde pekmez yapılmakta ve tüketilmektedir. Bunlardan biri de Tokat Zile ilçesinin adının duyulmasını sağlayan Zile Pekmezi! Zile pekmezini diğer pekmezlerden ayıran en önemli özelliği pekmezin rengidir. Diğer pekmezlerin aksine beyaz renkli olan Zile Pekmezi lezzetiyle de diğer pekmezlerden ayrılır.\n" +
                "\n");
    }
}