package com.example.lab_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button MyButAct2 = (Button) findViewById(R.id.button);
        EditText yourMessage = (EditText) findViewById(R.id.yourMessage);
        View.OnClickListener startMyClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                if (yourMessage.getText().toString().isEmpty()) {
                    intent.putExtra("link", "Empty message");
                }
                else {
                    intent.putExtra("link", yourMessage.getText().toString());
                }
                startActivity(intent);
//                finish();

            }
        };
        MyButAct2.setOnClickListener(startMyClick);
    }


}