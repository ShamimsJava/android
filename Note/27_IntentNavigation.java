/*
* Md. Shamim Sarker
* 01/04/2018
* Working with Using Intent to navigate other activity
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
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="This is first activity"
        android:textAlignment="center"
        android:textSize="25sp"
        android:textStyle="bold"
        android:layout_marginBottom="15dp"/>

    <Button
        android:id="@+id/buttonId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Go to second activity"
        android:textSize="20sp"
        android:textStyle="bold"/>

</LinearLayout>

***************************************************************************

activity_second.xml
*******************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.sarker.shamim.shamimsarker.SecondActivity"
    android:orientation="vertical"
    android:padding="10dp"
    android:gravity="center">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="This is second activity"
        android:textAlignment="center"
        android:textSize="25sp"
        android:textStyle="bold"
        android:layout_marginBottom="15dp" />

</LinearLayout>

***************************************************************************

SecondActivity.java
*******************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}

***************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}