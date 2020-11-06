package com.lil_kent1.partageservices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMyServices(View v) {
        System.out.println("dfdf");

        Intent i = new Intent(this, Myservice.class);
        startActivity(i);
    }
}