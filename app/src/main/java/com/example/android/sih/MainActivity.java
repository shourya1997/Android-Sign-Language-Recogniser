package com.example.android.sih;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnlearn;
    private Button btndetect;
    private Button btntest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlearn = (Button) findViewById(R.id.bt_learn);
        btndetect = (Button) findViewById(R.id.bt_detect);
        btntest = (Button) findViewById(R.id.bt_test);

        btndetect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detectIntent = new Intent(MainActivity.this, DetectActivity.class);
                startActivity(detectIntent);
            }
        });

        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testIntent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(testIntent);
            }
        });

        btnlearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent learnIntent = new Intent(MainActivity.this, LearnActivity.class);
                startActivity(learnIntent);
            }
        });
    }

}
