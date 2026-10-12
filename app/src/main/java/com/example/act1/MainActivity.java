package com.example.act1; // Make sure this matches your project's package name at the top of your file

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Button 1: "Get Started" -> Goes to SecondActivity[cite: 1]
        MaterialButton btnPrimary = findViewById(R.id.btnPrimary);
        btnPrimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,       SecondActivity.class);
                startActivity(intent);
            }
        });

        // 2. Button 2: "Learn More" -> Goes to ThirdActivity[cite: 1]
        MaterialButton btnSecondary = findViewById(R.id.btnSecondary);
        btnSecondary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        // 3. Button 3: Required "superButton" -> Goes to FourthActivity[cite: 1]
        MaterialButton superButton = findViewById(R.id.superButton);
        superButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}