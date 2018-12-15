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
import android.widget.ImageView;
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
    public void onBindViewHolder(@NonNull MyHolder holder, final int i) {



        holder.question.setText(questionArrayList.get(i));


        holder.linearContent.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                          Log.d(TAG, "onClick: "+"I am clicked");
                     View view1=(View)v.getParent();
                     LinearLayout linear=view1.findViewById(R.id.linearMoreInfo);
                     ImageView image=view1.findViewById(R.id.imageDown);
                     if (linear.getVisibility()==View.VISIBLE && detailArrayList.get(i).length()>=80)
                     {linear.setVisibility(View.GONE);
                      image.setImageResource(R.drawable.ic_keyboard_arrow_down);
                     }
                     else
                     {linear.setVisibility(View.VISIBLE);
                     image.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);}

                     }
                });


        String value=unitArrayList.get(i);
        if(value.contains("null") | value.equals("") | value.equals("°") | value.equals("K")) {
            holder.shortAns.setText("Not Available");
        }else
            holder.shortAns.setText(value);
        holder.moreInfo.setText(detailArrayList.get(i));
           if (detailArrayList.get(i).length()>=80)
           {  holder.linearMoreInfo.setVisibility(View.GONE);
           holder.imageDown.setImageResource(R.drawable.ic_keyboard_arrow_down);}
           else
           { holder.linearMoreInfo.setVisibility(View.VISIBLE);
           holder.imageDown.setVisibility(View.GONE);}


    }

    @Override
    public int getItemCount() {
        return  questionArrayList.size();
    }




     class MyHolder extends RecyclerView.ViewHolder{
        TextView question,shortAns,moreInfo;
        LinearLayout linearContent;
        LinearLayout linearMoreInfo;
        ImageView imageDown;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            linearContent=itemView.findViewById(R.id.linearContent);
            question=itemView.findViewById(R.id.question);
            imageDown=itemView.findViewById(R.id.imageDown);
            shortAns=itemView.findViewById(R.id.short_answer);
            moreInfo=itemView.findViewById(R.id.moreInfo);
            linearMoreInfo = itemView.findViewById(R.id.linearMoreInfo);
        }

    }
}