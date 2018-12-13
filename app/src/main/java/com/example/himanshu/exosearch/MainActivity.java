package com.example.himanshu.exosearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.widget.GridView;
import android.widget.SearchView;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
GridView gridPlanet;
String json;
public static final String TAG="MAIN";
private ArrayList<MainActivityList> arrayList;
GridAdapter gridAdapter;
android.support.v7.widget.SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList=new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
        searchView = findViewById(R.id.searchWidget);
        gridPlanet=findViewById(R.id.gridPlanet);
        gridAdapter=new GridAdapter(arrayList);
        gridPlanet.setAdapter(gridAdapter);
//       // getJson();
//        ReadJson readJson=new ReadJson();
//        InputStream inputStream=getResources().openRawResource(R.raw.exo_planet);
//      readJson.execute(inputStream);
////        setJson(json);

        parseJson();

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








//    public String getJson(){
////        try {
//
//
//            Scanner scanner=new Scanner(inputStream);
//            StringBuilder stringBuilder=new StringBuilder();
//            while(scanner.hasNextLine())
//            stringBuilder.append(scanner.nextLine());
//
//            json=stringBuilder.toString();
//            Log.d(TAG, "getJson: "+json);
//        Log.d(TAG, "getJson: "+json.length());
//
//
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        return json;
//    }
//    public void setJson(String json)
//    {
//
//            Log.d(TAG, "setJson: "+json);
//        try {
//        JSONArray jsonArray=new JSONArray(json);
//            JSONObject jsonObject=jsonArray.getJSONObject(0);
//            Log.d(TAG, "setJson: "+jsonArray.length());
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//
//    }
    }
//<<<<<<< HEAD
//}
//=======
//
//>>>>>>> 1020b9f62cb4d861dcb47d82190bafcca0259571
