package com.shamim.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    TextView dis1, dis2, dis3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        dis1 = findViewById(R.id.nameTextId);
        dis1 = findViewById(R.id.emailTextId);
        dis1 = findViewById(R.id.passwordTextId);

        Intent intent = getIntent();

        String n1 = intent.getStringExtra("Shamim");
        String n2 = intent.getStringExtra("shamimsjava@gmail.com");
        String n3 = intent.getStringExtra("shamim");

        dis1.setText(n1);
        dis2.setText(n2);
        dis3.setText(n3);


    }

}
