package com.example.guessmybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.right_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "우와아 맞췄어요!!!", Toast.LENGTH_SHORT).show();
            }
        });
        Button button1 = findViewById(R.id.wrong1_btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ㅠㅠㅠ 틀렸습니다!!", Toast.LENGTH_SHORT).show();
            }
        });
        Button button2 = findViewById(R.id.wrong2_btn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "땡!!! 틀렸어요!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}