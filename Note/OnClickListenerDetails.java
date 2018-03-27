/*
* Md. Shamim Sarker
* 27/03/2018
* OnClickListener Details (Four ways)
* 1. By creating anonymous object of View.OnClickListener
* 2. By implementing View.OnClickListener
* 3. By using onClick attribute in activity xml file
* 4. By creating inner class which implements View.OnClickListener
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
    tools:context="com.sarker.shamim.shamimsarker.MainActivity">

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/button1Id"
        android:text="Button 1"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/button2Id"
        android:text="Button 2"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/button3Id"
        android:text="Button 3"
        android:onClick="display"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/button4Id"
        android:text="Clear Button"/>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/resultId"
        android:textAlignment="center"
        android:textSize="30sp"
        android:textColor="#d90303"
        android:textStyle="bold"/>

</LinearLayout>


**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1, button2, button3, button4;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1Id);
        button2 = findViewById(R.id.button2Id);
        button3 = findViewById(R.id.button3Id);
        button4 = findViewById(R.id.button4Id);
        resultView = findViewById(R.id.resultId);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("Button 1 is clicked.");
            }
        });

        button2.setOnClickListener(this);

        Handler handler = new Handler();
        button4.setOnClickListener(handler);
    }

    @Override
    public void onClick(View v) {
        resultView.setText("Button 2 is clicked.");
    }

    public void display(View view) {
        resultView.setText("Button 3 is clicked.");
    }

    class Handler implements View.OnClickListener{
        @Override
        public void onClick(View v){
            resultView.setText("");
        }
    }
}
