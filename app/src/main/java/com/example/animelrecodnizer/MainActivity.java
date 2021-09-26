package com.example.animelrecodnizer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.appcompat.widget.AppCompatImageView;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.lang.Math.random;

public class MainActivity extends Activity {
    AppCompatImageView imageView;
    Button button1;
    Button button4;
    Button button3;
    Button button2;
    TextView animalName;
    Random randomizer=new Random();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.human);
        imageView.setOnClickListener(onImageClickListener);
        button1 = findViewById(R.id.button); //IDB1
        button2 = findViewById(R.id.button2);//IDB2
        button3 = findViewById(R.id.button3);//IDB3
        button4 = findViewById(R.id.button4);//IDB4


        List<String> names = Arrays.asList("green"," yellow"," red"," blue");
        Collections.shuffle(names);

        button1.setText("" + names.get(0));
        button2.setText("" + names.get(1));
        button3.setText("" + names.get(2));
        button4.setText("" + names.get(3));

        ArrayList<Button> buttons = new ArrayList<>(Arrays.asList(button1, button2, button3, button4));
        for (Button button: buttons) {
            button.setOnClickListener(onButtonClickListener);
        }
    }



    public void humanMakeSound(View view) {
        System.out.println("Human sound!");
    }

    View.OnClickListener onButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int nameid=imageView.getId();
            String name= String.valueOf(imageView.getTag());
            int idClickd= view.getId();
            if (idClickd==button2.getId())
            {
                System.out.println(button2.getText().toString());

            }
            else
            {
                System.out.println("try again!");
            }
        }
    };

    View.OnClickListener onImageClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            humanMakeSound(view);
        }
    };
}