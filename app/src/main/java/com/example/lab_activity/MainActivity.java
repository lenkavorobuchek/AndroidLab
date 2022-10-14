package com.example.lab_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView MyText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        MyText = (TextView) findViewById(R.id.MyText);
        MyText.setTextSize(TypedValue.COMPLEX_UNIT_PX, 100);
        View.OnClickListener startMyClickMain = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intentActivity2 = new Intent(MainActivity.this, Activity2.class);
                startActivity(intentActivity2);
            }
        };
        button.setOnClickListener(startMyClickMain);
        MyText.setText(getIntent().getStringExtra("link"));
    }




}