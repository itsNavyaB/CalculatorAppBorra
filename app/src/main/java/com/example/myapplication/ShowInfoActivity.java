package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the intent so i can interact with it
        Intent intent = getIntent();
        //open the intent to get the data when screen loads
        String received = intent.getStringExtra("MESSAGE");
        //log in to see what was received
        Log.i("navya", "Received " + received);
        TextView infoTV = findViewById(R.id.answerTextView);
        infoTV.setText(received);
    }
}
