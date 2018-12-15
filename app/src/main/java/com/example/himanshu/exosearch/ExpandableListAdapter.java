package com.example.himanshu.exosearch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ExpandableListAdapter extends RecyclerView.Adapter<ExpandableListAdapter.MyHolder> {


    private MyHolder holder;
    public static final String TAG="ELA";


    ArrayList<ParticularData> particularDataArrayList;
    ArrayList<String> unitArrayList;
    ArrayList<String> detailArrayList;
    public ExpandableListAdapter(ArrayList<ParticularData> particularData,ArrayList<String> detailArrayList,ArrayList<String>unitArrayList) {
        this.particularDataArrayList = particularData;
        this.detailArrayList=detailArrayList;
        this.unitArrayList=unitArrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li= (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=li.inflate(R.layout.list_exploration,viewGroup,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int i) {


        ParticularData particularData=particularDataArrayList.get(i);
        holder.question.setText(particularData.getTopic());
        if(particularData.getValue().contains("null") | particularData.getValue().equals("") | particularData.getValue().equals("°") | particularData.getValue().equals("K")) {
            holder.shortAns.setText("Not Available");
        }else
            holder.shortAns.setText(particularData.getValue()+unitArrayList.get(i));

        holder.moreInfo.setText(detailArrayList.get(i));
    }

    @Override
    public int getItemCount() {
        return  particularDataArrayList.size();
    }


//    @Override
//    public int getCount() {
//        return _listDataHeader.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return _listDataHeader.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    @Override
//    public View getView( int i, View view, ViewGroup viewGroup) {
//
//        LayoutInflater li= (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        if (view==null)
//
//        {view=li.inflate(R.layout.list_exploration,viewGroup,false);
//              view.getTag();
//            holder = new MyHolder(view);
//            view.setTag(holder);}
//            else
//             holder = (MyHolder) view.getTag();
//          holder.linearContent.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View v) {
//
//                          Log.d(TAG, "onClick: "+"I am clicked");
//                     View view1=(View)v.getParent();
//                     LinearLayout linear=view1.findViewById(R.id.linearMoreInfo);
//                     if (linear.getVisibility()==View.GONE)
//                     {linear.setVisibility(View.VISIBLE);
//                         Log.d(TAG, "onClick: "+"I am clicked and my visibility is gone");
//                     }
//                     else
//                     { Log.d(TAG, "onClick: "+"I am clicked and my Visibility is visible");
//                         linear.setVisibility(View.GONE);
//                         }
//
//
//                      }
//                  });
//
//
//        MoreInfoContent moreInfoContent = _listDataHeader.get(i);
//        holder.question.setText(moreInfoContent.getQuestions());
//        holder.shortAns.setText(moreInfoContent.getShort_ans());
//        holder.moreInfo.setText(moreInfoContent.getMoreInfo());
//
//
//
//
//
//        return view;
//    }

     class MyHolder extends RecyclerView.ViewHolder{
        TextView question,shortAns,moreInfo;
        LinearLayout linearContent;
        LinearLayout linearMoreInfo;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            linearContent=itemView.findViewById(R.id.linearContent);
            question=itemView.findViewById(R.id.question);
            shortAns=itemView.findViewById(R.id.short_answer);
            moreInfo=itemView.findViewById(R.id.moreInfo);
            linearMoreInfo = itemView.findViewById(R.id.linearMoreInfo);
        }

    }
}
