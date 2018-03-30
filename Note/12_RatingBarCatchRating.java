/*
* Md. Shamim Sarker
* 28/03/2018
* Rating Bar
* Catch value from rating bar
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

    <RatingBar
        android:id="@+id/ratingId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:rating="2"
        android:stepSize="1"
        android:numStars="5"
        android:progressTint="#1c56a1"
        android:progressBackgroundTint="#a48888"/>

    <TextView
        android:id="@+id/textId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="25sp"/>

</LinearLayout>

**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingId);
        textView = findViewById(R.id.textId);

        textView.setText("Rating is : " + (float)ratingBar.getProgress());

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText("Rating is : " + rating);
            }
        });
    }
}