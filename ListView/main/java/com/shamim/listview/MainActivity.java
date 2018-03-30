package com.shamim.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;
    Button btn;

    String countryList[] = {"Bangladesh", "India", "China", "Australia", "Portugle", "America", "New Zealand"};

    int flags[] = {
            android.R.mipmap.sym_def_app_icon,
            android.R.mipmap.sym_def_app_icon,
            android.R.mipmap.sym_def_app_icon,
            android.R.mipmap.sym_def_app_icon,
            android.R.mipmap.sym_def_app_icon,
            android.R.mipmap.sym_def_app_icon,
            android.R.mipmap.sym_def_app_icon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView = findViewById(R.id.simpleListView);

        CustomAdapter customAdapter = new CustomAdapter(getApplication(), countryList, flags);
        simpleListView.setAdapter(customAdapter);
    }
}
