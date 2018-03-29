/*
* Md. Shamim Sarker
* 28/03/2018
* Creating list
* Creating context menu
* Add listener
*/

activity_main.xml
*****************

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.shamim.shamimsarker.MainActivity"
    android:padding="10dp">

    <ListView
        android:id="@+id/listView1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
    </ListView>

</RelativeLayout>

**********************************************************************************************

activity_call.xml
*****************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.shamim.shamimsarker.CallActivity"
    android:orientation="vertical"
    android:gravity="center">
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Calling.................."
    android:layout_gravity="center"
    android:textSize="35sp"
    android:textColor="#ec0707"
    android:textStyle="bold"/>
</LinearLayout>

**********************************************************************************************

activity_sms.xml
****************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.shamim.shamimsarker.SmsActivity"
    android:orientation="vertical"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sending Sms..."
        android:layout_gravity="center"
        android:textSize="35sp"
        android:textColor="#ec0707"
        android:textStyle="bold"/>

</LinearLayout>

**********************************************************************************************

MainActivity.java
*****************

package com.shamim.shamimsarker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView1;
    String contacts[] = {"Shamim", "Atik", "Ruhul", "Shabib", "Parvez"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, contacts);
        listView1.setAdapter(adapter);

       registerForContextMenu(listView1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Click on any Action");
        menu.add(0, Menu.FIRST, Menu.NONE, "Call");
        menu.add(1, Menu.FIRST, Menu.NONE, "SMS");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle() == "Call"){
            Toast.makeText(getApplicationContext(), "Calling code", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, CallActivity.class);
            startActivity(intent);
        }else if(item.getTitle() == "SMS"){
            Toast.makeText(getApplicationContext(), "Sending sms code", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SmsActivity.class);
            startActivity(intent);
        }else{
            return false;
        }
        return true;
    }
}
