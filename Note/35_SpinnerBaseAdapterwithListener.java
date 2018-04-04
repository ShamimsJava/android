/*
* Md. Shamim Sarker
* 03/04/2018
* Spinner With Base Adapter with listener
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

    <string-array name="population">
        <item>23 million</item>
        <item>22 million</item>
        <item>21 million</item>
        <item>20 million</item>
        <item>19 million</item>
        <item>18 million</item>
        <item>17 million</item>
        <item>16 million</item>
        <item>15 million</item>
        <item>14 million</item>
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
    android:background="#9f8686"
    android:gravity="center|top">

    <Spinner
        android:id="@+id/spinnerId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"></Spinner>

</LinearLayout>


***********************************************************************

sample_view.xml
***************

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="80dp">

    <ImageView
        android:id="@+id/imageViewId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@mipmap/ic_launcher_round"
        android:padding="5dp"/>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:gravity="center"
        android:paddingLeft="10dp">

        <TextView
            android:id="@+id/countrynameTextViewId"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Bangladesh"
            android:textSize="20sp"/>

        <TextView
            android:id="@+id/populationTextViewId"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="22 Million"
            android:textSize="14sp"/>

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


public class CustomAdapter extends BaseAdapter {

    private String[] countryNames;
    private String[] population;
    int[] flags;
    Context context;
    private LayoutInflater layoutInflater;

    CustomAdapter(Context context, int[] flags, String[] countryNames, String[] population) {
        this.countryNames = countryNames;
        this.population = population;
        this.flags = flags;
        this.context = context;
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
    public View getView(int position, View view, ViewGroup parent) {

        if (view == null) {

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample_view, null, false);


        }

        ImageView imageView = view.findViewById(R.id.imageViewId);
        imageView.setImageResource(flags[position]);

        TextView country = view.findViewById(R.id.countrynameTextViewId);
        country.setText(countryNames[position]);

        TextView populationNumber = view.findViewById(R.id.populationTextViewId);
        populationNumber.setText(population[position]);

        return view;
    }
}

********************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shihabsharar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] countryNames;
    private Spinner spinner;
    private String[] population;
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

    private boolean isFirstSelection = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);
        population = getResources().getStringArray(R.array.population);


        spinner = findViewById(R.id.spinnerId);


        CustomAdapter customAdapter = new CustomAdapter(this, flags, countryNames, population);
        spinner.setAdapter(customAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(isFirstSelection == true){
                    isFirstSelection = false;
                }else{
                    Toast.makeText(getApplicationContext(), countryNames[position] + " is selected ", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
