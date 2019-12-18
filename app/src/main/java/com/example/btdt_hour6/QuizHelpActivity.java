package com.example.btdt_hour6;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class QuizHelpActivity extends AppCompatActivity {
    public static final String GAME_PREFERENCES = "GamePrefs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
    }
}
