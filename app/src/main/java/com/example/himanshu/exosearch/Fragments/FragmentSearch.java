package com.example.himanshu.exosearch.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;


import com.example.himanshu.exosearch.GridAdapter;
import com.example.himanshu.exosearch.MainActivity;
import com.example.himanshu.exosearch.R;

public class FragmentSearch extends Fragment {
    public FragmentSearch(){}
     SearchView searchView;
    GridAdapter gridAdapter;
    ImageView imageBack;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_search_view,container,false);
        searchView=view.findViewById(R.id.searchView);
        imageBack=view.findViewById(R.id.imageBack);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setQuery(null,true);
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
        searchView.setIconifiedByDefault(true);
        searchView.setFocusable(true);
        searchView.setIconified(false);
        searchView.requestFocusFromTouch();
        searchView.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                gridAdapter.getFilter().filter(s);

                return false;
            }
        });

        return view;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gridAdapter=((MainActivity)this.getActivity()).getGridAdapter();
    }
}
