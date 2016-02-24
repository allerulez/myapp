package com.example.aleksi.myapplication;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aleksi on 2/24/16.Säger vi
 */

public class EnAdapter implements ListAdapter{
    ArrayList<String> data;
    Context context;
    DataSetObserver observer;

    public EnAdapter(Context c, ArrayList info) {
        this.context = c;
        this.data = info;

    }


    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {
        this.observer = observer;
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    public void addData(String newData) {
        this.data.add(newData);
        this.observer.notify();

    }

    @Override
    public int getCount() {
        return 0;
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
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            String data = (String) getItem(position);
            TextView tv = new TextView(this.context);
            tv.setText(data);
            return tv;
        }
        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

}
