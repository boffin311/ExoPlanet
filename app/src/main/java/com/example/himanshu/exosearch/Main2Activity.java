package com.example.himanshu.exosearch;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView tvName;
public static final String TAG="M2A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvName=findViewById(R.id.tvName);
        MainActivityList mainActivityList=new MainActivityList();
      getIntent().getExtras();
      mainActivityList= (MainActivityList) getIntent().getExtras().getSerializable("Data");



    }

}
