package com.example.indoor_localization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button btn_Start;
    Button btn_DB;
    Button btn_PER;
    Button btn_BLUE;
    Button btn_Wi_Fi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();



        btn_Start =findViewById(R.id.btn_start);
        btn_DB =   findViewById(R.id.btn_1);
        btn_PER =  findViewById(R.id.btn_2);
        btn_BLUE = findViewById(R.id.btn_3);
        btn_Wi_Fi =findViewById(R.id.btn_4);


        btn_Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MapActivity.class));

            }
        });

        btn_DB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " OK ", Toast.LENGTH_SHORT).show();

            }
        });

        btn_PER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, " OK ", Toast.LENGTH_SHORT).show();

            }
        });

        btn_BLUE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " OK ", Toast.LENGTH_SHORT).show();

            }
        });

        btn_Wi_Fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " OK ", Toast.LENGTH_SHORT).show();

            }
        });


    }

}