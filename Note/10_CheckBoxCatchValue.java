/*
* Md. Shamim Sarker
* 28/03/2018
* Creating check box
* Catch value from check box
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
        android:text="What do you want to buy?"/>

    <CheckBox
        android:id="@+id/milkId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Milk"/>

    <CheckBox
        android:id="@+id/sugarId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sugar"/>

    <CheckBox
        android:id="@+id/waterId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Water"/>

    <Button
        android:id="@+id/buyButtonId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Buy"/>

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
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheck, sugarCheck, waterCheck;
    private Button buyButton;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheck = findViewById(R.id.milkId);
        sugarCheck  = findViewById(R.id.sugarId);
        waterCheck = findViewById(R.id.waterId);
        buyButton = findViewById(R.id.buyButtonId);
        resultView = findViewById(R.id.resultTextId);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if(milkCheck.isChecked()){
                    String value = milkCheck.getText().toString();
                    stringBuilder.append(value + " is ordered" + "\n");
                }if(sugarCheck.isChecked()){
                    String value = sugarCheck.getText().toString();
                    stringBuilder.append(value + " is ordered" + "\n");
                }if(waterCheck.isChecked()){
                    String value = waterCheck.getText().toString();
                    stringBuilder.append(value + " is ordered" + "\n");
                }
                resultView.setText(stringBuilder);
            }
        });
    }
}