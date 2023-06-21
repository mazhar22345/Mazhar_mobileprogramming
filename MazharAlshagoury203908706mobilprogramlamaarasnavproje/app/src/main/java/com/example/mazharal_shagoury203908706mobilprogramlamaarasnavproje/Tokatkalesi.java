package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tokatkalesi extends AppCompatActivity {
    TextView txt,Return4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokatkalesi);

        this.setTitle("Tokatkalesi");

        Return4 = (TextView) findViewById(R.id.Return4);
        Return4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(Tokatkalesi.this, Tokat_places.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.TextView4);
        txt.setText("\n" +
                "Tokat Kalesi, yapım tarihi ve hangi medeniyet tarafından yapıldığı bilinmeyen kermen. Kaleye ait en eski izler 5 ya da 6. yüzyıla ait olup kalenin bu yıllarda var olduğu bilinmektedir. Yapının inşa edildiği kayalıklar doğal bir kale özelliğine sahip olmakla beraber surlar ve kale içerisindeki odalar insanlarca yapılmıştır.\n");
    }
}