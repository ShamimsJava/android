/*
* Md. Shamim Sarker
* 03/04/2018
* Grid view with custom adapter
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

    <GridView
        android:id="@+id/gridViewId"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:numColumns="3"
        android:listSelector="#ed9191"
        android:horizontalSpacing="10dp"
        android:verticalSpacing="10dp">

    </GridView>

</LinearLayout>


***********************************************************************

sample_view.xml
***************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ImageView
        android:id="@+id/imageViewId"
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:scaleType="fitXY"
        android:layout_gravity="center_horizontal"
        android:src="@mipmap/ic_launcher_round"/>

    <TextView
        android:id="@+id/textViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sample Text"
        android:layout_gravity="center_horizontal"
        android:textAppearance="?android:attr/textAppearanceMedium"/>

</LinearLayout>

**********************************************************************

CustomAdapter.java
******************

package com.sarker.shamim.shihabsharar;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{

    Context context;
    int[] flags;
    String[] countryNames;
    private LayoutInflater inflater;

    CustomAdapter(Context context, String[] countryNames, int[] flags){
        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewId);
        TextView textView = convertView.findViewById(R.id.textViewId);

        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);

        return convertView;
    }
}


**********************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shihabsharar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    private int[] flags = {
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round
    };

    String[] countryNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);

        gridView = findViewById(R.id.gridViewId);

        CustomAdapter adapter = new CustomAdapter(this, countryNames, flags);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = countryNames[position];

                Toast.makeText(MainActivity.this, value + " " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
