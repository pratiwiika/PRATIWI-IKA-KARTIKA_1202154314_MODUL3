package com.android.ika.pratiwiikak_1202154314_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by ASUS on 2/25/2018.
 */

public class Splash extends AppCompatActivity {
    private static int splashInterval = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//command ini digunakan untuk membuat layar aplikasi menjadi full screen//
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(Splash.this,Login.class);
                startActivity(a);
                Toast.makeText(Splash.this, "Welcome!!", Toast.LENGTH_LONG).show();
                this.finish();//untuk menampilkan pop up tulisan yang kita inginkan//
            }

            private void finish() {

            }
        }, splashInterval);
    }
}