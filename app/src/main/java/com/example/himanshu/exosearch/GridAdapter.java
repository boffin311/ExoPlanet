package com.example.himanshu.exosearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class GridAdapter extends BaseAdapter implements Filterable {
   private ArrayList<MainActivityList> arrayList;
   private ArrayList<MainActivityList> _arrayList;
   Activity activity;
    MyHolder holder;
   public GridAdapter(ArrayList<MainActivityList> arrayList,Activity activity){
       this.arrayList=arrayList;
       this.activity=activity;
       _arrayList = arrayList;

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
    public View getView(final int position, View convertView, ViewGroup parent) {
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

         holder. gridFrame.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(activity,Main2Activity.class);
                 intent.putExtra("Data",arrayList.get(position));
                 activity.getBaseContext().startActivity(intent);
             }
         });

         return convertView;

    }

    private class MyHolder{
       TextView tvPlanetName,tvDiscovery,tvIsConfirmed,tvPeriodicDay,tvCharAtZero;
       FrameLayout gridFrame;
       public  MyHolder(View itemView)
       {
           gridFrame=itemView.findViewById(R.id.gridFrame);
           tvPlanetName=itemView.findViewById(R.id.tvPlanetName);
           tvCharAtZero=itemView.findViewById(R.id.tvChatAtZero);
           tvDiscovery=itemView.findViewById(R.id.tvDiscovery);
           tvIsConfirmed=itemView.findViewById(R.id.tvIsConfirmed);
           tvPeriodicDay=itemView.findViewById(R.id.tvPeriodicDay);
       }
    }
    @Override
    public Filter getFilter() {

       Filter filter = new Filter() {
           @Override
           protected FilterResults performFiltering(CharSequence charSequence) {
               FilterResults results = new FilterResults();
               ArrayList<MainActivityList> FilteredArrList = new ArrayList<>();

               if (_arrayList == null) {
                   _arrayList = new ArrayList<>(arrayList);
               }
               if (charSequence == null || charSequence.length() == 0) {

                   // set the Original result to return
                   results.count = _arrayList.size();
                   results.values = _arrayList;
               } else {
                   charSequence.toString().toLowerCase();
                   for (int i = 0; i < _arrayList.size(); i++) {
                       String data = _arrayList.get(i).planetIdentifier;
                       if (data.toLowerCase().startsWith(charSequence.toString())) {


                           MainActivityList newList = new MainActivityList();
                           newList.setPlanetIdentifier(_arrayList.get(i).planetIdentifier);
                           newList.setListsPlanetIsOn(_arrayList.get(i).listsPlanetIsOn);
                           newList.setDiscoveryYear(_arrayList.get(i).discoveryYear);
                           newList.setPeriodDays(_arrayList.get(i).periodDays);

                           FilteredArrList.add(newList);
                       }
                   }
                   // set the Filtered result to return
                   results.count = FilteredArrList.size();
                   results.values = FilteredArrList;
               }

               return results;
           }

           @SuppressWarnings("unchecked")
           @Override
           protected void publishResults(CharSequence charSequence, FilterResults filterResults) {

               arrayList = (ArrayList<MainActivityList>) filterResults.values;
               notifyDataSetChanged();
           }
       };
        return filter;
    }

//    public void filter(String nameExo){
//       nameExo.toLowerCase();
//
//       _arrayList.clear();
////       if(nameExo.length() == 0){
////           arrayList.addAll(_arrayList);
////       }
////       else {
////           for (MainActivityList list : _arrayList){
////               if(list.getPlanetIdentifier().toLowerCase().contains(nameExo)){
////                   arrayList.add(list);
////               }
////           }
////       }
//
//        Log.d("Adapter", "so this is " + arrayList.size() + " " + _arrayList.size());
//
//
//
//       notifyDataSetChanged();
//
//    }
}
