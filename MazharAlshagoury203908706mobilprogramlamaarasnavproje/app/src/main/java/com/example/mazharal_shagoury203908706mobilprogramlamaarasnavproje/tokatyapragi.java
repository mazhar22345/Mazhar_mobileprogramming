package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tokatyapragi extends AppCompatActivity {
    TextView txt,Return7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokatyapragi);

        this.setTitle("Tokat yapragi");

        Return7 = (TextView) findViewById(R.id.Return7);
        Return7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(tokatyapragi.this, Tokatfood.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.textView6);
        txt.setText("Tokat bağ yaprağı olarak bilinen asma yaprağı, sarmaların en lezzetli hale dönüşmesini sağlıyor. Başlı başına C ve A vitamini deposu olan yaprak, bağışıklık sistemini güçlendirir. Aynı zamanda salatalara doğranıp üzerine limon sıkılarak yenebiliyor.");
    }
}