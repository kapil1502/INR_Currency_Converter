package com.dev_ver.currencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// HEllo I Am Kapil Verma.
// This is my first advanced Android application.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void usd(View view) {
         EditText INR = (EditText)findViewById(R.id.INR);
         float Inr = Float.parseFloat(INR.getText().toString());
        double out = Inr / (76.01);
        Toast.makeText(this ,"Your currency value is " + out , Toast.LENGTH_LONG).show();
    }

    public void aed(View view) {
        EditText INR = (EditText)findViewById(R.id.INR);
        float Inr = Float.parseFloat(INR.getText().toString());
        double out = Inr / (20.78);
        Toast.makeText(this ,"Your currency value is " + out , Toast.LENGTH_LONG).show();
    }

    public void pound(View view) {
        EditText INR = (EditText)findViewById(R.id.INR);
        float Inr = Float.parseFloat(INR.getText().toString());
        double out = Inr / (100.69);
        Toast.makeText(this ,"Your currency value is " + out , Toast.LENGTH_LONG).show();
    }

    public void jyen(View view) {
        EditText INR = (EditText)findViewById(R.id.INR);
        float Inr = Float.parseFloat(INR.getText().toString());
        double out = Inr / (0.67);
        Toast.makeText(this ,"Your currency value is " + out , Toast.LENGTH_LONG).show();
    }

    public void tbht(View view) {
        EditText INR = (EditText)findViewById(R.id.INR);
        float Inr = Float.parseFloat(INR.getText().toString());
        double out = Inr / (2.28);
        Toast.makeText(this ,"Your currency value is " + out , Toast.LENGTH_LONG).show();
    }

    public void candollar(View view) {
        EditText INR = (EditText)findViewById(R.id.INR);
        float Inr = Float.parseFloat(INR.getText().toString());
        double out = Inr / (58.95);
        Toast.makeText(this ,"Your currency value is " + out , Toast.LENGTH_LONG).show();
    }
}