package com.example.mazharal_shagoury203908706mobilprogramlamaarasnavproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Ana Menü");
        list = findViewById(R.id.list_item);

        final List<String> textLabels = Arrays.asList("Tokat Tarihi", "Tokat Tarihi Yerleri", "TokatYörsel Yemekler", "Tokat Yörsel Tatlılar");

        tvListAdapter adapter = new tvListAdapter(this, textLabels, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                String label = textLabels.get(position);



                // Perform different tasks based on the clicked tv
                switch (position) {
                    case 0:
                        Intent history = new Intent(MainActivity.this, AboutTokat.class);
                        startActivity(history);
                        break;
                    case 1:
                        Intent historicalplaces = new Intent(MainActivity.this, Tokat_places.class);
                        startActivity(historicalplaces);
                        break;
                    case 2:
                        Intent famousfood= new Intent(MainActivity.this, Tokatfood.class);
                        startActivity(famousfood);
                        break;
                    case 3:
                        Intent dessert = new Intent(MainActivity.this, Tokatdessert.class);
                        startActivity(dessert);
                        break;
                }
            }
        });

        list.setAdapter(adapter);
    }

    private class tvListAdapter extends ArrayAdapter<String> {
        private final Context context;
        private final List<String> textLabels;
        private final View.OnClickListener textViewClickListener;

        public tvListAdapter(MainActivity context, List<String> textLabels, View.OnClickListener textViewClickListener) {
            super(context, -1, textLabels);
            this.context = context;
            this.textLabels = textLabels;
            this.textViewClickListener = textViewClickListener;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView btn_item;

            if (convertView == null) {
                btn_item = new TextView(context);
                btn_item.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
            } else {
                btn_item = (TextView) convertView;
            }

            String label = getItem(position);
            btn_item.setText(label);
            btn_item.setTag(position);
            btn_item.setOnClickListener(textViewClickListener);

            btn_item.setTypeface(Typeface.create("cursive", Typeface.NORMAL));
            btn_item.setBackgroundColor(Color.WHITE);
            btn_item.setGravity(Gravity.CENTER);
            btn_item.setPadding(15,15,15,15);
            btn_item.setTextSize(TypedValue.COMPLEX_UNIT_SP,34);
            return btn_item;
        }
    }
}