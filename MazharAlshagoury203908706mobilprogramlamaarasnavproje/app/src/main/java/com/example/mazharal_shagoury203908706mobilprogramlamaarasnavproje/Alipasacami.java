package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Alipasacami extends AppCompatActivity {
    TextView txt,Return3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alipasacami);

        this.setTitle("Alipasacami");

        Return3 = (TextView) findViewById(R.id.Return3);
        Return3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(Alipasacami.this, Tokat_places.class);
                startActivity(ana);
            }
        });

        txt = findViewById(R.id.TextView3);
        txt.setText("\n" +
                "Ali Paşa Camii, Tokat şehir meydanın da bulunan ve aynı ildeki en uzun geçmişi olan Camii olarak bilinir. II. Selim zamanında 1572 yılında yaptırılan caminin önünde asırlık bir ağaç bulunmaktadır. Caminin bitmesine yakın Ali Paşa’nın vefat etmesi üzerine ortaya çıkan maddi sorunlar sebebiyle, doğu ve batı tarafındaki duvar kalıntılarından anlaşıldığı üzere son cemaat yerinin dıştan ikinci bir kademe ile kapatılması planlandığı halde bundan vazgeçilmiştir. Ayrıca aynı sebeple avluya dönemin imkanlarına göre daha mütevazi olan ahşap şadırvan yapılmış bu sebeple Tokat XVI. yüzyıldan günümüze orijinal süslemeleri ile ulaşan tek ahşap şadırvana sahip bir yer olmuştu[1] Ayrıca bölge halkı arasında Meydan Camiinin kapısı Ali Paşa Camiinin yapısı da Camii için denilmektedir. Camii'nin tek kubbesi vardır. Osmanlı komutanın ismini aldığı Ali Paşa'nın oğlu mustafa bey ve eşinin mezarı da bulunmaktadır.\n");
    }
}

