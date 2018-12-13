package com.example.himanshu.exosearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.GridView;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;



import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
GridView gridPlanet;
String json;
public static final String TAG="MAIN";
ArrayList<MainActivityList> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList=new ArrayList<>();

        gridPlanet=findViewById(R.id.gridPlanet);
        GridAdapter gridAdapter=new GridAdapter(arrayList);
        gridPlanet.setAdapter(gridAdapter);


        parseJson();

        }

      public  void  parseJson( )
     {
         JsonFactory jsonFactory =new JsonFactory();
         InputStream inputStream=getResources().openRawResource(R.raw.exo_planet);
         try {
             JsonParser jsonParser=jsonFactory.createParser(inputStream);
             while (jsonParser.nextToken()!=JsonToken.END_ARRAY)
             {    MainActivityList mainActivityList=new MainActivityList();
                 while(jsonParser.nextToken()!=JsonToken.END_OBJECT) {
                     String token=jsonParser.getCurrentName();
                     if ("PlanetIdentifier".equals(token)) {
                         jsonParser.nextToken();
                         mainActivityList.setPlanetIdentifier(jsonParser.getText());
                         //Log.d(TAG, "parseJson: "+jsonParser.getText());
                     }
                     if ("ListsPlanetIsOn".equals(token)) {
                         jsonParser.nextToken();
                         mainActivityList.setListsPlanetIsOn(jsonParser.getText());
                      //   Log.d(TAG, "parseJson: "+jsonParser.getText());
                     }
                     if ("DiscoveryYear".equals(token)) {
                         jsonParser.nextToken();
                         mainActivityList.setDiscoveryYear(jsonParser.getText());
                        // Log.d(TAG, "parseJson: "+jsonParser.getText());
                     }
                     if ("PeriodDays".equals(token)) {
                         jsonParser.nextToken();
                         mainActivityList.setPeriodDays(jsonParser.getText());
//                         Log.d(TAG, "parseJson: "+jsonParser.getText());
                     }
                 }
                 arrayList.add(mainActivityList);

             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }








    }

