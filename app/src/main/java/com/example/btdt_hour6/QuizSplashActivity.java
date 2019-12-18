package com.example.btdt_hour6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.text.SimpleDateFormat;
import java.util.*;



public class QuizSplashActivity extends AppCompatActivity {
    public static final String GAME_PREFERENCES = "GamePrefs";
    public static final String LAST_LAUNCH = "LAST_LAUNCH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ShowLog();
        animation();
        Launcher();

    }

    public void ShowLog(){
        SharedPreferences settings = getSharedPreferences(GAME_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = settings.edit();
        SharedPreferences lastTime = getSharedPreferences(LAST_LAUNCH, MODE_PRIVATE);
        SharedPreferences.Editor dateEditor = lastTime.edit();

        //NAME AND AGE
        prefEditor.putString("UserName", "JaneDoe");
        prefEditor.putInt("UserAge", 22);

        if (settings.contains("UserName") == true) {
            // We have a user name
            String user = settings.getString("UserName", "default");
            Log.d("tag", user);
        }
        if (settings.contains("UserAge") == true) {
            // We have a user name
            int userAge = settings.getInt("UserAge", 0);
            Log.d("tag", Integer.toString(userAge));
        }
        prefEditor.commit();


        //LAST LAUNCH IN HH:MM:SS
        Date now = new Date();
        SimpleDateFormat format =
                new SimpleDateFormat(" HH:mm:ss");
        String date = format.format(now);
        if (lastTime.contains("dateTime") == true) {
            //We have recorded the last time we used the game
            String dateTime = lastTime.getString("dateTime", "Default");
            Log.d("tag", "LastLaunch: " + dateTime);
        }
        dateEditor.putString("dateTime", date);
        dateEditor.commit();
    }

    public void animation(){
            ImageView img = (ImageView) findViewById(R.id.imageView7);
            Context c = img.getContext();
            Animation mAnimation = AnimationUtils
                    .loadAnimation(c, R.anim.tween);
            img.startAnimation(mAnimation);

    }
    public void LaunchMenu(){
        Intent intent = new Intent(this, QuizMenuActivity.class);
        startActivity(intent);
    }

    public void Launcher(){
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                LaunchMenu();
            }
        },3000);
    }
}
