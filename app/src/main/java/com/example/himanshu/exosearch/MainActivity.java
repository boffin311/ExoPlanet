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
String json;
public static final String TAG="MAIN";
private ArrayList<MainActivityList> arrayList;
GridAdapter gridAdapter;
FrameLayout frameToolbar;
LinearLayout frameToolbarTitle;
android.support.v7.widget.SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList=new ArrayList<>();

        //searchView = findViewById(R.id.searchWidget);
         frameToolbar=findViewById(R.id.mainToolBar);
           frameToolbarTitle=findViewById(R.id.frameToolbarTitle);
        gridPlanet=findViewById(R.id.gridPlanet);
        gridAdapter=new GridAdapter(arrayList,MainActivity.this);
        gridPlanet.setAdapter(gridAdapter);


        parseJson();
        FragmentTransaction ftrax=getSupportFragmentManager().beginTransaction();
        ftrax.replace(R.id.mainToolBar,new FramgmentMainToolBar());
        ftrax.commit();
//           frameToolbarTitle.inflateMenu(R.menu.menu_general);
////
//
//             frameToolbarTitle.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//                 @Override
//                 public boolean onMenuItemClick(MenuItem menuItem) {
//                     if (menuItem.getItemId()==R.id.search_button)
//                     {
//                         searchView.setVisibility(View.VISIBLE);
//                         searchView.setLayoutParams(new Toolbar.LayoutParams(Toolbar.LayoutParams.MATCH_PARENT,Toolbar.LayoutParams.MATCH_PARENT));
//                         Log.d(TAG, "onOptionsItemSelected: "+" search button is clicked" );
//                     }
//                     return true;
//                 }
//             });
//        searchView.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String s) {
//                gridAdapter.getFilter().filter(s);
//                return false;
//            }
//        });
//

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
                     if ("PlanetaryMassJpt".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setPlanetaryMassJpt(jsonParser.getText());
                     }
                     if ("RadiusJpt".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setRadiusJpt(jsonParser.getText());
                     }
                     if ("SemiMajorAxisAU".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setSemiMajorAxisAU(jsonParser.getText());
                     }
                     if ("Eccentricity".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setEccentricity(jsonParser.getText());
                     }
                     if ("PeriastronDeg".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setPeriastronDeg(jsonParser.getText());
                     }
                     if ("LongitudeDeg".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setLongitudeDeg(jsonParser.getText());
                     }
                     if ("AscendingNodeDeg".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setAscendingNodeDeg(jsonParser.getText());
                     }
                     if ("InclinationDeg".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setInclinationDeg(jsonParser.getText());
                     }
                     if ("SurfaceTempK".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setSurfaceTempK(jsonParser.getText());
                     }
                     if ("AgeGyr".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setAgeGyr(jsonParser.getText());
                     }
                     if ("DiscoveryMethod".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setDiscoveryMethod(jsonParser.getText());
                     }
                     if ("LastUpdated".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setLastUpdated(jsonParser.getText());
                     }
                     if ("RightAscension".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setRightAscension(jsonParser.getText());
                     }
                     if ("Declination".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setDeclination(jsonParser.getText());
                     }
                     if ("HostStarMassSlrMass".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setHostStarMassSlrMass(jsonParser.getText());
                     }
                     if ("HostStarRadiusSlrRad".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setHostStarRadiusSlrRad(jsonParser.getText());
                     }
                     if ("HostStarMetallicity".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setHostStarMetallicity(jsonParser.getText());
                     }
                     if ("HostStarTempK".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setHostStarTempK(jsonParser.getText());
                     }
                     if ("HostStarAgeGyr".equals(token))
                     {
                         jsonParser.nextToken();
                         mainActivityList.setHostStarAgeGyr(jsonParser.getText());
                     }


                 }
                 arrayList.add(mainActivityList);

             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }




















//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater=getMenuInflater();
//        menuInflater.inflate(R.menu.menu_general,menu);
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        return super.onOptionsItemSelected(item);
//    }



    public GridAdapter getGridAdapter(){
        return gridAdapter;
    }
}
