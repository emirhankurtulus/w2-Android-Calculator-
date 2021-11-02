package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setTitle("CALCULATOR");


        number1Text=findViewById(R.id.Number1);
        number2Text=findViewById(R.id.Number2);
        textView = findViewById(R.id.textView);



    }
    public void toplama(View view)
    {
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number2=Integer.parseInt(number2Text.getText().toString());
        int result= number1+number2;
        textView.setText("Result: " + result);



    }
    public void carpma(View view)
    {
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number2=Integer.parseInt(number2Text.getText().toString());
        int result= number1*number2;
        textView.setText("Result: " + result);

    }
    public void bolme(View view)
    {
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number2=Integer.parseInt(number2Text.getText().toString());
        int result= number1/number2;
        textView.setText("Result: " + result);

    }
    public void cikarma(View view)
    {
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number2=Integer.parseInt(number2Text.getText().toString());
        int result= number1-number2;
        textView.setText("Result: " + result);

    }



}