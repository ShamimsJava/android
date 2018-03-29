/*
* Md. Shamim Sarker
* 27/03/2018
* Display image
* Using Toast
* Add listner in image
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
    android:padding="10dp">

    <ImageView
        android:id="@+id/image1"
        android:layout_width="300dp"
        android:layout_height="200dp"
        android:src="@drawable/login"
        android:scaleType="fitXY"/>

    <ImageView
        android:id="@+id/image2"
        android:layout_width="300dp"
        android:layout_height="200dp"
        android:src="@drawable/exit"
        android:scaleType="fitXY"/>

</LinearLayout>


**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.practiceone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.image1);
        img2 = findViewById(R.id.image2);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.image1){
            Toast.makeText(MainActivity.this, "This is Login Icon", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "This is Exit Icon", Toast.LENGTH_SHORT).show();
        }
    }
}