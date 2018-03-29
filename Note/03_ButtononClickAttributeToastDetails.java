/*
* Md. Shamim Sarker
* 26/03/2018
* Button handle with onClick attribute
* Using Toast details
* See output on Logcat by debugger or verbose
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
        android:text="Button 1"
        android:onClick="display"/>

    <Button
        android:id="@+id/b2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Button 2"
        android:onClick="display"/>

    <Button
        android:id="@+id/b3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Clear"
        android:onClick="display"/>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/t"
        android:textAlignment="center"
        android:textSize="30sp"
        android:textStyle="bold"
        android:textColor="#e40e0e"/>

</LinearLayout>

**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.practiceone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1, b2, b3;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        tv = findViewById(R.id.t);
    }

    public void display(View view) {
        if (view.getId() == R.id.b1) {
            tv.setText("Click on button 1");
            Toast.makeText(MainActivity.this, "Clicked on button 1", Toast.LENGTH_SHORT).show();
            Log.v("tag", "Clicked on button 1");
        } else if (view.getId() == R.id.b2) {
            tv.setText("Click on button 2");
            Toast toast = Toast.makeText(MainActivity.this, "Clicked on button 2", Toast.LENGTH_SHORT);
            toast.show();
            Log.v("tag", "Clicked on button 2");
        } else {
            tv.setText("");
            Toast toast = Toast.makeText(MainActivity.this, "Clicked on Clear Button", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            Log.v("tag", "Clicked on clear button");
        }
    }
}