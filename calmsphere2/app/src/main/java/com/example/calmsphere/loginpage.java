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

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginpage);
        Button loginButton = findViewById(R.id.btnLogin);
        TextView registerLink = findViewById(R.id.btnRegisterLink);

        // Click listener for "Login" button (You can add your login logic here)
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logic to login the user

                // After login, navigate to the next screen (MainActivity or another screen)
                Intent intent = new Intent(loginpage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Click listener for "Don't have an account? Create account"
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to RegisterActivity
                Intent intent = new Intent(loginpage.this, Registerpage.class);
                startActivity(intent);
            }
        });
    }
}