package com.example.android.shopinglistv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rgran on 21.12.2017.
 */

public class VegetablesActivity extends AppCompatActivity {


    private static int tomatoQuantity; //tworzę statyczną zmienną która wskazuje ilość zamówionych pomidorów
    // i zostaje przekazana do innej klasy
    private static int onionQuantity; //między klasowa zmienna cebulowa
    private static int cocumberQuntity;
    private static int potatoQuantity;
    private static int paprikaQuantity;
    private static int parsleyQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetables);
    }

    //Ta metoda wywołana jest przez naciśnięcie increment i dodaje 1 do variable int określnej na początku jako public
    public void increment(View v) {
        if (tomatoQuantity == 9) { //Zakładam funkcję if. Jeżeli ilość dorówna 10 wyświetli krótki Toast
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        tomatoQuantity = tomatoQuantity + 1;
        display(tomatoQuantity);
    }

    public void incrementOnion(View v) {
        if (onionQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        onionQuantity++;
        displayOnion(onionQuantity);
    }

    public void incrementCocumber(View v) {
        if (cocumberQuntity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        cocumberQuntity++;
        displayCocumber(cocumberQuntity);
    }

    public void incrementPotato(View v) {
        if (tomatoQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        potatoQuantity++;
        displayPotato(potatoQuantity);
    }

    public void incrementPaprika(View v) {
        if (paprikaQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        paprikaQuantity++;
        displayPaprika(paprikaQuantity);
    }

    public void incrementParsley(View v) {
        if (parsleyQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        parsleyQuantity++;
        displayParsley(parsleyQuantity);
    }


    //Ta metoda wywołana jest przez naciśnięcie decrement i odejmuje 1 od variable int określonej na początku jako public
    public void decrement(View v) {
        if (tomatoQuantity < 1) { //Zakładam funkcję if. Jeżeli quantityBread jest mniejsze niż 1 wyświetli się krótki Toast i variable zmieni się na 0.
            tomatoQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        tomatoQuantity = tomatoQuantity - 1;
        display(tomatoQuantity);
    }

    public void decrementOnion(View v) {
        if (onionQuantity < 1) {
            onionQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        onionQuantity--;
        displayOnion(onionQuantity);
    }

    public void decrementCocumber(View v) {
        if (cocumberQuntity < 1) {
            cocumberQuntity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        cocumberQuntity--;
        displayCocumber(cocumberQuntity);
    }

    public void decrementPotato(View v) {
        if (potatoQuantity < 1) {
            potatoQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        potatoQuantity--;
        displayPotato(potatoQuantity);
    }

    public void decrementPaprika(View v) {
        if (paprikaQuantity < 1) {
            paprikaQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        paprikaQuantity--;
        displayPaprika(paprikaQuantity);
    }

    public void decrementParsley(View v) {
        if (parsleyQuantity < 0) {
            parsleyQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        parsleyQuantity--;
        displayParsley(parsleyQuantity);
    }

    //Ta metoda wyświetla wartość określoną w "display"
    private void display(int i) {
        TextView quantityBreadTextView = (TextView) findViewById(R.id.tomatoNumber);
        quantityBreadTextView.setText("" + i);
    }

    private void displayOnion(int numberOnion) {
        TextView quantityOnion = (TextView) findViewById(R.id.onionNumber);
        quantityOnion.setText("" + numberOnion);
    }

    private void displayCocumber(int numberCocumber) {
        TextView quantityCocumber = (TextView) findViewById(R.id.cocumberNumber);
        quantityCocumber.setText("" + numberCocumber);
    }

    private void displayPotato(int numberPotato) {
        TextView quantityPotato = (TextView) findViewById(R.id.potatoNumber);
        quantityPotato.setText("" + numberPotato);
    }

    private void displayPaprika(int numberPaprika) {
        TextView quantityPaprika = (TextView) findViewById(R.id.paprikaNumber);
        quantityPaprika.setText("" + numberPaprika);
    }

    private void displayParsley(int numberParsley) {
        TextView quantityParsley = (TextView) findViewById(R.id.parsleyNumber);
        quantityParsley.setText("" + numberParsley);
    }

    //funkcja pozwala użyć variable przez inną klasę
    public static int getVariable() {
        return tomatoQuantity;
    }

    public static int getVariableOnion() {
        return onionQuantity;
    }

    public static int getVariableCocumber() {
        return cocumberQuntity;
    }

    public static int getVariablePotato() {
        return potatoQuantity;
    }

    public static int getVariablePaprika() {
        return paprikaQuantity;
    }

    public static int getVariableParsley() {
        return parsleyQuantity;
    }

    //metoda przechodzi do klasy summary
    public void backClick(View v) {
        Intent summaryIntent = new Intent(VegetablesActivity.this, Summary.class);
        startActivity(summaryIntent);
    }

    public void backToMainClick(View v) {
        Intent mainIntent = new Intent(VegetablesActivity.this, MainActivity.class);
        startActivity(mainIntent);
    }


}







