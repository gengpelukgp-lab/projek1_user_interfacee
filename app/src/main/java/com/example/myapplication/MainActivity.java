package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int count = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.Tengah);
    }

    public void CountDown(View view) {
        count--;
        textView.setText(String.valueOf(count));

        Toast.makeText(this, "Hello XI PPLG B", Toast.LENGTH_SHORT).show();
    }

    public void CountUp(View view) {
        count++;
        textView.setText(String.valueOf(count));

        Toast.makeText(this, "Hello XI PPLG B", Toast.LENGTH_SHORT).show();
    }
}