package com.example.twoactivi;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec2);

        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.buttonBack);

        String userInput = getIntent().getStringExtra("userInput");
        textView.setText(userInput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });
    }
}


