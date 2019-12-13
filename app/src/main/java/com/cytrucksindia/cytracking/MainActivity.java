package com.cytrucksindia.cytracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
     EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner dropdown = findViewById(R.id.spinner);
        String[] items = new String[]{"1", "2", "three/"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        edit = findViewById(R.id.edit);
        findViewById(R.id.button).setOnClickListener(   new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = edit.getText().toString().trim();

                if(mobile.isEmpty() || mobile.length() < 10){
                    edit.setError("Enter a valid mobile");
                    edit.requestFocus();
                    return;
                }

                Intent intent = new Intent(MainActivity.this, ActivityPhoneNumber.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);
            }
        });

    }
}

