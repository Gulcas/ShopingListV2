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

        /**TODO- dodać pozostałe produkty do listy podsumowującej zamówienie
         * zostały już dodane warzywa i owoce, pozostaje chleb, napoje i słodkości */
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
        //TODO dopisać kolejne if statementy sprawdzające co jeszcze zostaje zamówione

        else {

        }

/** Poniżej zastosowana funkcja if sprawdza czy w powyższym array znajdują się warzywka i jeżeli odpowiedź jest twierdząca to ma wyrzucić je na ekran
 * */
        int i = zamowienie.size();
        if (i >= 1) {
            displayIntString(zamowienie.get(0), zamowienieString.get(0));
        }
        if (i >= 2) {
            displayIntString2(zamowienie.get(1), zamowienieString.get(1));
        }
        if (i >= 3) {
            displayIntString3(zamowienie.get(2), zamowienieString.get(2));
        }
        if (i >= 4) {
            displayIntString4(zamowienie.get(3), zamowienieString.get(3));
        }
        if (i >= 5) {
            displayIntString5(zamowienie.get(4), zamowienieString.get(4));
        }
        if (i >= 6) {
            displayIntString6(zamowienie.get(5), zamowienieString.get(5));
        }
        if (i >= 7) {
            displayIntString7(zamowienie.get(6), zamowienieString.get(6));
        }
        if (i >= 8) {
            displayIntString8(zamowienie.get(7), zamowienieString.get(7));
        }
        if (i >= 9) {
            displayIntString9(zamowienie.get(8), zamowienieString.get(8));
        }
        if (i >= 10) {
            displayIntString10(zamowienie.get(9), zamowienieString.get(9));
        }
        if (i >= 11) {
            displayIntString11(zamowienie.get(10), zamowienieString.get(10));
        }
        if (i >= 12) {
            displayIntString12(zamowienie.get(11), zamowienieString.get(11));
        }
        if (i >= 13) {
            displayIntString13(zamowienie.get(12), zamowienieString.get(12));
        }
        if (i >= 14) {
            displayIntString14(zamowienie.get(13), zamowienieString.get(13));
        }
        if (i >= 15) {
            displayIntString15(zamowienie.get(14), zamowienieString.get(14));
        }
        if (i >= 16) {
            displayIntString16(zamowienie.get(15), zamowienieString.get(15));
        }
        if (i >= 17) {
            displayIntString17(zamowienie.get(16), zamowienieString.get(16));
        }
        if (i >= 18) {
            displayIntString18(zamowienie.get(17), zamowienieString.get(17));
        }
        if (i >= 19) {
            displayIntString19(zamowienie.get(18), zamowienieString.get(18));
        }
        if (i >= 20) {
            displayIntString20(zamowienie.get(19), zamowienieString.get(19));
        }
        if (i >= 21) {
            displayIntString21(zamowienie.get(20), zamowienieString.get(20));
        }

        TextView warzywkO = findViewById(R.id.warzywkaWroc); //tworzenie listenera który wyłapie kiedy klikniemy gózik powrotu do main activity
        warzywkO.setOnClickListener(new View.OnClickListener() {
            @Override //po kliknięciu guzika zostanie otwarta klasa vegetables
            public void onClick(View view) {
                Intent warzywaIntent = new Intent(Summary.this, MainActivity.class);
                startActivity(warzywaIntent);
            }
        });
    }
    private void displayIntString(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczba);
        TextView displayString = findViewById(R.id.summaryTextView);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString2(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaDruga);
        TextView displayString = findViewById(R.id.summaryTextViewDrugi);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString3(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaTrzecia);
        TextView displayString = findViewById(R.id.summaryTextViewTrzeci);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString4(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaCzwarta);
        TextView displayString = findViewById(R.id.summaryTextViewCzwarty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString5(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaPiata);
        TextView displayString = findViewById(R.id.summaryTextViewPiaty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString6(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaSzosta);
        TextView displayString = findViewById(R.id.summaryTextViewSzosty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString7(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaSiodma);
        TextView displayString = findViewById(R.id.summaryTextViewSiodmy);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString8(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaOsma);
        TextView displayString = findViewById(R.id.summaryTextViewOsmy);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString9(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaDziewiata);
        TextView displayString = findViewById(R.id.summaryTextViewDziewiaty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString10(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaDziesiata);
        TextView displayString = findViewById(R.id.summaryTextViewDziesiaty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString11(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaJedenasta);
        TextView displayString = findViewById(R.id.summaryTextViewJedenasty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString12(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaDwunasta);
        TextView displayString = findViewById(R.id.summaryTextViewDwunasty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString13(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaTrzynasta);
        TextView displayString = findViewById(R.id.summaryTextViewTrzynasty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString14(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaCzternasta);
        TextView displayString = findViewById(R.id.summaryTextViewCzternasty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString15(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaPietnasta);
        TextView displayString = findViewById(R.id.summaryTextViewPietnasty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString16(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaSzesnasta);
        TextView displayString = findViewById(R.id.summaryTextViewSzesnasty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString17(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaSiedemnasta);
        TextView displayString = findViewById(R.id.summaryTextViewSiedemnasty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString18(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaOsiemnasta);
        TextView displayString = findViewById(R.id.summaryTextViewOsiemnasty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString19(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaDziewietnasta);
        TextView displayString = findViewById(R.id.summaryTextViewDziewietnasty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString20(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaDwudziesta);
        TextView displayString = findViewById(R.id.summaryTextViewDwudziesty);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }
    private void displayIntString21(int i, String s) {
        TextView displayNumber = findViewById(R.id.summaryLiczbaDwudziestaPierwsza);
        TextView displayString = findViewById(R.id.summaryTextViewDwudziestyPierwszy);
        displayNumber.setText("" + i);
        displayString.setText("" + s);
    }

}

//należy dodać akcję do wysyłania po kliknięciu guzika







