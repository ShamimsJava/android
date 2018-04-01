package com.shamim.shihab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameId);
    }

    public void display(View view) {
        Intent intent = new Intent(MainActivity.this, Display.class);
        intent.putExtra("name", "Your name is : "+name.getText().toString());
        startActivity(intent);
    }
}
