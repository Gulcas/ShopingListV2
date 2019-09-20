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

public class Summary_new extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        /**TODO- dodać pozostałe produkty do listy podsumowującej zamówienie */
        int iTomato = VegetablesActivity.getVariable(); //przywołujemy variable z innej klasy
        int iOnion = VegetablesActivity.getVariableOnion();
        int iCocumber = VegetablesActivity.getVariableCocumber();
        int iPotato = VegetablesActivity.getVariablePotato();
        int iPaprika = VegetablesActivity.getVariablePaprika();
        int iParsley = VegetablesActivity.getVariableParsley();
        int iChive = VegetablesActivity.getVariableChive();
        int iIceberg = VegetablesActivity.getVariableIceberg();
        int iGarlic = VegetablesActivity.getVariableGarlic();
        int iApple = FruitsActivity.getVariableApple();
        int iBanana = FruitsActivity.getVariableBanana();
        int iLemon = FruitsActivity.getVariableLemon();
        int iMandarin = FruitsActivity.getVariableMandarin();
        int iOrange = FruitsActivity.getVariableOrange();
        int iPeach = FruitsActivity.getVariablePeach();
        int iNectarine = FruitsActivity.getVariableNectarine();
        int iPear = FruitsActivity.getVariablePear();
        int iGrape = FruitsActivity.getVariableGrape();
        int iWatermelon = FruitsActivity.getVariableWatermelon();
        int iCherry = FruitsActivity.getVariableCherry();
        int iSweetcherry = FruitsActivity.getVariableSweetcherry();
        int iKiwi = FruitsActivity.getVariableKiwi();
        int iStrawberry = FruitsActivity.getVariableStrawberry();
        int iPineapple = FruitsActivity.getVariablePineapple();
        int iApricot = FruitsActivity.getVariableApricot();

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
        if (iPaprika > 0) {
            zamowienie.add(iPaprika);
            zamowienieString.add(getString(R.string.paprika));
        }
        if (iParsley > 0) {
            zamowienie.add(iParsley);
            zamowienieString.add(getString(R.string.parsley));
        }
        if (iChive > 0) {
            zamowienie.add(iChive);
            zamowienieString.add(getString(R.string.chive));
        }
        if (iIceberg > 0) {
            zamowienie.add(iIceberg);
            zamowienieString.add(getString(R.string.iceberg));
        }
        if (iGarlic > 0) {
            zamowienie.add(iGarlic);
            zamowienieString.add(getString(R.string.garlic));
        }
        if (iApple > 0) {
            zamowienie.add(iApple);
            zamowienieString.add(getString(R.string.apple));
        }
        if (iBanana > 0) {
            zamowienie.add(iBanana);
            zamowienieString.add(getString(R.string.banana));
        }
        if (iLemon > 0) {
            zamowienie.add(iLemon);
            zamowienieString.add(getString(R.string.lemon));
        }
        if (iMandarin > 0) {
            zamowienie.add(iMandarin);
            zamowienieString.add(getString(R.string.mandarin));
        }
        if (iOrange > 0) {
            zamowienie.add(iOrange);
            zamowienieString.add(getString(R.string.orange));
        }
        if (iPeach > 0) {
            zamowienie.add(iPeach);
            zamowienieString.add(getString(R.string.peach));
        }
        if (iNectarine > 0) {
            zamowienie.add(iNectarine);
            zamowienieString.add(getString(R.string.nectarine));
        }
        if (iPear > 0) {
            zamowienie.add(iPear);
            zamowienieString.add(getString(R.string.pear));
        }
        if (iGrape > 0) {
            zamowienie.add(iGrape);
            zamowienieString.add(getString(R.string.grape));
        }
        if (iWatermelon > 0) {
            zamowienie.add(iWatermelon);
            zamowienieString.add(getString(R.string.watermelon));
        }
        if (iCherry > 0) {
            zamowienie.add(iCherry);
            zamowienieString.add(getString(R.string.cherry));
        }
        if (iSweetcherry > 0) {
            zamowienie.add(iSweetcherry);
            zamowienieString.add(getString(R.string.sweetcherry));
        }
        if (iKiwi > 0) {
            zamowienie.add(iKiwi);
            zamowienieString.add(getString(R.string.kiwi));
        }
        if (iStrawberry > 0) {
            zamowienie.add(iStrawberry);
            zamowienieString.add(getString(R.string.strawberry));
        }
        if (iPineapple > 0) {
            zamowienie.add(iPineapple);
            zamowienieString.add(getString(R.string.pineapple));
        }
        if (iApricot > 0) {
            zamowienie.add(iApricot);
            zamowienieString.add(getString(R.string.apricot));
        }
        //dopisać kolejne if statementy sprawdzające co jeszcze zostaje zamówione

        else {

        }

