/*
* Md. Shamim Sarker
* 03/04/2018
* List view
*/

strings.xml
**********

<resources>
    <string name="app_name">Shihab Sharar</string>
    
    <string-array name="country_names">
        <item>Bangladesh</item>
        <item>India</item>
        <item>Nepal</item>
        <item>Bhutan</item>
        <item>Shrilanka</item>
        <item>Pakistan</item>
        <item>Afghanistan</item>
        <item>Iraq</item>
        <item>Iran</item>
        <item>America</item>
    </string-array>
</resources>

***************************************************************************

activity_main.xml
*****************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.sarker.shamim.shihabsharar.MainActivity"
    android:orientation="vertical"
    android:padding="10dp"
    android:background="#9f8686">

    <ListView
        android:id="@+id/listViewId"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:divider="#000"
        android:dividerHeight="2dp"
        android:listSelector="#a8cdf1">
    </ListView>

</LinearLayout>

***********************************************************************

sample_view.xml
***************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/textViewId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Hello There"
        android:height="50dp"
        android:textSize="20sp"
        android:textStyle="bold"
        android:textAlignment="center"
        android:gravity="center_vertical"
        android:padding="5dp"/>

</LinearLayout>

**********************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shihabsharar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        final String[] countryNames = getResources().getStringArray(R.array.country_names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.sample_view, R.id.textViewId, countryNames);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = countryNames[position];
                Toast.makeText(MainActivity.this, value + " " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}