/*
* Md. Shamim Sarker
* 30/03/2018
* Working with TimePicker
*/

activity_main.xml
*****************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="com.sarker.shamim.shamimsarker.MainActivity"
    android:padding="10dp">

   <TimePicker
       android:id="@+id/timePickerId"
       android:layout_width="match_parent"
       android:layout_height="wrap_content">

   </TimePicker>

    <Button
        android:id="@+id/buttonId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Current Time"
        android:layout_gravity="center"/>

    <TextView
        android:id="@+id/textViewId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textAlignment="center"/>

</LinearLayout>

**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity{

   TimePicker timePicker;
   TextView textView;
   Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.timePickerId);
        timePicker.setIs24HourView(true);
        textView = findViewById(R.id.textViewId);
        button = findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String time = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
                textView.setText(time);
            }
        });
    }
}