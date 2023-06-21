package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ayvatatlisi extends AppCompatActivity {
    TextView txt,Return11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayvatatlisi);

        this.setTitle("ayvatatlisi");

        Return11 = (TextView) findViewById(R.id.Return11);
        Return11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(ayvatatlisi.this, Tokatdessert.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.TextView10);
        txt.setText("Karadeniz’in en güzel şehirlerinden biri olan Tokat, doğal güzelliklerinin yanı sıra yemekleriyle de ünlüdür. Özellikle tatlıları bir başka lezzetlidir. Kış denilince akla gelen ilk meyve olan ayvanın tıpkı bir gelin gibi kaymak ile süslenmiş tatlısı ise her yörede olduğu gibi Tokat’ın da vazgeçilmez tatlılarındandır. Tatlı krizlerini vicdan azabı çekmeden bastırabileceğiniz ayva tatlısı soğuk kış günlerinde en çok tercih edilen tatlıların başında gelir.");
    }
}