package com.example.himanshu.exosearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ExpandableListAdapter extends BaseAdapter {

    private Context _context;
    private MyHolder holder;
    private ArrayList<MoreInfoContent> _listDataHeader;

    public ExpandableListAdapter(Context context, ArrayList<MoreInfoContent> listDataHeader){

        this._context = context;
        this._listDataHeader = listDataHeader;

    }


    @Override
    public int getCount() {
        return _listDataHeader.size();
    }

    @Override
    public Object getItem(int i) {
        return _listDataHeader.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater li= (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view==null)
        {view=li.inflate(R.layout.list_exploration,viewGroup,false);

            holder = new MyHolder(view);
            view.setTag(holder);}
            else
             holder = (MyHolder) view.getTag();


        MoreInfoContent moreInfoContent = _listDataHeader.get(i);
        holder.question.setText(moreInfoContent.getQuestions());
        holder.shortAns.setText(moreInfoContent.getShort_ans());
        holder.moreInfo.setText(moreInfoContent.getMoreInfo());

        holder.contentFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.moreInfoLayout.getVisibility() == View.GONE)
                    holder.moreInfoLayout.setVisibility(View.VISIBLE);

                else
                    holder.moreInfoLayout.setVisibility(View.GONE);
            }
        });




        return view;
    }

    private class MyHolder{
        TextView question,shortAns,moreInfo;
        FrameLayout contentFrame;
        LinearLayout moreInfoLayout;
        public  MyHolder(View itemView)
        {
            contentFrame=itemView.findViewById(R.id.contentFrame);
            question=itemView.findViewById(R.id.question);
            shortAns=itemView.findViewById(R.id.short_answer);
            moreInfo=itemView.findViewById(R.id.moreInfo);
            moreInfoLayout = itemView.findViewById(R.id.moreInfoLayout);

        }
    }
}
