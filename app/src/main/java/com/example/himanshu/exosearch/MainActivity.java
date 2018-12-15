package com.example.himanshu.exosearch;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.example.himanshu.exosearch.Fragments.FramgmentMainToolBar;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;



import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
GridView gridPlanet;
public static final String TAG="MAIN";
private ArrayList<MainGridList> arrayList;
GridAdapter gridAdapter;
FrameLayout frameToolbar;
LinearLayout frameToolbarTitle;
ArrayList<ParticularData> particularData;
android.support.v7.widget.SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList=new ArrayList<>();
        frameToolbar=findViewById(R.id.mainToolBar);
           frameToolbarTitle=findViewById(R.id.frameToolbarTitle);
        gridPlanet=findViewById(R.id.gridPlanet);
        gridAdapter=new GridAdapter(arrayList,MainActivity.this);
        gridPlanet.setAdapter(gridAdapter);


        parseJson();
        FragmentTransaction ftrax=getSupportFragmentManager().beginTransaction();
        ftrax.replace(R.id.mainToolBar,new FramgmentMainToolBar());
        ftrax.commit();


        }

      public  void  parseJson( )
     {
         JsonFactory jsonFactory =new JsonFactory();
         InputStream inputStream=getResources().openRawResource(R.raw.exo_planet);
         try {
             JsonParser jsonParser=jsonFactory.createParser(inputStream);
             while (jsonParser.nextToken()!=JsonToken.END_ARRAY)
             {    MainGridList mainGridList =new MainGridList();
             particularData =new ArrayList<>();
                 while(jsonParser.nextToken()!=JsonToken.END_OBJECT) {
                     String token=jsonParser.getCurrentName();
                     if ("PlanetIdentifier".equals(token)) {
                         jsonParser.nextToken();
                         mainGridList.setPlanetIdentifier(jsonParser.getText());
                         particularData.add(new ParticularData("PlanetIdentifier",jsonParser.getText()));
                         //Log.d(TAG, "parseJson: "+jsonParser.getText());
                     }
//                     if ("TypeFlag".equals(token)) {
//                         jsonParser.nextToken();
//                         particularData.add(new ParticularData("Type Flag",jsonParser.getText()));
//
//                     }
                     if ("ListsPlanetIsOn".equals(token)) {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("ListsPlanetIsOn",jsonParser.getText()));

                         mainGridList.setListsPlanetIsOn(jsonParser.getText());
                     }
                     if ("DiscoveryYear".equals(token)) {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("DiscoveryYear",jsonParser.getText()));

                         mainGridList.setDiscoveryYear(jsonParser.getText());
                        // Log.d(TAG, "parseJson: "+jsonParser.getText());
                     }
                     if ("PeriodDays".equals(token)) {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("PeriodDays",jsonParser.getText()));

                         mainGridList.setPeriodDays(jsonParser.getText());
//                         Log.d(TAG, "parseJson: "+jsonParser.getText());
                     }
                     if ("PlanetaryMassJpt".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("PlanetaryMassJpt",jsonParser.getText()));
                        // mainGridList.setPlanetaryMassJpt(jsonParser.getText());
                     }
                     if ("RadiusJpt".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("RadiusJpt",jsonParser.getText()));

                      //   mainGridList.setRadiusJpt(jsonParser.getText());
                     }
                     if ("SemiMajorAxisAU".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("SemiMajorAxisAU",jsonParser.getText()));

                        // mainGridList.setSemiMajorAxisAU(jsonParser.getText());
                     }
                     if ("Eccentricity".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("Eccentricity",jsonParser.getText()));
                         //mainGridList.setEccentricity(jsonParser.getText());
                     }
                     if ("PeriastronDeg".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("PeriastronDeg",jsonParser.getText()));

                        // mainGridList.setPeriastronDeg(jsonParser.getText());
                     }
                     if ("LongitudeDeg".equals(token))
                     {
                         jsonParser.nextToken();
                          particularData.add(new ParticularData("LongitudeDeg",jsonParser.getText()));

                         //mainGridList.setLongitudeDeg(jsonParser.getText());
                     }
                     if ("AscendingNodeDeg".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("AscendingNodeDeg",jsonParser.getText()));

                         // mainGridList.setAscendingNodeDeg(jsonParser.getText());
                     }
                     if ("InclinationDeg".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("InclinationDeg",jsonParser.getText()));

                         // mainGridList.setInclinationDeg(jsonParser.getText());
                     }
                     if ("SurfaceTempK".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("SurfaceTempK",jsonParser.getText()));

                         // mainGridList.setSurfaceTempK(jsonParser.getText());
                     }
                     if ("AgeGyr".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("AgeGyr",jsonParser.getText()));

                         //  mainGridList.setAgeGyr(jsonParser.getText());
                     }
                     if ("DiscoveryMethod".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("DiscoveryMethod",jsonParser.getText()));

                         // mainGridList.setDiscoveryMethod(jsonParser.getText());
                     }
                     if ("LastUpdated".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("LastUpdated",jsonParser.getText()));

                         // mainGridList.setLastUpdated(jsonParser.getText());
                     }
                     if ("RightAscension".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("RightAscension",jsonParser.getText()));

                         // mainGridList.setRightAscension(jsonParser.getText());
                     }
                     if ("Declination".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("Declination",jsonParser.getText()));

                         // mainGridList.setDeclination(jsonParser.getText());
                     }
                     if ("DistFromSunParsec".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("DistFromSunParsec",jsonParser.getText()));

                         // mainGridList.setDeclination(jsonParser.getText());
                     }
                     if ("HostStarMassSlrMass".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("HostStarMassSlrMass",jsonParser.getText()));

                         // mainGridList.setHostStarMassSlrMass(jsonParser.getText());
                     }
                     if ("HostStarRadiusSlrRad".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("HostStarRadiusSlrRad",jsonParser.getText()));

                         // mainGridList.setHostStarRadiusSlrRad(jsonParser.getText());
                     }
                     if ("HostStarMetallicity".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("HostStarMetallicity",jsonParser.getText()));

                         // mainGridList.setHostStarMetallicity(jsonParser.getText());
                     }
                     if ("HostStarTempK".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("HostStarTempK",jsonParser.getText()));

                         // mainGridList.setHostStarTempK(jsonParser.getText());
                     }
                     if ("HostStarAgeGyr".equals(token))
                     {
                         jsonParser.nextToken();
                         particularData.add(new ParticularData("HostStarAgeGyr",jsonParser.getText()));

                         // mainGridList.setHostStarAgeGyr(jsonParser.getText());
                     }


                 }
                 mainGridList.setArrayList(particularData);
                 arrayList.add(mainGridList);

             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }




    public GridAdapter getGridAdapter(){
        return gridAdapter;
    }
}
