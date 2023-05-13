package com.example.takeeateasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        Thread thread=new Thread(){

            public void run()
            {
                try {
                    sleep(4000);

                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(SplashScreenActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                }





        };thread.start();

    }
}