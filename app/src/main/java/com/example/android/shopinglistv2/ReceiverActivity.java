package com.example.android.shopinglistv2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by rgran on 26.01.2018.
 */

public class ReceiverActivity extends AppCompatActivity {
    private static int receiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receiver);

        EditText youNameText = (EditText) findViewById(R.id.receiverNumber);
        String editTextValue = youNameText.getText().toString();


    }
    public static int getVariableReceiverNumber() {
        return receiver;
    }
}