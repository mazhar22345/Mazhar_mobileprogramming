package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class yufkatatlisi extends AppCompatActivity {
    TextView txt,Return13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yufkatatlisi);

        this.setTitle("yufkatatlisi");

        Return13 = (TextView) findViewById(R.id.Return13);
        Return13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(yufkatatlisi.this, Tokatdessert.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.TextView12);
        txt.setText("Yemekleri ile sam salan Tokat tatlıları ile de geniş bir yelpazeye sahiptir. Çörekler, baklavalar, pekmezler ile meşhur olan Tokat’ın basit ve şerbetli tatlısı yufka tatlısı da tokat mutfağında önemli bir yere sahiptir. Tokat köylerinde kadınlar toplanıp yufka açarlar ve sac da pişirirler. Bu yufkalar saklanarak kış boyu tatlılarda, böreklerde kullanılır. Yufka tatlısı da bu kurutulmuş yufkalardan hazırlanır.");
    }
}