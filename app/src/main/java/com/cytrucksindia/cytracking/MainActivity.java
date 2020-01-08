package com.cytrucksindia.cytracking;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText edit;
    ImageView abcd, clover;
    LinearLayout textsplash, texthome;
    LinearLayout menus;
    Animation frombottom;

    public MainActivity() {
    }

    @Override
    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);


        abcd = (ImageView) findViewById(R.id.abcd);
        clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        menus = (LinearLayout) findViewById(R.id.menus);

        abcd.animate().translationY(-1700).setDuration(2500).setStartDelay(400);
        clover.animate().alpha(0).setDuration(800).setStartDelay(600);
        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);


        edit = findViewById(R.id.edit);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = edit.getText().toString().trim();

                if (mobile.isEmpty() || mobile.length() < 10) {
                    edit.setError("Enter a valid mobile");
                    edit.requestFocus();
                    return;
                }

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);
            }
        });

    }
}
