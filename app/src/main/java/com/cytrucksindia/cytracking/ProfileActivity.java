package com.cytrucksindia.cytracking;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ProfileActivity extends Activity {
    EditText eText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
//        eText = (EditText) findViewById(R.id.eText);
//        btn = (Button) findViewById(R.id.button);
//        btn.setOnClickListener(new OnClickListener() {
//            public void onClick(View v) {
//                String str = eText.getText().toString();
//                Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
//                msg.show();
//            }
//        });
    }
}