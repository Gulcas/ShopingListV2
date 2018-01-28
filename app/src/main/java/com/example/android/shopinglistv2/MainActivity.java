package com.example.android.shopinglistv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView warzywka = findViewById(R.id.vegetables);
        warzywka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent warzywaIntent = new Intent(MainActivity.this, VegetablesActivity.class);
                startActivity(warzywaIntent);
//                Toast.makeText(MainActivity.this, getString(R.string.changeClass), Toast.LENGTH_SHORT).show(); // toast message usuwany bo wkurwia usera
            }
        });

        TextView owocki = findViewById(R.id.fruits);
        owocki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fruitIntent = new Intent(MainActivity.this, FruitsActivity.class);
                startActivity(fruitIntent);
            }
        });

        TextView chlebek = findViewById(R.id.bread);
        chlebek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent breadIntent = new Intent(MainActivity.this, BreadActivity.class);
                startActivity(breadIntent);
            }
        });

        TextView napoje = findViewById(R.id.drinks);
        napoje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drinksIntent = new Intent(MainActivity.this, DrinksActivity.class);
                startActivity(drinksIntent);
            }
        });


        TextView slodkosci = findViewById(R.id.sweets);
        slodkosci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sweetsIntent = new Intent(MainActivity.this, SweetsActivity.class);
                startActivity(sweetsIntent);
            }
        });


        TextView podsumowanie = findViewById(R.id.summary);
        podsumowanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent summaryIntent = new Intent(MainActivity.this, Summary.class);
                startActivity(summaryIntent);
            }
        });

        final TextView odbiorca = findViewById(R.id.orderReceiverButton);
        odbiorca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent odbiorcaIntent = new Intent(MainActivity.this, ReceiverActivity.class);
                startActivity(odbiorcaIntent);
            }
        });


    }


}
