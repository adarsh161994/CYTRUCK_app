package com.cytrucksindia.cytracking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



public class Main4Activity extends AppCompatActivity {
    EditText edit1;
    Button button1;
    private Object Main5Activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        edit1= (EditText) findViewById(R.id.edit1);
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namevalue= edit1.getText().toString();
                Intent intent = new Intent (Main4Activity.this,Main5Activity.class);
                intent.putExtra(namevalue,"namevalue");
                startActivity(intent);
            }


        });
    }
}
