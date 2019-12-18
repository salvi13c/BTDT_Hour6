package com.example.btdt_hour6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class QuizMenuActivity extends AppCompatActivity {
    public static final String GAME_PREFERENCES = "GamePrefs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void openActivityGame(View button) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    public void openActivityScores(View button) {
        Intent intent = new Intent(this, QuizScoresActivity.class);
        startActivity(intent);
    }

    public void openActivitSettings(View button) {
        Intent intent = new Intent(this, QuizSettingsActivity.class);
        startActivity(intent);
    }

    public void openActivityHelp(View button) {
        Intent intent = new Intent(this, QuizHelpActivity.class);
        startActivity(intent);
    }


}
