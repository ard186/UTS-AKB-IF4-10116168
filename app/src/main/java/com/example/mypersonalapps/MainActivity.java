package com.example.mypersonalapps;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// 21 Mei 2019, 10116168, Afif Rizky Darmawan, IF-4 / Komputasi 4

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    //String [] NAMES = {"Asep", "Budi", "Cherish"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, ActivityPager.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);

    }

}