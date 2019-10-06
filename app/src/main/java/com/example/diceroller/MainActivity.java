package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice1;
    private Random rand=new Random();
    private Button diceButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewDice1=findViewById(R.id.imageView2);
        diceButton=findViewById(R.id.diceButton);
        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice1();
            }
        });
    }

    private void rollDice1(){
        int randomNumber=rand.nextInt(6)+1;
        switch (randomNumber){
            case 1:
                imageViewDice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice1.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
