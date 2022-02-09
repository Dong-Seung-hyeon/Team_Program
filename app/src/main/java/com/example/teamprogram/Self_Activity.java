package com.example.teamprogram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Self_Activity extends AppCompatActivity {

    Button chs1;
    Button chs2;
    Button chs3;
    Button chs4;
    Button chs5;
    Button chs6;
    Button chs7;
    Button chs8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.self_activity);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.r);

        chs1=(Button) findViewById(R.id.chs1);
        chs2=(Button) findViewById(R.id.chs2);
        chs3=(Button) findViewById(R.id.chs3);
        chs4=(Button) findViewById(R.id.chs4);
        chs5=(Button) findViewById(R.id.chs5);
        chs6=(Button) findViewById(R.id.chs6);
        chs7=(Button) findViewById(R.id.chs7);
        chs8=(Button) findViewById(R.id.chs8);

        Button chs1 = (Button) findViewById(R.id.chs1);
        chs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CpuActivity.class);
                startActivity(intent);
            }
        });

        Button chs2 = (Button) findViewById(R.id.chs2);
        chs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainbordActivity.class);
                startActivity(intent);
            }
        });

        Button chs3 = (Button) findViewById(R.id.chs3);
        chs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MemoryActivity.class);
                startActivity(intent);
            }
        });

        Button chs4 = (Button) findViewById(R.id.chs4);
        chs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GraphicActivity.class);
                startActivity(intent);
            }
        });

        Button chs5 = (Button) findViewById(R.id.chs5);
        chs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SSDHDDActivity.class);
                startActivity(intent);
            }
        });

        Button chs6 = (Button) findViewById(R.id.chs6);
        chs6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PowerActivity.class);
                startActivity(intent);
            }
        });

        Button chs7 = (Button) findViewById(R.id.chs7);
        chs7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CsActivity.class);
                startActivity(intent);
            }
        });

        Button chs8 = (Button) findViewById(R.id.chs8);
        chs8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CoolActivity.class);
                startActivity(intent);
            }
        });

    }
}
