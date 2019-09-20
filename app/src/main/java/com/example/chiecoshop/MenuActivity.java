package com.example.chiecoshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuActivity extends AppCompatActivity {

    private int quantityCard1;
    private int quantityCard2;
    private int quantityCard3;
    private double priceCard1;
    private double priceCard2;
    private double priceCard3;
    private double quantityTotalCard1;
    private double quantityTotalCard2;
    private double quantityTotalCard3;
    private double beforeTaxTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void launchCheckoutActivity(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);
        intent.putExtra("beforeTax", beforeTaxTotal);
        startActivity(intent);
    }

    public void increaseCard1(View view) {
        TextView quantityText = findViewById(R.id.card1_quantity);
        quantityCard1 = Integer.parseInt(quantityText.getText().toString());
        quantityCard1++;
        quantityText.setText(Integer.toString(quantityCard1));

        TextView priceText = findViewById(R.id.card1_price);
        priceCard1 = Double.parseDouble(priceText.getText().toString());

        TextView quantityTotalText = findViewById(R.id.card1_subtotal);
        quantityTotalCard1 = Double.parseDouble(quantityTotalText.getText().toString());
        quantityTotalCard1 += priceCard1;
        quantityTotalText.setText(Double.toString(quantityTotalCard1).format("%.2f", quantityTotalCard1));
        beforeTaxTotal += priceCard1;
    }

    public void decreaseCard1(View view) {
        TextView quantityText = findViewById(R.id.card1_quantity);
        quantityCard1 = Integer.parseInt(quantityText.getText().toString());
        if (quantityCard1 > 0) {
            quantityCard1--;
            quantityText.setText(Integer.toString(quantityCard1));

            TextView priceText = findViewById(R.id.card1_price);
            priceCard1 = Double.parseDouble(priceText.getText().toString());

            TextView quantityTotalText = findViewById(R.id.card1_subtotal);
            quantityTotalCard1 = Double.parseDouble(quantityTotalText.getText().toString());
            quantityTotalCard1 -= priceCard1;
            quantityTotalText.setText(Double.toString(quantityTotalCard1).format("%.2f", quantityTotalCard1));
            beforeTaxTotal -= priceCard1;
        }
    }

    public void increaseCard2(View view) {
        TextView quantityText = findViewById(R.id.card2_quantity);
        quantityCard2 = Integer.parseInt(quantityText.getText().toString());
        quantityCard2++;
        quantityText.setText(Integer.toString(quantityCard2));

        TextView priceText = findViewById(R.id.card2_price);
        priceCard2 = Double.parseDouble(priceText.getText().toString());

        TextView quantityTotalText = findViewById(R.id.card2_subtotal);
        quantityTotalCard2 = Double.parseDouble(quantityTotalText.getText().toString());
        quantityTotalCard2 += priceCard2;
        quantityTotalText.setText(Double.toString(quantityTotalCard2).format("%.2f", quantityTotalCard2));
        beforeTaxTotal += priceCard2;
    }

    public void decreaseCard2(View view) {
        TextView quantityText = findViewById(R.id.card2_quantity);
        quantityCard2 = Integer.parseInt(quantityText.getText().toString());
        if (quantityCard2 > 0) {
            quantityCard2--;
            quantityText.setText(Integer.toString(quantityCard2));

            TextView priceText = findViewById(R.id.card2_price);
            priceCard2 = Double.parseDouble(priceText.getText().toString());

            TextView quantityTotalText = findViewById(R.id.card2_subtotal);
            quantityTotalCard2 = Double.parseDouble(quantityTotalText.getText().toString());
            quantityTotalCard2 -= priceCard2;
            quantityTotalText.setText(Double.toString(quantityTotalCard2).format("%.2f", quantityTotalCard2));
            beforeTaxTotal -= priceCard2;
        }
    }

    public void increaseCard3(View view) {
        TextView quantityText = findViewById(R.id.card3_quantity);
        quantityCard3 = Integer.parseInt(quantityText.getText().toString());
        quantityCard3++;
        quantityText.setText(Integer.toString(quantityCard3));

        TextView priceText = findViewById(R.id.card3_price);
        priceCard3 = Double.parseDouble(priceText.getText().toString());

        TextView quantityTotalText = findViewById(R.id.card3_subtotal);
        quantityTotalCard3 = Double.parseDouble(quantityTotalText.getText().toString());
        quantityTotalCard3 += priceCard3;
        quantityTotalText.setText(Double.toString(quantityTotalCard3).format("%.2f", quantityTotalCard3));
        beforeTaxTotal += priceCard3;
    }

    public void decreaseCard3(View view) {
        TextView quantityText = findViewById(R.id.card3_quantity);
        quantityCard3 = Integer.parseInt(quantityText.getText().toString());
        if (quantityCard3 > 0) {
            quantityCard3--;
            quantityText.setText(Integer.toString(quantityCard3));

            TextView priceText = findViewById(R.id.card3_price);
            priceCard3 = Double.parseDouble(priceText.getText().toString());

            TextView quantityTotalText = findViewById(R.id.card3_subtotal);
            quantityTotalCard3 = Double.parseDouble(quantityTotalText.getText().toString());
            quantityTotalCard3 -= priceCard3;
            quantityTotalText.setText(Double.toString(quantityTotalCard3).format("%.2f", quantityTotalCard3));
            beforeTaxTotal += priceCard3;
        }
    }
}
