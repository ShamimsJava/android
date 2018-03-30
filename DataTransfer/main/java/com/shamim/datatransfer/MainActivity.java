package com.shamim.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextId);
        editText2 = findViewById(R.id.editTextId2);
        editText3 = findViewById(R.id.editTextId3);
    }

    public void gotoDisplay(View view) {
        Intent intent = new Intent(MainActivity.this, Display.class);
        String n1 = editText1.getText().toString();
        String n2 = editText2.getText().toString();
        String n3 = editText3.getText().toString();

        intent.putExtra("Shamim", n1);
        intent.putExtra("shamimsjava@gmail.com", n2);
        intent.putExtra("shamim", n3);

        startActivity(intent);
    }
}
