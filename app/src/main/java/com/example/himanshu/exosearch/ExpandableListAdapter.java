package com.example.himanshu.exosearch;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class ExpandableListAdapter extends RecyclerView.Adapter<ExpandableListAdapter.MyHolder> {


    private MyHolder holder;
    public static final String TAG="ELA";



    ArrayList<String> questionArrayList;
    ArrayList<String> unitArrayList;
    ArrayList<String> detailArrayList;
    public ExpandableListAdapter(ArrayList<String> questionArrayList,ArrayList<String> detailArrayList,ArrayList<String>unitArrayList) {
        this.questionArrayList = questionArrayList;
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



        holder.question.setText(questionArrayList.get(i));
   //   if(particularData.getValue().contains("null") | particularData.getValue().equals("") | particularData.getValue().equals("°") | particularData.getValue().equals("K")) {


//        holder.linearContent.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View v) {
//
//                          Log.d(TAG, "onClick: "+"I am clicked");
//                     View view1=(View)v.getParent();
//                     LinearLayout linear=view1.findViewById(R.id.linearMoreInfo);
//
//                     if(_listDataHeader.get(i).getQuestions().contains("MORE INFO")) {
//
//                         String formatName = _listDataHeader.get(i).getMoreInfo().replace(" ", "%20");
//                         String uri = "http://www.openexoplanetcatalogue.com/planet/"+formatName+"/";
//                         Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
//                         _context.startActivity(browse);
//
//                     }else{
//                         if (linear.getVisibility() == View.GONE) {
//                             linear.setVisibility(View.VISIBLE);
//                             Log.d(TAG, "onClick: " + "I am clicked and my visibility is gone");
//                         } else {
//                             Log.d(TAG, "onClick: " + "I am clicked and my Visibility is visible");
//                             linear.setVisibility(View.GONE);
//                         }
//                     }
//
//                      }
//                  });

//        if(_listDataHeader.get(i).getQuestions().contains("MORE INFO")){
//            holder.linearContent.setBackgroundColor(Color.DKGRAY);
//            holder.question.setTextColor(Color.WHITE);
//            holder.shortAns.setTextColor(Color.WHITE);
     //   }

//        MoreInfoContent moreInfoContent = _listDataHeader.get(i);
        String value=unitArrayList.get(i);
      //  holder.question.setText(questionArrayList.get(i));
        if(value.contains("null") | value.equals("") | value.equals("°") | value.equals("K")) {

            holder.shortAns.setText("Not Available");
        }else
            holder.shortAns.setText(value);

        holder.moreInfo.setText(detailArrayList.get(i));
    }

    @Override
    public int getItemCount() {
        return  questionArrayList.size();
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