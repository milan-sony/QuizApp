package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    RadioButton rd1, rd2, rd3, rd4;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        rd1 = findViewById(R.id.a2);
        rd2 = findViewById(R.id.b2);
        rd3 = findViewById(R.id.c2);
        rd4 = findViewById(R.id.d2);

        btn = findViewById(R.id.q2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!rd1.isChecked() && !rd2.isChecked() && !rd3.isChecked() && !rd4.isChecked()) {
                    Toast.makeText(MainActivity3.this, "Please select any answer", Toast.LENGTH_SHORT).show();
                } else {
                    if (rd2.isChecked()) {
                        Intent i1 = new Intent(MainActivity3.this, MainActivity4.class);
                        startActivity(i1);
                    } else {
                        Intent i2 = new Intent(MainActivity3.this, MainActivity7_wrong.class);
                        startActivity(i2);
                    }
                }



            }
        });
    }
}