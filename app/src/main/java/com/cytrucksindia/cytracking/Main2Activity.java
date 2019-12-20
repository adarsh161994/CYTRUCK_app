package com.cytrucksindia.cytracking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {


            EditText edit;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main2);

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

                        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                        intent.putExtra("mobile", mobile);
                        startActivity(intent);
                    }
                });

            }
        }


