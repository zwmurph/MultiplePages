package com.example.android.multiplepages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a new button object constructor
        Button button = (Button) findViewById(R.id.navigate);
        //Set a listener to it and create a new method
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Do this when the button is clicked
                navigateNext();
            }
        });
    }

    /**
     * Method that creates an intent and launches the next activity for the app
     */
    public void navigateNext() {
        //Create a new Intent object constructor, populate it with [the activity you want to call].class
        Intent intent = new Intent(this, SecondaryActivity.class);
        //Start that new intent
        startActivity(intent);
    }
}
