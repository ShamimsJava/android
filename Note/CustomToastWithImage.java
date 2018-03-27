/*
* Md. Shamim Sarker
* 27/03/2018
* Custome Toast
* Using image and text
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


    <Button
        android:id="@+id/btn1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Button" />
        
</LinearLayout>


**********************************************************************************************

custometoast_layout.xml
***********************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/customToastId"
    android:orientation="horizontal"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:padding="15dp"
    android:layout_gravity="center">

    <ImageView
        android:layout_width="35dp"
        android:layout_height="35dp"
        android:src="@mipmap/ic_launcher_round"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Clicked on Button"
        android:layout_gravity="center"
        android:layout_marginLeft="10dp"/>

</LinearLayout>


**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.practiceone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = getLayoutInflater();

                View customeToast = inflater.inflate(R.layout.customtoast_layout, (ViewGroup) findViewById(R.id.customToastId));

                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(customeToast);
                toast.show();
            }
        });
    }
}