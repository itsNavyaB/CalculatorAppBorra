package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num1;
    int num2;
    public TextView answer;

    public EditText num1ET, num2ET;
    int output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getNumbers(){
        num1ET = findViewById(R.id.num1EditText);
        String n1 = num1ET.getText().toString();

        num2ET = findViewById(R.id.num2EditText);
        String n2 = num2ET.getText().toString();

        answer = findViewById(R.id.answerTextView);

        num1 = Integer.parseInt(n1);
        num2 = Integer.parseInt(n2);
    }

    public void add(View v){
        getNumbers();
        output = num1 + num2;
        //answer.setText(Integer.toString(sum));
    }
    public void subtract(View v){
        getNumbers();
        output = num1 - num2;
        //answer.setText(Integer.toString(difference));
    }
    public void divide(View v){
        getNumbers();
        output = num1 / num2;
        //answer.setText(Integer.toString(quotient));
    }
    public void multiply(View v){
        getNumbers();
        output = num1 * num2;
        //answer.setText(Integer.toString(product));
    }
    public void equals(View V){
        answer.setText(Integer.toString(output));
    }

    public void clear(View v){
        num1ET.getText().clear();
        num2ET.getText().clear();
        answer.setText("");
    }

}