/*
* Md. Shamim Sarker
* 01/04/2018
* ###############################################
* @@@@@@@@@ Project: Country Profile @@@@@@@@@@@@
* ############################################### 
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

    <AnalogClock
        android:layout_marginTop="10dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <Button
        android:id="@+id/bangladeshButtonId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Bangladesh"
        android:textSize="20sp"
        style="@style/Widget.AppCompat.Button.Colored"/>

    <Button
        android:id="@+id/indiaButtonId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="India"
        android:textSize="20sp"
        style="@style/Widget.AppCompat.Button.Colored"/>

    <Button
        android:id="@+id/americaButtonId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="America"
        android:textSize="20sp"
        style="@style/Widget.AppCompat.Button.Colored"/>

</LinearLayout>

***************************************************************************

activity_profile.xml
********************

<?xml version="1.0" encoding="utf-8"?>
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.sarker.shamim.shamimsarker.ProfileActivity"
    android:background="#f1d6d6"
    android:padding="10dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <ImageView
            android:scaleType="fitXY"
            android:src="@mipmap/ic_launcher"
            android:id="@+id/imageViewId"
            android:layout_width="match_parent"
            android:layout_height="250dp" />

        <TextView
            android:id="@+id/textViewId"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:textSize="20sp"
            android:textStyle="bold"
            android:layout_marginTop="10dp"/>
    </LinearLayout>

</ScrollView>


***************************************************************************

ProfileActivity.java
********************

package com.sarker.shamim.shamimsarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.imageViewId);
        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){

            String countryName = bundle.getString("name");

            showDetails(countryName);
        }
    }

    void showDetails(String countryName){

        if(countryName.equals("bangladesh")){

            imageView.setImageResource(R.drawable.dhaka);
            textView.setText(R.string.bangladesh_text);
        }

        if(countryName.equals("india")){

            imageView.setImageResource(R.drawable.tajmahal);
            textView.setText(R.string.india_text);
        }

        if(countryName.equals("america")){

            imageView.setImageResource(R.drawable.america);
            textView.setText(R.string.america_text);
        }
    }
}


***************************************************************************

MainActivity.java
*****************

package com.sarker.shamim.shamimsarker;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bangladeshButton, indiaButton, americaButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton = findViewById(R.id.bangladeshButtonId);
        indiaButton = findViewById(R.id.indiaButtonId);
        americaButton = findViewById(R.id.americaButtonId);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        americaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.bangladeshButtonId){

            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }

        if(v.getId() == R.id.indiaButtonId){

            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "india");
            startActivity(intent);
        }

        if(v.getId() == R.id.americaButtonId){

            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "america");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.mipmap.ic_launcher_round);
        alertDialogBuilder.setTitle("Alert Title!");
        alertDialogBuilder.setMessage("Do you want to exit?");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}