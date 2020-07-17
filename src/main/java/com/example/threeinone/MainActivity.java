package com.example.threeinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button calculator,Bmi,Game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator=findViewById(R.id.calButton);
        Game=findViewById(R.id.gameButton);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCal();
            }
        });
        Game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });
    }
    public void openCal(){
        Intent intent= new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }
    public void openGame(){
        Intent intent= new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}