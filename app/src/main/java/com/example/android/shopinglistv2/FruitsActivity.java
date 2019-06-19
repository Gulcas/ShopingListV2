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

public class FruitsActivity extends AppCompatActivity {

    private static int appleQuantity;
    private static int bananaQuantity;
    private static int lemonQuantity;
    private static int mandarinQuantity;
    private static int orangeQuantity;
    private static int peachQuantity;
    private static int nectarineQuantity;
    private static int pearQuantity;
    private static int grapeQuantity;
    private static int watermelonQuantity;
    private static int cherryQuantity;
    private static int sweetcherryQuantity;
    private static int kiwiQuantity;
    private static int strawberryQuantity;
    private static int pineappleQuantity;
    private static int apricotQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);
    }

    public void incrementApple(View v) {
        if (appleQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        appleQuantity = appleQuantity + 1;
        displayApple(appleQuantity);
    }

    public void incrementBanana(View v) {
        if (bananaQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        bananaQuantity = bananaQuantity + 1;
        displayBanana(bananaQuantity);
    }

    public void incrementLemon(View v) {
        if (lemonQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        lemonQuantity = lemonQuantity + 1;
        displayLemon(lemonQuantity);
    }

    public void incrementMandarin(View v) {
        if (mandarinQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        mandarinQuantity = mandarinQuantity + 1;
        displayMandarin(mandarinQuantity);
    }

    public void incrementOrange(View v) {
        if (orangeQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        orangeQuantity = orangeQuantity + 1;
        displayOrange(orangeQuantity);
    }

    public void incrementPeach(View v) {
        if (peachQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        peachQuantity = peachQuantity + 1;
        displayPeach(peachQuantity);
    }

    public void incrementNectarine(View v) {
        if (nectarineQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        nectarineQuantity = nectarineQuantity + 1;
        displayNectarine(nectarineQuantity);
    }

    public void incrementPear(View v) {
        if (pearQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        pearQuantity = pearQuantity + 1;
        displayPear(pearQuantity);
    }

    public void incrementGrape(View v) {
        if (grapeQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        grapeQuantity = grapeQuantity + 1;
        displayGrape(grapeQuantity);
    }

    public void incrementWatermelon(View v) {
        if (watermelonQuantity == 9) {
            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
            return;
        }
        watermelonQuantity = watermelonQuantity + 1;
        displayWatermelon(watermelonQuantity);
    }
//     public void incrementCherry(View v) {
//        if (cherryQuantity == 9) {
//            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        cherryQuantity = cherryQuantity + 1;
//        displayCherry(cherryQuantity);
//    }
//     public void incrementSweetcherry(View v) {
//        if (sweetcherryQuantity == 9) {
//            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        sweetcherryQuantity = sweetcherryQuantity + 1;
//        displaySweetcherry(sweetcherryQuantity);
//    }
//     public void incrementKiwi(View v) {
//        if (kiwiQuantity == 9) {
//            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        kiwiQuantity = kiwiQuantity + 1;
//        displayKiwi(kiwiQuantity);
//    }
//     public void incrementStrawberry(View v) {
//        if (strawberryQuantity == 9) {
//            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        strawberryQuantity = strawberryQuantity + 1;
//        displayStrawberry(strawberryQuantity);
//    }
//     public void incrementPineapple(View v) {
//        if (pineappleQuantity == 9) {
//            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        pineappleQuantity = pineappleQuantity + 1;
//        displayPineapple(pineappleQuantity);
//    }
//     public void incrementApricot(View v) {
//        if (apricotQuantity == 9) {
//            Toast.makeText(this, getString(R.string.to_many), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        apricotQuantity = apricotQuantity + 1;
//        displayApricot(apricotQuantity);
//    }

    public void decrementApple(View v) {
        if (appleQuantity < 1) {
            appleQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        appleQuantity = appleQuantity - 1;
        displayApple(appleQuantity);
    }

    public void decrementBanana(View v) {
        if (bananaQuantity < 1) {
            bananaQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        bananaQuantity = bananaQuantity - 1;
        displayBanana(bananaQuantity);
    }

    public void decrementLemon(View v) {
        if (lemonQuantity < 1) {
            lemonQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        lemonQuantity = lemonQuantity - 1;
        displayLemon(lemonQuantity);
    }

    public void decrementMandarin(View v) {
        if (mandarinQuantity < 1) {
            mandarinQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        mandarinQuantity = mandarinQuantity - 1;
        displayMandarin(mandarinQuantity);
    }

    public void decrementOrange(View v) {
        if (orangeQuantity < 1) {
            orangeQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        orangeQuantity = orangeQuantity - 1;
        displayOrange(orangeQuantity);
    }

    public void decrementPeach(View v) {
        if (peachQuantity < 1) {
            peachQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        peachQuantity = peachQuantity - 1;
        displayPeach(peachQuantity);
    }

    public void decrementNectarine(View v) {
        if (nectarineQuantity < 1) {
            nectarineQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        nectarineQuantity = nectarineQuantity - 1;
        displayNectarine(nectarineQuantity);
    }

    public void decrementPear(View v) {
        if (pearQuantity < 1) {
            pearQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        pearQuantity = pearQuantity - 1;
        displayPear(pearQuantity);
    }

    public void decrementGrape(View v) {
        if (grapeQuantity < 1) {
            grapeQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        grapeQuantity = grapeQuantity - 1;
        displayGrape(grapeQuantity);
    }

    public void decrementWatermelon(View v) {
        if (watermelonQuantity < 1) {
            watermelonQuantity = 0;
            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
            return;
        }
        watermelonQuantity = watermelonQuantity - 1;
        displayWatermelon(watermelonQuantity);
    }

    //        public void decrementCherry(View v) {
//        if (cherryQuantity < 1) {
//            cherryQuantity = 0;
//            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        cherryQuantity = cherryQuantity - 1;
//        displayCherry(cherryQuantity);
//    }
//
//        public void decrementSweetcherry(View v) {
//        if (sweetcherryQuantity < 1) {
//            sweetcherryQuantity = 0;
//            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        sweetcherryQuantity = sweetcherryQuantity - 1;
//        displaySweetcherry(sweetcherryQuantity);
//    }
//
//        public void decrementKiwi(View v) {
//        if (kiwiQuantity < 1) {
//            kiwiQuantity = 0;
//            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        kiwiQuantity = kiwiQuantity - 1;
//        displayKiwi(kiwiQuantity);
//    }
//
//        public void decrementStrawberry(View v) {
//        if (strawberryQuantity < 1) {
//            strawberryQuantity = 0;
//            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        strawberryQuantity = strawberryQuantity - 1;
//        displayStrawberry(strwberryQuantity);
//    }
//
//        public void decrementPineapple(View v) {
//        if (pineappleQuantity < 1) {
//            pineappleQuantity = 0;
//            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        pineappleQuantity = pineappleQuantity - 1;
//        displayPineapple(pineappleQuantity);
//    }
//
//        public void decrementApricot(View v) {
//        if (apricotQuantity < 1) {
//            apricotQuantity = 0;
//            Toast.makeText(this, getString(R.string.to_low), Toast.LENGTH_SHORT).show();
//            return;
//        }
//        apricotQuantity = apricotQuantity - 1;
//        displayApricot(apricotQuantity);
//    }
    private void displayApple(int i) {
        TextView quantityAppleTextView = (TextView) findViewById(R.id.appleNumber);
        quantityAppleTextView.setText("" + i);
    }

    private void displayBanana(int i) {
        TextView quantityBananaTextView = (TextView) findViewById(R.id.bananaNumber);
        quantityBananaTextView.setText("" + i);
    }

    private void displayLemon(int i) {
        TextView quantityLemonTextView = (TextView) findViewById(R.id.lemonNumber);
        quantityLemonTextView.setText("" + i);
    }

    private void displayOrange(int i) {
        TextView quantityOrangeTextView = (TextView) findViewById(R.id.orangeNumber);
        quantityOrangeTextView.setText("" + i);
    }

    private void displayPeach(int i) {
        TextView quantityPeachTextView = (TextView) findViewById(R.id.peachNumber);
        quantityPeachTextView.setText("" + i);
    }

    private void displayNectarine(int i) {
        TextView quantityNectarineTextView = (TextView) findViewById(R.id.nectarineNumber);
        quantityNectarineTextView.setText("" + i);
    }

    private void displayPear(int i) {
        TextView quantityPearTextView = (TextView) findViewById(R.id.pearNumber);
        quantityPearTextView.setText("" + i);
    }

    private void displayGrape(int i) {
        TextView quantityGrapeTextView = (TextView) findViewById(R.id.grapeNumber);
        quantityGrapeTextView.setText("" + i);
    }

    private void displayWatermelon(int i) {
        TextView quantityWatermelonTextView = (TextView) findViewById(R.id.watermelonNumber);
        quantityWatermelonTextView.setText("" + i);
    }

    private void displayMandarin(int i) {
        TextView quanitityMandarinTextView = findViewById(R.id.mandarinNumber);
        quanitityMandarinTextView.setText("" + i);
    }

    /**
     * TODO dokończyć layout w fruits.xml
     */
//    private void displayCherry(int i) {
//        TextView quantityCherryTextView = (TextView) findViewById(R.id.cherryNumber);
//        quantityCherryTextView.setText("" + i);}
//    private void displaySweetcherry(int i) {
//        TextView quantitySweetcherryTextView = (TextView) findViewById(R.id.sweetcherryNumber);
//        quantitySweetcherryTextView.setText("" + i);}
//    private void displayKiwi(int i) {
//        TextView quantityKiwiTextView = (TextView) findViewById(R.id.kiwiNumber);
//        quantityKiwiTextView.setText("" + i);}
//    private void displayStrawberry(int i ) {
//        TextView quantityStrawberryTextView = (TextView) findViewById(R.id.strawberryNumber);
//        quantityStrawberryTextView.setText("" + i);}
//    private void displayPineapple(int i) {
//        TextView quantityPineappleTextView = (TextView) findViewById(R.id.pineappleNumber);
//        quantityPineappleTextView.setText("" + i);}
//    private void displayApricot(int i) {
//        TextView quantityApricotTextView = (TextView) findViewById(R.id.apricotNumber);
//        quantityApricotTextView.setText("" + i);}
    public static int getVariableApple() {
        return appleQuantity;
    }

    public static int getVariableBanana() {
        return bananaQuantity;
    }

    public static int getVariableLemon() {
        return lemonQuantity;
    }

    public static int getVariableMandarin() {
        return mandarinQuantity;
    }

    public static int getVariableOrange() {
        return orangeQuantity;
    }

    public static int getVariablePeach() {
        return peachQuantity;
    }

    public static int getVariableNectarine() {
        return nectarineQuantity;
    }

    public static int getVariablePear() {
        return pearQuantity;
    }

    public static int getVariableGrape() {
        return grapeQuantity;
    }

    public static int getVariableWatermelon() {
        return watermelonQuantity;
    }

    public static int getVariableCherry() {
        return cherryQuantity;
    }

    public static int getVariableSweetcherry() {
        return sweetcherryQuantity;
    }

    public static int getVariableKiwi() {
        return kiwiQuantity;
    }

    public static int getVariableStrawberry() {
        return kiwiQuantity;
    }

    public static int getVariablePineapple() {
        return pineappleQuantity;
    }

    public static int getVariableApricot() {
        return apricotQuantity;
    }

    public void backClick(View v) {
        Intent summaryIntent = new Intent(this, Summary.class);
        startActivity(summaryIntent);
    }

    public void backToMainClick(View v) {
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
    }

}
