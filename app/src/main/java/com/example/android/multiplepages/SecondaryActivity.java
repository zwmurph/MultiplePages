package com.example.android.multiplepages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //Create a new button object constructor
        Button button = (Button) findViewById(R.id.backButton);
        //Set a listener to it and create a new method
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Do this when the button is clicked
                navigateNext(null);
            }
        });
    }

    /**
     * Method that creates an intent and launches the next activity for the app
     * @param view
     */
    public void navigateNext(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
