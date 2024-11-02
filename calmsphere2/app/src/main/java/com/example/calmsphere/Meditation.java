package com.example.calmsphere;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Meditation extends BaseActivity {
    private Button btnStressRelief, btnFocus, btnSleep, btnRelaxation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);

        btnStressRelief = findViewById(R.id.btnStressRelief);
        btnFocus = findViewById(R.id.btnFocus);
        btnSleep = findViewById(R.id.btnSleep);
        btnRelaxation = findViewById(R.id.btnRelaxation);
        Button btnBack =  findViewById(R.id.btnBack);


        btnStressRelief.setOnClickListener(v -> Toast.makeText(this, "Stress Relief Meditation Selected", Toast.LENGTH_SHORT).show());
        btnFocus.setOnClickListener(v -> Toast.makeText(this, "Focus Meditation Selected", Toast.LENGTH_SHORT).show());
        btnSleep.setOnClickListener(v -> Toast.makeText(this, "Sleep Meditation Selected", Toast.LENGTH_SHORT).show());
        btnRelaxation.setOnClickListener(v -> Toast.makeText(this, "Relaxation Meditation Selected", Toast.LENGTH_SHORT).show());
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
