package com.example.himanshu.exosearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
   ArrayList<Integer> arrayList;
   public GridAdapter(ArrayList<Integer> arrayList){
       this.arrayList=arrayList;
   }
    @Override
    public int getCount() {
        return  arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         LayoutInflater li= (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         convertView=li.inflate(R.layout.grid_planet_view,parent,false);
         return convertView;

    }
}
