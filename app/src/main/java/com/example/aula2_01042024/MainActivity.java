package com.example.aula2_01042024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirGorjeta(View view){
        Intent intent = new Intent(this, GorjetaActivity.class);
        startActivity(intent);
    }

    public void abrirDatabase (View view){
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }
}