package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        Use it only when toolbar is showing in a Splash Activity
//        getSupportActionBar().hide();//It will hide the tool bar in first screen or launcher bar.



        Thread thread=new Thread(){
            public void run()
            {
                try {
//                    To give delay in finally
                    sleep(2000);//2 second
                }
                catch (Exception e)
                {
                    e.printStackTrace();//Mother of all the exceptions
                }
                finally {
                    Intent intent =new Intent(SplashActivity.this,MainActivity.class);
               startActivity(intent);
                }
            }

        };thread.start();
    }
}