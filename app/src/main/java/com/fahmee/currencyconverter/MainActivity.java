package com.fahmee.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){
        double eur;
        EditText number = (EditText) findViewById(R.id.editText);
        ImageView image = (ImageView) findViewById(R.id.image);

        image.setImageResource(R.drawable.money_bag);

        eur = (Integer.parseInt(number.getText().toString()))*(1/0.90);
        Toast.makeText(getApplicationContext(),"converted currency " + eur, Toast.LENGTH_LONG).show();
    }
   public void clickUsd(View view){
        double usd;

        EditText number = (EditText) findViewById(R.id.editText);
        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.money_bag);

        usd = (Integer.parseInt(number.getText().toString()))*(0.90/1);
        Toast.makeText(getApplicationContext(),"converted currency in $ " + usd, Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
