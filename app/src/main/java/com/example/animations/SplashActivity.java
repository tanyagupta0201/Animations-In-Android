package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide(); // hides toolbar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN); // hides status bar

        // To give some delay in splash screen
        Thread th = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(4000);
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
                finally
                {
                     Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                     startActivity(intent);
                     finish(); // Agar user galti se back button click karde main activity se toh splash screen par na atak jaaye
                }
            }
        };th.start();
    }
}