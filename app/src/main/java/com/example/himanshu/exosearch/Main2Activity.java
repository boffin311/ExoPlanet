package com.example.himanshu.exosearch;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

//TextView tvName;
RecyclerView rvExtraTopic;
ExpandableListAdapter expandableListAdapter;
ArrayList<String> questions = new ArrayList<>();
ArrayList<String> shortAns = new ArrayList<>();
ArrayList<String> moreInfo = new ArrayList<>();
    MainActivityList mainActivityList;
    RecyclerView rvParticularData;
    ExpandedRecyclerAdapter expandedRecyclerAdapter;
ArrayList<MoreInfoContent> allInfo = new ArrayList<>();


public static final String TAG="M2A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
        expandableListAdapter = new ExpandableListAdapter(this, allInfo);

        rvExtraTopic=findViewById(R.id.rvExtraTopic);
        rvExtraTopic.setLayoutManager(new LinearLayoutManager(this));
        rvExtraTopic.setAdapter(expandableListAdapter);

     rvParticularData=findViewById(R.id.rvParticularData);
     rvParticularData.setLayoutManager(new LinearLayoutManager(this));
      mainActivityList= (MainActivityList) getIntent().getExtras().getSerializable("Data");
       // Log.d(TAG, "onCreate: "+mainActivityList.getDeclination());



        //Recycler view Adapter set for simple data

        expandedRecyclerAdapter = new ExpandedRecyclerAdapter(mainActivityList.getParticularData());
        rvParticularData.setAdapter(expandedRecyclerAdapter);
        /**
         *
         * Yha pe intent ke sath data liya and uske according math laga ke solve kiya and 2 list ko combine kar diya
         *
         */


        questions.add("what is the name of planet");
        questions.add("all this non sense");
        questions.add("all this non sense");


        shortAns.add("lalala");
        shortAns.add("yahoo");
        shortAns.add("lalala");


        moreInfo.add("I don't know why it is happening but it need to be corrected ");
        moreInfo.add("The following plot shows the approximate sizes of the planets in this system The");
        moreInfo.add("This list shows all planetary and stellar components in the system. It gives a quick overview of the hierarchical ");


        /**
         *
         * now we have to call
         */

        for (int i=0; i<questions.size(); i++){

            MoreInfoContent moreInfoContent = new MoreInfoContent();
            moreInfoContent.setQuestions(questions.get(i));
            moreInfoContent.setShort_ans(shortAns.get(i));
            moreInfoContent.setMoreInfo(moreInfo.get(i));

            allInfo.add(moreInfoContent);

        }



        TextView textView = findViewById(R.id.nameofplanet);
        textView.setText("hi man");


    }


}
