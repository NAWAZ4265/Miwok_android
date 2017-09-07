package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.onClick;


/**
 * Created by Nawaz SHARIF on 9/3/2017.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View view){
            Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);
            startActivity(numbersIntent);
        }
        });

        TextView colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent colorIntent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(colorIntent);
            }
        });

         TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }
}
