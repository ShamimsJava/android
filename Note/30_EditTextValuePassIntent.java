/*
* Md. Shamim Sarker
* 01/04/2018
* Button to go second activity and get value from second activity
*/

activity_first.xml
******************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.sarker.shamim.intenddemo.FirstActivity"
    android:orientation="vertical"
    android:gravity="center">

    <Button
        android:id="@+id/button1Id"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Go to the second activity"
        android:layout_marginBottom="20dp"/>

    <TextView
        android:id="@+id/textViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:textStyle="bold"/>

</LinearLayout>

***************************************************************************

activity_second.xml
********************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.sarker.shamim.intenddemo.SecondActivity"
    android:orientation="vertical"
    android:gravity="center">

    <EditText
        android:id="@+id/editTextId"
        android:layout_width="250dp"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:hint="Enter your name"/>

    <Button
        android:id="@+id/button2Id"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Go to first activity"/>

</LinearLayout>

***************************************************************************

SecondActivity.java
********************

package com.sarker.shamim.intenddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.button2Id);
        editText = findViewById(R.id.editTextId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = editText.getText().toString();

                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                intent.putExtra("key", value);
                setResult(1, intent);
                finish();
            }
        });
    }
}

***************************************************************************

FirstActivity.java
******************

package com.sarker.shamim.intenddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = findViewById(R.id.button1Id);
        textView = findViewById(R.id.textViewId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            String value = data.getStringExtra("key");
            textView.setText(value);
        }
    }
}