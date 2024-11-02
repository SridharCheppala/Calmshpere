package com.example.calmsphere;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Music extends AppCompatActivity {
    private ImageView musicImage;
    private SeekBar musicSeekBar;
    private Button btnPrevious, btnPlayPause, btnNext;
    private boolean isPlaying = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        musicImage = findViewById(R.id.musicImage);
        musicSeekBar = findViewById(R.id.musicSeekBar);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnPlayPause = findViewById(R.id.btnPlayPause);
        btnNext = findViewById(R.id.btnNext);

        btnPlayPause.setOnClickListener(v -> {
            isPlaying = !isPlaying;
            if (isPlaying) {
                btnPlayPause.setText("Pause");

                Toast.makeText(this, "Music playing", Toast.LENGTH_SHORT).show();
            } else {
                btnPlayPause.setText("Play");

                Toast.makeText(this, "Music paused", Toast.LENGTH_SHORT).show();
            }
        });

        btnPrevious.setOnClickListener(v -> Toast.makeText(this, "Previous Track", Toast.LENGTH_SHORT).show());
        btnNext.setOnClickListener(v -> Toast.makeText(this, "Next Track", Toast.LENGTH_SHORT).show());


        


    }
}
