package com.cytrucksindia.cytracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void showMyLocation(View view) {
        startActivity(new Intent(getApplicationContext(),MapsActivity.class));
    }
}
