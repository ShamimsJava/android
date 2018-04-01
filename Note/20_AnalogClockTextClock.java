/*
* Md. Shamim Sarker
* 30/03/2018
* Working with Analog Clock Digital Clock
*/

activity_main.xml
*****************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="com.sarker.shamim.shamimsarker.MainActivity"
    android:padding="10dp"
    android:gravity="center">

    <AnalogClock
        android:id="@+id/analogClockId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#91eaa1"
        android:onClick="display"/>

    <DigitalClock
        android:id="@+id/digitalClockId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <TextClock
        android:id="@+id/textClockId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</LinearLayout>

**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View view) {
        if(view.getId() == R.id.analogClockId){
            Toast.makeText(MainActivity.this, "Analog Clock", Toast.LENGTH_SHORT).show();
        }
    }
}