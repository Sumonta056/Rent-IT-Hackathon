package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameText ;
    private Button login ;
    private Button exit;


    
    private TextView infoText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = (TextView) findViewById(R.id.nameTextView) ;
        nameText.setText(R.string.user_name2);

        infoText = findViewById(R.id.bioTextView);

        login = findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoText.setText(R.string.bio_data);
            }
        });


        exit = (Button) findViewById(R.id.exitButton);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoText.setText("");

            }
        });


    }
}