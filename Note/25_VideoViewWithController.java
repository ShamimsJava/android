/*
* Md. Shamim Sarker
* 30/03/2018
* Working with VideoView and Controller
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

    <VideoView
        android:id="@+id/videoViewId"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</LinearLayout>

***************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity{

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoViewId);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sample_video);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);

        videoView.setMediaController(mediaController);

        //videoView.start();
    }
}

//create raw directory under res folder and paste video inside raw directory.
// video name should be small letter