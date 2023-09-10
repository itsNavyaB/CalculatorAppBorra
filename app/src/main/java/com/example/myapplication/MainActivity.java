package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num1;
    int num2;
    public TextView answer;

    public EditText num1ET, num2ET;
    double output;
    String input;
    int numInput;
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
        output = num1 / (num2 * 1.0);
        //answer.setText(Integer.toString(quotient));
    }
    public void multiply(View v){
        getNumbers();
        output = num1 * num2;
        //answer.setText(Integer.toString(product));
    }
    public void equals(View V){
        answer.setText(Double.toString(output));
    }

    public void clear(View v){
        num1ET.getText().clear();
        num2ET.getText().clear();
        answer.setText("");
    }

    public void numSelected(View v){
        if(v.getId() == R.id.button0){
            Log.i("Borra", "Selected 0");
            input += "0";
        }
        else if(v.getId() == R.id.button1){
            Log.i("Borra", "Selected 1");
            input += "1";
        }
        else if(v.getId() == R.id.button2){
            Log.i("Borra", "Selected 2");
            input += "2";
        }
        else if(v.getId() == R.id.button3){
            Log.i("Borra", "Selected 3");
            input += "3";
        }
        else if(v.getId() == R.id.button4){
            Log.i("Borra", "Selected 4");
            input += "4";
        }
        else if(v.getId() == R.id.button5){
            Log.i("Borra", "Selected 5");
            input += "5";
        }
        else if(v.getId() == R.id.button6){
            Log.i("Borra", "Selected 6");
            input += "6";
        }
        else if(v.getId() == R.id.button7){
            Log.i("Borra", "Selected 7");
            input += "7";
        }
        else if(v.getId() == R.id.button8){
            Log.i("Borra", "Selected 8");
            input += "8";
        }
        else if(v.getId() == R.id.button9){
            Log.i("Borra", "Selected 9");
            input += "9";
        }
        numInput = Integer.parseInt(input);
    }

}