/*
* Md. Shamim Sarker
* 30/03/2018
* Working with DatePickerDialog
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

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

   TextView textView;
   Button button;
   DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.dateTextId);
        button = findViewById(R.id.selectButtonId);

        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        DatePicker datePicker = new DatePicker(this);
        int currentDay = datePicker.getDayOfMonth();
        int currentMonth = datePicker.getMonth();
        int currentYear = datePicker.getYear();

        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                textView.setText(dayOfMonth + "/" + month + "/" + year);

            }
        }, currentYear, currentMonth, currentDay);

        datePickerDialog.show();
    }
}