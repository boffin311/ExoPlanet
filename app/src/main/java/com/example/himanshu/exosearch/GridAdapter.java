package com.example.himanshu.exosearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
   ArrayList<MainActivityList> arrayList;
    MyHolder holder;
   public GridAdapter(ArrayList<MainActivityList> arrayList){
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
         if (convertView==null)
         {convertView=li.inflate(R.layout.grid_planet_view,parent,false);

             holder = new MyHolder(convertView);
             convertView.setTag(holder);}
         else
             holder= (MyHolder) convertView.getTag();
//        TextView tvPlanetName=convertView.findViewById(R.id.tvPlanetName);
        MainActivityList mainActivityList=arrayList.get(position);
        holder.tvCharAtZero.setText(String.valueOf(mainActivityList.getPlanetIdentifier().charAt(0)));
         holder.tvPlanetName.setText(mainActivityList.getPlanetIdentifier());
         holder.tvDiscovery.setText("Discovered: "+mainActivityList.getDiscoveryYear());
         holder.tvIsConfirmed.setText(mainActivityList.getListsPlanetIsOn());
         if (mainActivityList.getPeriodDays().length()>=5)
         holder.tvPeriodicDay.setText(mainActivityList.getPeriodDays().substring(0,5));
         else
             holder.tvPeriodicDay.setText(mainActivityList.getPeriodDays());

         return convertView;

    }
    private class MyHolder{
       TextView tvPlanetName,tvDiscovery,tvIsConfirmed,tvPeriodicDay,tvCharAtZero;
       public  MyHolder(View itemView)
       {
           tvPlanetName=itemView.findViewById(R.id.tvPlanetName);
           tvCharAtZero=itemView.findViewById(R.id.tvChatAtZero);
           tvDiscovery=itemView.findViewById(R.id.tvDiscovery);
           tvIsConfirmed=itemView.findViewById(R.id.tvIsConfirmed);
           tvPeriodicDay=itemView.findViewById(R.id.tvPeriodicDay);
       }
    }
}
