package com.example.tiktok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import kotlinx.coroutines.internal.ThreadSafeHeap;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread thread = new Thread(){
          public void run(){
            try {
                sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                Intent intent = new Intent(Splash_Screen.this , MainActivity.class) ;
                startActivity(intent);
                finish();
            }
          }
        };thread.start();



    }
}