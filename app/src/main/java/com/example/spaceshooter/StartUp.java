package com.example.spaceshooter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class StartUp extends AppCompatActivity {

    // Override onCreate method
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for this activity from the XML file startup.xml
        setContentView(R.layout.startup);
    }

    // Method to start the game when the corresponding button is clicked
    public void startGame(View v){
        // Start the MainActivity
        startActivity(new Intent(this,MainActivity.class));


        finish();
    }
}
