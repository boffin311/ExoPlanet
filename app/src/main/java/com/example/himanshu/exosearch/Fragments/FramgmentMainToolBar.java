package com.example.himanshu.exosearch.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.himanshu.exosearch.R;

public class FramgmentMainToolBar extends Fragment {
    public FramgmentMainToolBar() {
    }
ImageView imageSearch;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main_toolbar,container,false);
        imageSearch=view.findViewById(R.id.imageSearch);
        imageSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ftrax=getActivity().getSupportFragmentManager().beginTransaction();
                ftrax.setCustomAnimations(R.anim.slide_to_left,R.anim.slide_to_right);

                ftrax.replace(R.id.mainToolBar,new FragmentSearch(),"FirstFragment");
                ftrax.addToBackStack("FirstFragment");
                ftrax.commit();
            }
        });
        return view;
    }
}
