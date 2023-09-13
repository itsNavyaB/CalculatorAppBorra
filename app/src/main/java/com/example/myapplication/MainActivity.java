package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    int num1;
    int num2;
    public TextView answer;

    public EditText num1ET, num2ET;
    double output;

    ConstraintLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = findViewById(R.id.mainLayout);
    }
    public void snackbarClicked(View v) {
        answer.setText(Double.toString(output));
        Snackbar.make(mainLayout, "Thank you for using this calculator!", Snackbar.LENGTH_LONG)
                .show();
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

    }
    public void subtract(View v){
        getNumbers();
        output = num1 - num2;

    }
    public void divide(View v){
        getNumbers();
        output = num1 / (num2 * 1.0);

    }
    public void multiply(View v){
        getNumbers();
        output = num1 * num2;

    }
    public void equals(View V){
        answer.setText(Double.toString(output));
    }

    public void clear(View v){
        num1ET.getText().clear();
        num2ET.getText().clear();
        answer.setText("");
    }


//    public void numSelected(View v){
//        answer = findViewById(R.id.answerTextView);
//        String input = "";
//        if(v.getId() == R.id.button0){
//            Log.i("Borra", "Selected 0");
//            input += "0";
//            //num1ET.setText("0");
//        }
//        else if(v.getId() == R.id.button1){
//            Log.i("Borra", "Selected 1");
//            input += "1";
//        }
//        else if(v.getId() == R.id.button2){
//            Log.i("Borra", "Selected 2");
//            input += "2";
//        }
//        else if(v.getId() == R.id.button3){
//            Log.i("Borra", "Selected 3");
//            input += "3";
//        }
//        else if(v.getId() == R.id.button4){
//            Log.i("Borra", "Selected 4");
//            input += "4";
//        }
//        else if(v.getId() == R.id.button5){
//            Log.i("Borra", "Selected 5");
//            input += "5";
//        }
//        else if(v.getId() == R.id.button6){
//            Log.i("Borra", "Selected 6");
//            input += "6";
//        }
//        else if(v.getId() == R.id.button7){
//            Log.i("Borra", "Selected 7");
//            input += "7";
//        }
//        else if(v.getId() == R.id.button8){
//            Log.i("Borra", "Selected 8");
//            input += "8";
//        }
//        else if(v.getId() == R.id.button9){
//            Log.i("Borra", "Selected 9");
//            input += "9";
//        }
//
//    }

    public void type(View v){
        num1ET = findViewById(R.id.num1EditText);
        num2ET = findViewById(R.id.num2EditText);
        Button btn = findViewById(v.getId());
        String str = btn.getText().toString();
        if(!(num1ET.getText().toString().length() == 1)){
            num1ET.setText(str);
            Snackbar.make(mainLayout, "Enter both values before using operations!", Snackbar.LENGTH_LONG)
                    .show();
        }
        else{
            num2ET.setText(str);
        }

    }


}