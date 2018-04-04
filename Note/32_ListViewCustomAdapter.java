/*
* Md. Shamim Sarker
* 03/04/2018
* List view with custom adapter
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

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="65dp"
        android:weightSum="4"
        android:layout_marginTop="10dp"
        android:layout_marginBottom="10dp">

        <ImageView
            android:id="@+id/imageViewId"
            android:layout_weight="1"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher_round"/>

        <LinearLayout
            android:layout_weight="3"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <TextView
                android:id="@+id/countryNamedId"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:gravity="center_horizontal"
                android:textStyle="bold"
                android:text="Country Name"
                android:textAppearance="?android:attr/textAppearanceLarge"/>

            <TextView
                android:id="@+id/countryDescriptionId"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="5dp"
                android:layout_marginLeft="20dp"
                android:gravity="center_horizontal"
                android:textStyle="bold"
                android:text="Country Name"
                android:textAppearance="?android:attr/textAppearanceSmall"/>

        </LinearLayout>

    </LinearLayout>

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

    int [] flags;
    String[] countryNames;
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] countryNames, int[] flags) {
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

        TextView textView = convertView.findViewById(R.id.countryNamedId);

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
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryNames;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);

        listView = findViewById(R.id.listViewId);

        CustomAdapter adapter = new CustomAdapter(this, countryNames, flags);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = countryNames[position];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
