/*
* Md. Shamim Sarker
* 28/03/2018
* Seek Bar
* Catch value from seek bar
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

    <SeekBar
        android:id="@+id/seekId"
        android:layout_width="250dp"
        android:layout_height="wrap_content"
        android:max="10"
        android:thumbTint="#9f0b0b"/>

    <TextView
        android:id="@+id/textId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Volume : 0"/>

</LinearLayout>


**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekId);
        textView = findViewById(R.id.textId);

        textView.setText("Volume : " + seekBar.getProgress()+"/"+seekBar.getMax());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("Volume : " + progress+"/"+seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "On Start Tracking Touch", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "On Stop Tracking Touch", Toast.LENGTH_SHORT).show();
            }
        });
    }
}