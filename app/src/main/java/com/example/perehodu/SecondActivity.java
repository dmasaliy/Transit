package com.example.perehodu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
 TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.secondTextView);
        String str = getIntent().getStringExtra(MainActivity.BUNDLE_STRING);

        textView.setText(str);
    }
}