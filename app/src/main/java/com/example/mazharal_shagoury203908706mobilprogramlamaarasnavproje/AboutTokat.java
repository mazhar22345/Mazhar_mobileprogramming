package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutTokat extends AppCompatActivity {
    TextView txt,Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_tokat);

        this.setTitle("Tokat Tarihi");

        Return = (TextView) findViewById(R.id.Return);
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(AboutTokat.this, MainActivity.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.textView);
        txt.setText("İlk çağlarda Togayıtlar'ca kurulduğuna inanılan Tokat, Hititlerin, Asurluların, Hurriler ve Kimmerlerin egemenliğinde kaldıktan sonra sırasıyla Perslerin, Büyük İskender dönemi Makedonyalıların, Kapodokya Krallığının ve buraya \"Comana Pontica\" adını veren Pontus Krallığı'nın yönetimine geçti. MÖ 65'te Romalıların ve sonrasında Bizans Devletinin egemenliğine girmiştir. Bizans-Sasani ve Bizans-Arap savaşlarında kritik öneme sahip olan Tokat Kalesi, Malazgirt Zaferi'nden sonra Danişmentlilerin yönetimine (1071) daha sonra ise Anadolu Selçuklularının (1150) eline geçmiş kentin güneybatısında, 750 metre yüksekliğindeki Hisartepe üzerinde bulunmaktadır. Tokat Kalesi'ne ait en eski izler 5 ya da 6. yüzyıla ait olup kalenin bu yıllarda var olduğu bilinmektedir. İoannis Hrisostomos (Altın ağızlı Yuhanna, Aziz ve erken dönem Hristiyan Kilise babası), Konstantinopolis'ten sürgüne Aladağlar'da bulunan Cocysus şehrine giderken burada ölmüştür.");
    }
}