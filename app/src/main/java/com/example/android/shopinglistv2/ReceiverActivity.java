package com.example.android.shopinglistv2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rgran on 26.01.2018.
 */


public class ReceiverActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receiver);


        EditText iInter = (EditText) findViewById(R.id.receiverNumber);
        String receiver = iInter.getText().toString();

//        // dodanie danych do SharedPref- pamięci aplikacji
//        SharedPreferences pref = getSharedPreferences("my Prefs", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = pref.edit();
//        editor.putString("numer", receiver);
//        editor.commit();
//        editor.apply();
//
//        String myIntValue = pref.getString("numer", ""); // wywołanie danych z pamięci aplikacji
//
//        TextView adam = (TextView) findViewById(R.id.receiverTextView); //wyrzucenie ich na ekran
//        adam.setText("" + myIntValue);
    }



    public void openMain(View v) {
        Intent odbiorcaIntent = new Intent(ReceiverActivity.this, MainActivity.class);
        startActivity(odbiorcaIntent);
    }
}
