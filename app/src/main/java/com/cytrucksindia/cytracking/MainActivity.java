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
        String[] items = new String[]{"Afghanistan", "Albania",
                "Algeria", "Andorra", "Angola", "Antarctica", "Argentina",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan",
                "Bahrain", "Bangladesh", "Belarus", "Belgium", "Belize", "Benin",
                "Bhutan", "Bolivia", "Bosnia And Herzegovina", "Botswana",
                "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso",
                "Myanmar", "Burundi", "Cambodia", "Cameroon", "Canada",
                "Cape Verde", "Central African Republic", "Chad", "Chile", "China",
                "Christmas Island", "Cocos (keeling) Islands", "Colombia",
                "Comoros", "Congo", "Cook Islands", "Costa Rica", "Croatia",
                "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti",
                "Timor-leste", "Ecuador", "Egypt", "El Salvador",
                "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia",
                "Falkland Islands (malvinas)", "Faroe Islands", "Fiji", "Finland",
                "France", "French Polynesia", "Gabon", "Gambia", "Georgia",
                "Germany", "Ghana", "Gibraltar", "Greece", "Greenland",
                "Guatemala", "Guinea", "Guinea-bissau", "Guyana", "Haiti",
                "Honduras", "Hong Kong", "Hungary", "India", "Indonesia", "Iran",
                "Iraq", "Ireland", "Isle Of Man", "Israel", "Italy", "Ivory Coast",
                "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati",
                "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho",
                "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg",
                "Macao", "Macedonia", "Madagascar", "Malawi", "Malaysia",
                "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania",
                "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova",
                "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique",
                "Namibia", "Nauru", "Nepal", "Netherlands", "New Caledonia",
                "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Korea",
                "Norway", "Oman", "Pakistan", "Palau", "Panama",
                "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn",
                "Poland", "Portugal", "Puerto Rico", "Qatar", "Romania",
                "Russian Federation", "Rwanda", "Saint BarthÃ©lemy", "Samoa",
                "San Marino", "Sao Tome And Principe", "Saudi Arabia", "Senegal",
                "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia",
                "Slovenia", "Solomon Islands", "Somalia", "South Africa",
                "Korea, Republic Of", "Spain", "Sri Lanka", "Saint Helena",
                "Saint Pierre And Miquelon", "Sudan", "Suriname", "Swaziland",
                "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan",
                "Tajikistan", "Tanzania", "Thailand", "Togo", "Tokelau", "Tonga",
                "Tunisia", "Turkey", "Turkmenistan", "Tuvalu",
                "United Arab Emirates", "Uganda", "United Kingdom", "Ukraine",
                "Uruguay", "United States", "Uzbekistan", "Vanuatu",
                "Holy See (vatican City State)", "Venezuela", "Viet Nam",
                "Wallis And Futuna", "Yemen", "Zambia", "Zimbabwe"};
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

