/*
* Md. Shamim Sarker
* 30/03/2018
* Working with Zoom In Zoom Out
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

    <ImageView
        android:id="@+id/imageViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@mipmap/ic_launcher_round"/>

    <ZoomControls
        android:id="@+id/zoomControlsId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="100dp"></ZoomControls>

</LinearLayout>

***************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity{

    ImageView imageView;
    ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageViewId);
        zoomControls = findViewById(R.id.zoomControlsId);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX((float) x+1);
                imageView.setScaleY((float) y+1);

                Toast.makeText(MainActivity.this, "Zoom In", Toast.LENGTH_SHORT).show();
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX((float) x-1);
                imageView.setScaleY((float) y-1);

                Toast.makeText(MainActivity.this, "Zoom Out", Toast.LENGTH_SHORT).show();
            }
        });
    }
}