/** Poniżej zastosowana funkcja if sprawdza czy w powyższym array znajdują się warzywka i jeżeli odpowiedź jest twierdząca to ma wyrzucić je na ekran
 * */
        int i = zamowienie.size();

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

        if (i == 5) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
            displayIntThree(zamowienie.get(2));
            displayStringThree(zamowienieString.get(2));
            displayIntFour(zamowienie.get(3));
            displayStringFour(zamowienieString.get(3));
            displayIntFive(zamowienie.get(4));
            displayStringFive(zamowienieString.get(4));
        }

        if (i == 6) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
            displayIntThree(zamowienie.get(2));
            displayStringThree(zamowienieString.get(2));
            displayIntFour(zamowienie.get(3));
            displayStringFour(zamowienieString.get(3));
            displayIntFive(zamowienie.get(4));
            displayStringFive(zamowienieString.get(4));
            displayIntSix(zamowienie.get(5));
            displayStringSix(zamowienieString.get(5));
        }

        if (i == 7) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
            displayIntThree(zamowienie.get(2));
            displayStringThree(zamowienieString.get(2));
            displayIntFour(zamowienie.get(3));
            displayStringFour(zamowienieString.get(3));
            displayIntFive(zamowienie.get(4));
            displayStringFive(zamowienieString.get(4));
            displayIntSix(zamowienie.get(5));
            displayStringSix(zamowienieString.get(5));
            displayIntSeven(zamowienie.get(6));
            displayStringSeven(zamowienieString.get(6));
        }
        if (i == 8) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
            displayIntThree(zamowienie.get(2));
            displayStringThree(zamowienieString.get(2));
            displayIntFour(zamowienie.get(3));
            displayStringFour(zamowienieString.get(3));
            displayIntFive(zamowienie.get(4));
            displayStringFive(zamowienieString.get(4));
            displayIntSix(zamowienie.get(5));
            displayStringSix(zamowienieString.get(5));
            displayIntSeven(zamowienie.get(6));
            displayStringSeven(zamowienieString.get(6));
            displayIntEight(zamowienie.get(7));
            displayStringEight(zamowienieString.get(7));
        }
        if (i == 9) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
            displayIntThree(zamowienie.get(2));
            displayStringThree(zamowienieString.get(2));
            displayIntFour(zamowienie.get(3));
            displayStringFour(zamowienieString.get(3));
            displayIntFive(zamowienie.get(4));
            displayStringFive(zamowienieString.get(4));
            displayIntSix(zamowienie.get(5));
            displayStringSix(zamowienieString.get(5));
            displayIntSeven(zamowienie.get(6));
            displayStringSeven(zamowienieString.get(6));
            displayIntEight(zamowienie.get(7));
            displayStringEight(zamowienieString.get(7));
            displayIntNine(zamowienie.get(8));
            displayStringNine(zamowienieString.get(8));
        }
        if (i == 10) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
            displayIntThree(zamowienie.get(2));
            displayStringThree(zamowienieString.get(2));
            displayIntFour(zamowienie.get(3));
            displayStringFour(zamowienieString.get(3));
            displayIntFive(zamowienie.get(4));
            displayStringFive(zamowienieString.get(4));
            displayIntSix(zamowienie.get(5));
            displayStringSix(zamowienieString.get(5));
            displayIntSeven(zamowienie.get(6));
            displayStringSeven(zamowienieString.get(6));
            displayIntEight(zamowienie.get(7));
            displayStringEight(zamowienieString.get(7));
            displayIntNine(zamowienie.get(8));
            displayStringNine(zamowienieString.get(8));
            displayIntTen(zamowienie.get(9));
            displayStringTen(zamowienieString.get(9));
        }
        if (i == 11) {
            displayIntOne(zamowienie.get(0));
            displayStringOne(zamowienieString.get(0));
            displayIntTwo(zamowienie.get(1));
            displayStringTwo(zamowienieString.get(1));
            displayIntThree(zamowienie.get(2));
            displayStringThree(zamowienieString.get(2));
            displayStringFour(zamowienieString.get(3));
            displayIntFive(zamowienie.get(4));
            displayStringFive(zamowienieString.get(4));
            displayIntSix(zamowienie.get(5));
            displayStringSix(zamowienieString.get(5));
            displayIntSeven(zamowienie.get(6));
            displayStringSeven(zamowienieString.get(6));
            displayIntEight(zamowienie.get(7));
            displayStringEight(zamowienieString.get(7));
            displayIntNine(zamowienie.get(8));
            displayStringNine(zamowienieString.get(8));
            displayIntTen(zamowienie.get(9));
            displayStringTen(zamowienieString.get(9));
            displayIntEleven(zamowienie.get(10));
            displayStringEleven(zamowienieString.get(10));
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
                Intent warzywaIntent = new Intent(Summary_new.this, MainActivity.class);
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

    private void displayIntFive(int i) {
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
    }

    private void displayIntEight(int i) {
        TextView vegetablesNumberEight = (TextView) findViewById(R.id.summaryLiczbaOsma);
        vegetablesNumberEight.setText("" + i);
    }

    private void displayIntNine(int i) {
        TextView vegetablesNumberNine = (TextView) findViewById(R.id.summaryLiczbaDziewiata);
        vegetablesNumberNine.setText("" + i);
    }

    private void displayIntTen(int i) {
        TextView vegetablesNumberTen = (TextView) findViewById(R.id.summaryLiczbaDziesiata);
        vegetablesNumberTen.setText("" + i);
    }

    private void displayIntEleven(int i) {
        TextView vegetablesNumberEleven = (TextView) findViewById(R.id.summaryLiczbaJedenasta);
        vegetablesNumberEleven.setText("" + i);
    }
    //dopisać funkcje na pozostąłe wyświetlanie intów i stringów poniżej

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

    private void displayStringEight(String s) {
        TextView vegetableNameEight = (TextView) findViewById(R.id.summaryTextViewOsmy);
        vegetableNameEight.setText("" + s);
    }

    private void displayStringNine(String s) {
        TextView vegetableNameNine = (TextView) findViewById(R.id.summaryTextViewDziewiaty);
        vegetableNameNine.setText("" + s);
    }

    private void displayStringTen(String s) {
        TextView vegetablesNameTen = (TextView) findViewById(R.id.summaryTextViewDziesiaty);
        vegetablesNameTen.setText("" + s);
    }
    private void displayStringEleven(String s) {
        TextView vegetablesNameEleven = (TextView) findViewById(R.id.summaryTextViewJedenasty);
        vegetablesNameEleven.setText("" + s);
    }
    //dodać kolejne pola do podsumowania zamówienia

}

//należy dodać akcję do wysyłania po kliknięciu guzika







