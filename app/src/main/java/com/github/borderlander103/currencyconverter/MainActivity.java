package com.github.borderlander103.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertButton(View view) {

        EditText amountView = (EditText) findViewById(R.id.amountEditText);

        String amountText = amountView.getText().toString();

        double amount = Double.parseDouble(amountText);

        double currentRate = 1.15607;

        String exchangedAmount = String.format("%.2f", (currentRate * amount));

        Toast.makeText(this, "€" + amountText + " is currently $" + exchangedAmount, Toast.LENGTH_LONG).show();

    }
}
