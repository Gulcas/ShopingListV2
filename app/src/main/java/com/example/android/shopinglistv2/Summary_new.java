package com.example.android.shopinglistv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rgran on 15.01.2018.
 */

public class Summary_new extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    int a = VegetablesActivity.getVariable();

    private class Count {
        ArrayList<Integer> zamowienie = new ArrayList<>(); //list for quantity
        ArrayList<String> zamownienieString = new ArrayList<>(); //list for quantity names

        void countMethod(int a, String aString) {
            zamowienie.add(a);
        }
    }
}