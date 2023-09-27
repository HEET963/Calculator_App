package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    TextView Result;
    Button SubtractionButton, DivisionButton, MultiplicationButton, AdditionButton;
    Double num1, num2, add, div, sub, mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText)findViewById(R.id.editTextText);
        secondNumber = (EditText)findViewById(R.id.editTextText2);
        Result = (TextView)findViewById(R.id.editTextText3);

        AdditionButton = (Button)findViewById(R.id.addbtn);
        SubtractionButton = (Button)findViewById(R.id.subbtn);
        MultiplicationButton = (Button)findViewById(R.id.mulbtn);
        DivisionButton = (Button)findViewById(R.id.divbtn);

        AdditionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                add = num1 + num2;
                Result.setText(Double.toString(add));
            }
        });

        SubtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                sub = num1 - num2;
                Result.setText(Double.toString(sub));
            }
        });

        MultiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                mul = num1 * num2;
                Result.setText(Double.toString(mul));
            }
        });

        DivisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                div = num1 / num2;
                Result.setText(Double.toString(div));
            }
        });

    }
}
