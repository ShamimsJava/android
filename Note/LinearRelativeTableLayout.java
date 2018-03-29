/*
* Md. Shamim Sarker
* 27/03/2018
* Basic Hello World Application
*/

linear_layout_horizontal.xml
****************************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#d4c7f1"
    android:orientation="horizontal"
    android:weightSum="3">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Button 1"/>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Button 2"/>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Button 3"/>

</LinearLayout>


**********************************************************************************************

linear_layout_vertical.xml
**************************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#d4c7f1"
    android:orientation="vertical"
    android:weightSum="4"
    android:padding="10dp">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Linear Layout Vertical"
        android:textSize="25sp"
        android:textAlignment="center"
        android:textColor="#0819d6"
        android:textStyle="bold"
        android:textAllCaps="true"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Button 1"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="2"
        android:text="Button 2"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Button 3"/>

</LinearLayout>


**********************************************************************************************

linear_layout_login.xml
***********************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#f5c9c9"
    android:padding="10dp">

    <TextView
        android:id="@+id/email"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Email:" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Email Address"
        android:background="#fff"/>

    <TextView
        android:id="@+id/pass"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Password:" />

    <EditText
        android:id="@+id/editText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPassword"
        android:hint="Enter Password"
        android:background="#fff"/>

    <Button
        android:id="@+id/button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Login" />

</LinearLayout>


**********************************************************************************************

linear_layout_complex.xml
*************************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#d4c7f1"
    android:orientation="vertical"
    android:padding="10dp"
    android:weightSum="4">

    <ImageView
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:src="@drawable/icon"
        android:layout_gravity="center"/>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Linear Complex Layout"
        android:textAlignment="center"
        android:textAllCaps="true"
        android:textColor="#0819d6"
        android:textSize="25sp"
        android:textStyle="bold" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/b1"
        android:onClick="display"
        android:layout_weight="1"
        android:text="Button" />


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="2"
        android:orientation="horizontal"
        android:weightSum="3">

        <Button
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:id="@+id/b2"
            android:layout_weight="1"
            android:text="Button" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:orientation="vertical"
            android:weightSum="3">

            <Button
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:id="@+id/b3"
                android:layout_weight="1"
                android:text="Button" />

            <Button
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:id="@+id/b4"
                android:layout_weight="1"
                android:text="Button" />

            <Button
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:id="@+id/b5"
                android:layout_weight="1"
                android:text="Button" />
        </LinearLayout>

        <Button
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:id="@+id/b6"
            android:layout_weight="1"
            android:text="Button" />
    </LinearLayout>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/b7"
        android:layout_weight="1"
        android:text="Button" />

</LinearLayout>

**********************************************************************************************

relative_layout.xml
*******************

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#f79b9b"
    android:padding="10dp">

    <TextView
        android:id="@+id/label"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Email"/>

    <EditText
        android:id="@+id/inputEmail"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/label"
        android:background="#fff"/>

    <Button
        android:id="@+id/btnLogin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/inputEmail"
        android:text="Login"
        android:textAllCaps="false" />

    <Button
        android:id="@+id/btnCancel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignTop="@+id/btnLogin"
        android:layout_toRightOf="@+id/btnLogin"
        android:text="Cancel"
        android:textAllCaps="false" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:text="Register New Account"
        android:textAllCaps="false" />

</RelativeLayout>

**********************************************************************************************

table_layout.xml
****************

<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:shrinkColumns="*"
    android:stretchColumns="*"
    android:background="#fff">

    <TableRow
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:gravity="center_horizontal">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:text="Row 1"
            android:layout_span="3"
            android:padding="18dp"
            android:background="#f56f6f"
            android:textColor="#000000"/>
    </TableRow>

    <TableRow
        android:id="@+id/tableRow1"
        android:layout_height="wrap_content"
        android:layout_width="match_parent">
        <TextView
            android:id="@+id/TextView04"
            android:text="Row 2 column 1"
            android:layout_weight="1"
            android:background="#dcdcdc"
            android:textColor="#000"
            android:padding="20dp"
            android:gravity="center"/>

        <TextView
            android:id="@+id/TextView05"
            android:text="Row 2 column 2"
            android:layout_weight="1"
            android:background="#f5b2b2"
            android:textColor="#000"
            android:padding="20dp"
            android:gravity="center"/>

        <TextView
            android:id="@+id/TextView06"
            android:text="Row 2 column 3"
            android:layout_weight="1"
            android:background="#9beddc"
            android:textColor="#000"
            android:padding="20dp"
            android:gravity="center"/>
    </TableRow>

    <TableRow
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:gravity="center_horizontal">
        <TextView
            android:id="@+id/TextView07"
            android:text="Row 3 column 1"
            android:layout_weight="1"
            android:background="#e2f1ef"
            android:textColor="#000"
            android:padding="20dp"
            android:gravity="center"/>

        <TextView
            android:id="@+id/TextView08"
            android:text="Row 3 column 1"
            android:layout_weight="1"
            android:background="#c58ad1"
            android:textColor="#000"
            android:padding="20dp"
            android:gravity="center"/>
    </TableRow>
</TableLayout>

**********************************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}