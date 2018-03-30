package com.shamim.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shamim on 3/30/2018.
 */

public class CustomAdapter extends BaseAdapter{

    Context context;
    String countryList[];
    int flags[];
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] countryList, int[] flags) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.listview, null);
        TextView country = view.findViewById(R.id.textView);
        ImageView icon = view.findViewById(R.id.imageView);
        country.setText(countryList[i]);
        icon.setImageResource(flags[i]);
        return view;
    }
}
