package com.example.himanshu.exosearch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ExpandedRecyclerAdapter extends RecyclerView.Adapter<ExpandedRecyclerAdapter.MyHolder> {
ArrayList<ParticularData> particularDataArrayList;

    public ExpandedRecyclerAdapter(ArrayList<ParticularData> particularData) {
        this.particularDataArrayList = particularData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li= (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=li.inflate(R.layout.recycler_view_layout,viewGroup,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        ParticularData particularData=particularDataArrayList.get(i);
        myHolder.tvValue.setText(particularData.getValue());
        myHolder.tvTopic.setText(particularData.getTopic());
    }

    @Override
    public int getItemCount() {
        return particularDataArrayList.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{
      TextView tvTopic,tvValue;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tvTopic=itemView.findViewById(R.id.tvTopic);
            tvValue=itemView.findViewById(R.id.tvValue);
        }
    }
}
