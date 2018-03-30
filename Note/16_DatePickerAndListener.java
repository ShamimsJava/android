/*
* Md. Shamim Sarker
* 30/03/2018
* Working with DatePicker
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
    android:padding="10dp"
    android:gravity="center">

    <TextView
        android:id="@+id/dateTextId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textAlignment="center"/>

    <Button
        android:id="@+id/selectButtonId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select Date"/>

    <DatePicker
        android:id="@+id/datePickerId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
    </DatePicker>

</LinearLayout>

**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView textView;
   DatePicker datePicker;
   Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.dateTextId);
        datePicker = findViewById(R.id.datePickerId);
        button = findViewById(R.id.selectButtonId);

        textView.setText(currentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(currentDate());
            }
        });
    }


    String currentDate(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Current date : ");
        stringBuilder.append(datePicker.getDayOfMonth() + "/");
        stringBuilder.append(datePicker.getMonth() + "/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();
    }
}