package com.example.chiecoshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {

    private double beforeTaxTotal;
    private double tpsTaxTotal;
    private double tvqTaxTotal;
    private double afterTaxTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        //Receive the total amount of the items purchased
        Intent intent = getIntent();
        beforeTaxTotal = intent.getDoubleExtra("beforeTax", 0);

        //Call methods
        beforeTax();
        tpsTax();
        tvqTax();
        afterTax();
    }

    //Display the total amount before taxes
    public void beforeTax() {
        TextView beforeView = findViewById(R.id.checkoutPage_beforeTaxValue);
        beforeView.setText(String.format("$%.2f", beforeTaxTotal));
    }

    //Calculate and display the TPS taxes
    public void tpsTax() {
        TextView tpsView = findViewById(R.id.checkoutPage_TPStaxValue);
        tpsTaxTotal = beforeTaxTotal * 0.05;
        tpsView.setText(String.format("$%.2f", tpsTaxTotal));
    }

    //Calculate and display the TVQ taxes
    public void tvqTax() {
        TextView tvqView = findViewById(R.id.checkoutPage_TVQtaxValue);
        tvqTaxTotal = beforeTaxTotal * 0.09975;
        tvqView.setText(String.format("$%.2f", tvqTaxTotal));
    }

    //Calculate and display the total amount after taxes
    public void afterTax() {
        TextView afterView = findViewById(R.id.checkoutPage_afterTaxValue);
        afterTaxTotal = beforeTaxTotal + tpsTaxTotal + tvqTaxTotal;
        afterView.setText(String.format("$%.2f", afterTaxTotal));
    }
}
