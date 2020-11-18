package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;

    String number1;
    String number2;

    TextView lblSum;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        Intent intent = getIntent();

        String number1 = intent.getStringExtra("n1");
        String number2 = intent.getStringExtra("n2");

        editText1.setText(number1);
        editText2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

    }

    public void add(View view){
        lblSum.setText(number1 + " + " + number2 + " = " + (n1+n2));
    }

    public void subtract(View view){
        lblSum.setText(number1 + " - " + number2 + " = " + (n1-n2));
    }

    public void divide(View view){
        lblSum.setText(number1 + " / " + number2 + " = " + (n1/n2));
    }

    public void multiply(View view){
        lblSum.setText(number1 + " * " + number2 + " = " + (n1*n2));
    }
}