package com.example.calmsphere;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Editprofile extends BaseActivity {
    private EditText nameProfile, emailProfile, phoneProfile, languageProfile;
    private CheckBox dailyReminder;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);


        nameProfile = findViewById(R.id.nameProfile);
        emailProfile = findViewById(R.id.emailProfile);
        phoneProfile = findViewById(R.id.phoneProfile);
        languageProfile = findViewById(R.id.languageProfile);
        dailyReminder = findViewById(R.id.dailyReminder);
        btnLogout = findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(v -> {

            Toast.makeText(EditProfile.this, "Logged out", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
