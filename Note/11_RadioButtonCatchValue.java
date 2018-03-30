/*
* Md. Shamim Sarker
* 28/03/2018
* Creating radio button
* Catch value from radio button
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

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="What is your gender?"/>

   <RadioGroup
       android:id="@+id/rdGroupId"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content">

       <RadioButton
           android:id="@+id/maleId"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="Male"/>

       <RadioButton
           android:id="@+id/femaleId"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="Female"/>

   </RadioGroup>

    <Button
        android:id="@+id/selectId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Submit"/>

    <TextView
        android:id="@+id/resultTextId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

</LinearLayout>


**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button button;
    private RadioButton genderRadio;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.rdGroupId);
        button = findViewById(R.id.selectId);
        textView = findViewById(R.id.resultTextId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                genderRadio = findViewById(selectedId);
                String value = genderRadio.getText().toString();
                textView.setText("You have selected " + value);
            }
        });

    }
}