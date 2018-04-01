/*
* Md. Shamim Sarker
* 30/03/2018
* Working with Custom Font
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

    <TextView
        android:id="@+id/textViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Md. Shamim Sarker"
        android:textSize="25sp"
        android:typeface="serif"/>

    <TextView
        android:id="@+id/textViewId1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Md. Shamim Sarker"
        android:textSize="25sp"/>

</LinearLayout>

**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    TextView textView;
    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewId1);

        typeface = Typeface.createFromAsset(getAssets(), "font/alex_brush.ttf");

        textView.setTypeface(typeface);
    }
}

/*
 find custom font: https://www.fontsquirrel.com/
 Create font folder: Project/app/src/main/Right button/New/Directory/assets/paste font folder
*/