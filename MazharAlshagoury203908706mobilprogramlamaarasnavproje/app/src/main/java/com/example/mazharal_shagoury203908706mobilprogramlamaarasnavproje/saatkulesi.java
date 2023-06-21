package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class saatkulesi extends AppCompatActivity {
    TextView txt,Return2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saatkulesi);

        this.setTitle("saat kulesi");

        Return2 = (TextView) findViewById(R.id.Return2);
        Return2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(saatkulesi.this, Tokat_places.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.TextView1);
        txt.setText("Behzat Semtinde kentin her yerinden görülecek şekilde, 1902 yılında yapılmıştır. Kapısı güney yönünde olup yüksekliği 33 metredir. Kesme taştan yapılmıştır. II. Abdulhamid’in padişah oluşunun 25. yılı için halkın yardımlarıyla, mutasarrıf Bekir Paşa ve Belediye Reisi Mütevelli oğlu Enver Bey tarafından yaptırılmıştır. Dört yöne büyük kadranlarla her yarım saat ve saat başlarında iki dakika ara ile tam çalar durumdadır. Sesi kentin her semtinden rahatlıkla duyulabilmektedir.\n" +
                "\n");
    }
}