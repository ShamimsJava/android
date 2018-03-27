package com.sarker.shamim.androidgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mybutton(View v){

        Intent i = new Intent(MainActivity.this, Details.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(), "Click on button", Toast.LENGTH_SHORT).show();
    }
}
