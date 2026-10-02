package com.example.pr4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private EditText etDay, etTime, etComments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        etDay = findViewById(R.id.etDay);
        etTime = findViewById(R.id.etTime);
        etComments = findViewById(R.id.etComments);

        Button btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(v -> {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("time", etTime.getText().toString());
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}
