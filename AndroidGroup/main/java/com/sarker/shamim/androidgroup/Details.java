package com.sarker.shamim.androidgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Details extends AppCompatActivity implements View.OnClickListener{

    Button b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Details.this, MainActivity.class);
                startActivity(i);

                Toast.makeText(getApplicationContext(), "Click on button", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(Details.this, MainActivity.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(), "Click on button", Toast.LENGTH_SHORT).show();
    }
}
