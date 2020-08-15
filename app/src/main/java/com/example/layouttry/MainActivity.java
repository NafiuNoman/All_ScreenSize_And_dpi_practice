package com.example.layouttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button first1,first2,second1,second2,second3;
   // ScrollView scrollView;
    ImageView imageViewMy;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("OnCreate","from OnCreate");
        setContentView(R.layout.activity_main);

        first1 = findViewById(R.id.button);
        first2 = findViewById(R.id.button2);
        second1 = findViewById(R.id.button3);
        second2 = findViewById(R.id.button4);
        second3 = findViewById(R.id.button5);

      //  scrollView = findViewById(R.id.sc) ;
        textView = findViewById(R.id.textView);

        imageViewMy = findViewById(R.id.imageView);




        Log.d("OnCreate","from OnCreate......66");




    }
}