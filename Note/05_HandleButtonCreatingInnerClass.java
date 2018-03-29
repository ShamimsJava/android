/*
* Md. Shamim Sarker
* 27/03/2018
* Button handle creating inner class
* Using Toast
* Set text from java file
* Using Log debugger for console output
*/

activity_main.xml
*****************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.sarker.shamim.practiceone.MainActivity"
    android:orientation="vertical"
    android:layout_margin="10dp">

    <Button
        android:id="@+id/b1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Button 1" />

    <Button
        android:id="@+id/b2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Button 2" />

    <TextView
        android:id="@+id/t1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Button Clicked Listener"
        android:textSize="35sp"
        android:textAlignment="center"
        android:textColor="#ef0109"
        android:textStyle="bold"/>
    
</LinearLayout>


**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.practiceone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);
        textView = findViewById(R.id.t1);

        Handler handler = new Handler();

        button1.setOnClickListener(handler);
        button2.setOnClickListener(handler);
    }

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.b1){
                Toast.makeText(getApplicationContext(), "Button 1 is clicked", Toast.LENGTH_SHORT).show();
                textView.setText("Button 1 is clicked");
                Log.d("tag", "Button 1 is clicked");
            }else{
                Toast.makeText(MainActivity.this, "Button 2 is clicked", Toast.LENGTH_SHORT).show();
                textView.setText("Button 2 is clicked");
                Log.d("tag", "Button 2 is clicked");
            }
        }
    }
}