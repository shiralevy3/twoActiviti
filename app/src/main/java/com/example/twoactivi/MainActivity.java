package com.example.twoactivi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"openinig new activity",Toast.LENGTH_LONG).show();
                String userInput = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecActivity2.class);
                intent.putExtra("userInput", userInput);
                startActivity(intent);
            }
        });
    }
}