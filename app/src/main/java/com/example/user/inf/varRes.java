package com.example.user.inf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class varRes extends AppCompatActivity {
String[] answers;
String[] writeAnswers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_var_res);
        Intent intent = getIntent();
        answers = intent.getStringArrayExtra("answers");
        writeAnswers = intent.getStringArrayExtra("writeAnswers");

    }
}
