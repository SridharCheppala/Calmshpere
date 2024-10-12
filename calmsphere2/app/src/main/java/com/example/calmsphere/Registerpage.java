package com.example.calmsphere;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registerpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registerpage);
        Button createAccountButton = findViewById(R.id.btnCreateAccount);
        TextView loginLink = findViewById(R.id.btnLoginLink);

        // Click listener for "Create Account" button (You can add your registration logic here)
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logic to create the account

                // After creating the account, navigate to LoginActivity
                Intent intent = new Intent(Registerpage.this, loginpage.class);
                startActivity(intent);
            }
        });

        // Click listener for "Already have an account? Login"
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to LoginActivity
                Intent intent = new Intent(Registerpage.this, loginpage.class);
                startActivity(intent);
            }
        });
    }
}