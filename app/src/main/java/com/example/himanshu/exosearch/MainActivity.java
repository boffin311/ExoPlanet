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


//    public void expandAnimation()
//    { searchView.measure(SearchView.LayoutParams.MATCH_PARENT,SearchView.LayoutParams.WRAP_CONTENT);
//        final int target=searchView.getMeasuredHeight();
//        Log.d(TAG, "expandAnimation: "+target);
//        searchView.getLayoutParams().height=1;
//        searchView.setVisibility(View.VISIBLE);
//
//        Animation animation=new Animation() {
//            @Override
//            protected void applyTransformation(float interpolatedTime, Transformation t) {
//                super.applyTransformation(interpolatedTime, t);
//
//                interpolatedTime=searchView.getLayoutParams().height;
//                Log.d(TAG, "applyTransformation: "+interpolatedTime);
//                if (interpolatedTime==1)
//                {interpolatedTime=SearchView.LayoutParams.MATCH_PARENT;
//                    Log.d(TAG, "applyTransformation: "+"i am working");
//                }
//                else
//                {interpolatedTime=(int)target*interpolatedTime;
//                    Log.d(TAG, "applyTransformation: "+"its me");}
//
//                    searchView.requestLayout();
//
//
//
//            }
//
//            @Override
//            public boolean willChangeBounds() {
//                return  true;
//            }
//        };
//        animation.setDuration((int)(target/searchView.getContext().getResources().getDisplayMetrics().density));
//        searchView.startAnimation(animation);
//    }
    public GridAdapter getGridAdapter(){
        return gridAdapter;
    }
}
