package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static final Double US_TO_GBP_CONVERSION_FACTOR=1.3845;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
               
    public void convertCurrency(View view) {
        EditText currencyText = (EditText) findViewById(R.id.currencyTextView);
        Double sourceCurrency = Double.parseDouble(currencyText.getText().toString());
        Double convertedValue = sourceCurrency / US_TO_GBP_CONVERSION_FACTOR;
        Toast.makeText(MainActivity.this, convertedValue.toString(), Toast.LENGTH_SHORT).show();
    }
        
        


}
