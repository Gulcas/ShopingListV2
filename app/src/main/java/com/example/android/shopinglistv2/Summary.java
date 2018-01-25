package com.example.android.shopinglistv2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by rgran on 15.01.2018.
 */

public class Summary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        int iTomato = VegetablesActivity.getVariable(); //przywołujemy variable z innej klasy
        int iOnion = VegetablesActivity.getVariableOnion();
        int iCocumber = VegetablesActivity.getVariableCocumber();
        int iPotato = VegetablesActivity.getVariablePotato();

        //stworzę listę array do której wcielone zostaną wszystkie zamówione produkty oraz ich ilości
        ArrayList<Integer> zamowienie = new ArrayList<>(); //arraylist dla ilości
        ArrayList<String> zamowienieString = new ArrayList<>(); //arraylist dla nazw

        if (iTomato > 0) { //funkcja if sprawdza czy dane warzywko zostało zamówione--> należy utworzyć funkcje else if dla pozostałych zamówień
            zamowienie.add(iTomato); //wcielenie ilości zamówionego warzywka
            zamowienieString.add(getString(R.string.tomato)); //wcielenie do listy nazwy zamówionego warzywka
        }
        if (iOnion > 0) {
            zamowienie.add(iOnion);
            zamowienieString.add(getString(R.string.onion));
        }
        if (iCocumber > 0) {
            zamowienie.add(iCocumber);
            zamowienieString.add(getString(R.string.cocumber));
        }
        if (iPotato > 0) {
            zamowienie.add(iPotato);
            zamowienieString.add(getString(R.string.potato));
        }
        //dopisać kolejne if statementy sprawdzające co jeszcze zostaje zamówione

        else {

        }

/** Poniżej zastosowana funkcja if sprawdza czy w powyższym array znajdują się warzywka i jeżeli odpowiedź jest twierdząca to ma wyrzucić je na ekran
 * */
        int i = zamowienie.size();
//        for (int ab = zamowienie.size(); ab > 0; ab--) {

        if (i == 1) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
        }

        if (i == 2) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
        }

        if (i == 3) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
            displayIntThree(zamowienie.get(2));
            displayStringThree(zamowienieString.get(2));
        }

        if (i == 4) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
            displayIntThree(zamowienie.get(2));
            displayStringThree(zamowienieString.get(2));
            displayIntFour(zamowienie.get(3));
            displayStringFour(zamowienieString.get(3));
        }

//            if ((iTomato > 0) && (iOnion > 0)) {  //jeżeli są zamawiane tomatosy i oniony to logiczne jest że mają miejsce 1 w array-->pamiętać że array zaczyna się od 0
//                displayIntOne(zamowienie.get(0));
//                displayStringOne(zamowienieString.get(0));
//                displayIntTwo(zamowienie.get(1));
//                displayStringTwo(zamowienieString.get(1));
//            } else if ((iTomato == 0) && (iOnion > 0)) { //jeżeli tomatosy są nie zamawiane to być może oniony sa zamawiane i to one mają miejsce 0 w arrayu
//                displayIntOne(zamowienie.get(0));
//                displayStringOne(zamowienieString.get(0));
//            } else if ((iTomato > 0) && (iOnion == 0)) {  //sprawdzamy czy tomatosy są zamawiane
//                displayIntOne(zamowienie.get(0));
//                displayStringOne(zamowienieString.get(0));
//            } //znaleźć rozwiązanie jak wyczaić które warzywka są zamawiane, a które nie
//            else {
//                displayIntOne(0);
//                displayIntTwo(0);
//                displayStringOne(getString(R.string.nothingOrdered));
//                displayStringTwo(getString(R.string.nothingOrdered));
//            }


//        }

        TextView warzywkO = findViewById(R.id.warzywkaWroc); //tworzenie listenera który wyłapie kiedy klikniemy gózik powrotu do main activity
        warzywkO.setOnClickListener(new View.OnClickListener() {
            @Override //po kliknięciu guzika zostanie otwarta klasa vegetables
            public void onClick(View view) {
                Intent warzywaIntent = new Intent(Summary.this, MainActivity.class);
                startActivity(warzywaIntent);
            }
        });
    }


    //metoda display rzutuje w miejsce określonego pola w xml'u wartość utworzoną wcześniej
    private void displayIntOne(int i) {
        TextView vegetableNumber = (TextView) findViewById(R.id.summaryLiczba);
        vegetableNumber.setText("" + i);
    }

    private void displayIntTwo(int i) {
        TextView vegetableNumberTwo = (TextView) findViewById(R.id.summaryLiczbaDruga);
        vegetableNumberTwo.setText("" + i);
    }

    private void displayIntThree(int i) {
        TextView vegetableNumberThree = (TextView) findViewById(R.id.summaryLiczbaTrzecia);
        vegetableNumberThree.setText("" + i);
    }

    private void displayIntFour(int i) {
        TextView vegetableNumberFour = (TextView) findViewById(R.id.summaryLiczbaCzwarta);
        vegetableNumberFour.setText("" + i);
    }

    private void diplayIntFive(int i) {
        TextView vegetableNumberFive = (TextView) findViewById(R.id.summaryLiczbaPiata);
        vegetableNumberFive.setText("" + i);
    }

    private void displayIntSix(int i) {
        TextView vegetablesNumberSix = (TextView) findViewById(R.id.summaryLiczbaSzosta);
        vegetablesNumberSix.setText("" + i);
    }

    private void displayIntSeven(int i) {
        TextView vegetablesNumberSeven = (TextView) findViewById(R.id.summaryLiczbaSiodma);
        vegetablesNumberSeven.setText("" + i);
    } //dopisać funkcje na pozostąłe wyświetlanie intów i stringów poniżej

    private void displayStringOne(String s) {
        TextView vegetableName = (TextView) findViewById(R.id.summaryTextView);
        vegetableName.setText("" + s);
    }

    private void displayStringTwo(String s) {
        TextView vegetableNameTwo = (TextView) findViewById(R.id.summaryTextViewDrugi);
        vegetableNameTwo.setText("" + s);
    }

    private void displayStringThree(String s) {
        TextView vegetableNameThree = (TextView) findViewById(R.id.summaryTextViewTrzeci);
        vegetableNameThree.setText("" + s);
    }

    private void displayStringFour(String s) {
        TextView vegetableNameFour = (TextView) findViewById(R.id.summaryTextViewCzwarty);
        vegetableNameFour.setText("" + s);
    }

    private void displayStringFive(String s) {
        TextView vegetableNameFive = (TextView) findViewById(R.id.summaryTextViewPiaty);
        vegetableNameFive.setText("" + s);
    }

    private void displayStringSix(String s) {
        TextView vegetableNameSix = (TextView) findViewById(R.id.summaryTextViewSzosty);
        vegetableNameSix.setText("" + s);
    }

    private void displayStringSeven(String s) {
        TextView vegetableNameSeven = (TextView) findViewById(R.id.summaryTextViewSiodmy);
        vegetableNameSeven.setText("" + s);
    }
    //dodać kolejne pola do podsumowania zamówienia
}

//należy dodać akcję do wysyłania po kliknięciu guzika







