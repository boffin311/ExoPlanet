package com.example.himanshu.exosearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.view.View;
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
    CardView cardMoreInfo;
    TextView nameOfPlanet,tvMoreInfoBox,tvMoreInfoDescription;
    RecyclerView rvParticularData;


public static final String TAG="M2A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
         nameOfPlanet=findViewById(R.id.nameofPlanet);
        rvExtraTopic=findViewById(R.id.rvExtraTopic);
        rvExtraTopic.setLayoutManager(new LinearLayoutManager(this));
tvMoreInfoBox=findViewById(R.id.tvMoreInfoBox);
tvMoreInfoDescription=findViewById(R.id.tvMoreInfoDescription);
cardMoreInfo=findViewById(R.id.CardMoreInfo);


//     rvParticularData=findViewById(R.id.rvParticularData);
//     rvParticularData.setLayoutManager(new LinearLayoutManager(this));
      mainActivityList= (MainActivityList) getIntent().getExtras().getSerializable("Data");
        expandableListAdapter = new ExpandableListAdapter(questions,moreInfo,shortAns);
        rvExtraTopic.setAdapter(expandableListAdapter);
        // Log.d(TAG, "onCreate: "+mainActivityList.getDeclination());



        //Recycler view Adapter set for simple data

//        expandedRecyclerAdapter = new ExpandedRecyclerAdapter(mainActivityList.getParticularData());
      //  expandedRecyclerAdapter = new ExpandedRecyclerAdapter(mainActivityList.getParticularData(),moreInfo,shortAns);
        nameOfPlanet.setText(mainActivityList.getParticularData().get(0).getValue());
     //   rvParticularData.setAdapter(expandedRecyclerAdapter);
        /**
         *
         * Yha pe intent ke sath data liya and uske according math laga ke solve kiya and 2 list ko combine kar diya
         *
         */



//        questions.add("Planetary Mass");
//        questions.add("Radius");
//        questions.add("Period Days");
//        questions.add("Semi Major Axis");
//        questions.add("Eccentricity");
//        questions.add("Periastron");
//        questions.add("Longitude");
//        questions.add("Ascending Node");
//        questions.add("Inclination");
//        questions.add("Surface Temperature");
//        questions.add("Age");
//        questions.add("Discovery Method");
//        questions.add("Discovery Year");
//        questions.add("Last Updated");
//        questions.add("Right Ascension");
//        questions.add("Declination");
//        questions.add("Distance From Sun");
//        questions.add("Host Star Mass");
//        questions.add("Host Star Radius");
//        questions.add("Host Star Metallicity");
//        questions.add("Host Star Temperature");
//        questions.add("Host Star Age");
//        questions.add("Lists Planet Is On");

//        shortAns.add("");
//        shortAns.add(" MJ");
//        shortAns.add(" RJ");
//        shortAns.add(" days");
//        shortAns.add( " AU");
//        shortAns.add("");
//        shortAns.add("°");
//        shortAns.add("°");
//        shortAns.add("°");
//        shortAns.add( "°");
//        shortAns.add( " K");
//        shortAns.add( " Billion Years");
//        shortAns.add("");
//        shortAns.add("");
//        shortAns.add("");
//        shortAns.add("");
//        shortAns.add("");
//        shortAns.add( " Parsec");
//        shortAns.add(" Msun");
//        shortAns.add( " Rsun");
//        shortAns.add( " [Fe/H]");
//        shortAns.add(" K");
//        shortAns.add(" Billion years");
//        shortAns.add("");
//


        moreInfo.add("Name of the planet according to NASA");

        questions.add("Planetary Mass");
        questions.add("Radius");
        questions.add("Period Days");
        questions.add("Semi Major Axis");
        questions.add("Eccentricity");
        questions.add("Periastron");
        questions.add("Longitude");
        questions.add("Ascending Node");
        questions.add("Inclination");
        questions.add("Surface Temperature");
        questions.add("Age");
        questions.add("Discovery Method");
        questions.add("Discovery Year");
        questions.add("Last Updated");
        questions.add("Right Ascension");
        questions.add("Declination");
        questions.add("Distance From Sun");
        questions.add("Host Star Mass");
        questions.add("Host Star Radius");
        questions.add("Host Star Metallicity");
        questions.add("Host Star Temperature");
        questions.add("Host Star Age");
        questions.add("Lists Planet Is On");
        questions.add("MORE INFORMATION");

        shortAns.add(mainActivityList.getParticularData().get(1).getValue() + " MJ");
        shortAns.add(mainActivityList.getParticularData().get(2).getValue() + " RJ");
        shortAns.add(mainActivityList.getParticularData().get(3).getValue() + " days");
        shortAns.add(mainActivityList.getParticularData().get(4).getValue() + " AU");
        shortAns.add(mainActivityList.getParticularData().get(5).getValue());
        shortAns.add(mainActivityList.getParticularData().get(6).getValue() + "°");
        shortAns.add(mainActivityList.getParticularData().get(7).getValue() + "°");
        shortAns.add(mainActivityList.getParticularData().get(8).getValue() + "°");
        shortAns.add(mainActivityList.getParticularData().get(9).getValue() + "°");
        shortAns.add(mainActivityList.getParticularData().get(10).getValue()+ " K");
        shortAns.add(mainActivityList.getParticularData().get(11).getValue() + " Billion Years");
        shortAns.add(mainActivityList.getParticularData().get(12).getValue());
        shortAns.add(mainActivityList.getParticularData().get(13).getValue());
        shortAns.add(mainActivityList.getParticularData().get(14).getValue());
        shortAns.add(mainActivityList.getParticularData().get(15).getValue());
        shortAns.add(mainActivityList.getParticularData().get(16).getValue());
        shortAns.add(mainActivityList.getParticularData().get(17).getValue()+ " Parsec");
        shortAns.add(mainActivityList.getParticularData().get(18).getValue()+ " Msun");
        shortAns.add(mainActivityList.getParticularData().get(19).getValue()+ " Rsun");
        shortAns.add(mainActivityList.getParticularData().get(20).getValue()+ " [Fe/H]");
        shortAns.add(mainActivityList.getParticularData().get(21).getValue()+ " K");
        shortAns.add(mainActivityList.getParticularData().get(22).getValue()+" Billion years");
        shortAns.add(mainActivityList.getParticularData().get(23).getValue());
        shortAns.add("more info about the host star and its planets");




        moreInfo.add("The Planetary mass relative to the mass of Jupiter denoted with MJ ");

        moreInfo.add("The Planetary radius relative to the radius of Jupiter denoted with RJ");
        moreInfo.add("It is the revolution period of the planet around its star in terms of earth days");
        moreInfo.add("The semi-major axis is one half of the major axis, and thus runs from the centre, through a focus, and to the perimeter. For the special case of a circle, the semi-major axis is the radius." +
                " It is given in Astronomical Unit");
        moreInfo.add("The orbital eccentricity of an astronomical object is a parameter that determines the amount by which its orbit around another body deviates from a perfect circle. A value of 0 is a circular orbit, values between 0 and 1 form an elliptic orbit, 1 is a parabolic escape orbit, and greater than 1 is a hyperbola. ");
        moreInfo.add("The point of the orbit of a celestial body that is closest to the star around which the body is orbiting. ");
        moreInfo.add("It is the Mean Longitude");
        moreInfo.add("Longitude of ascending node ");
        moreInfo.add("Orbital inclination");
        moreInfo.add("Temperature at surface in Kelvin ");
        moreInfo.add("Age of planet in terms of Giga year or Billion year ");
        moreInfo.add("Method of Discovery ");
        moreInfo.add("Discovery year");
        moreInfo.add("Last date it was updated in yy/mm/dd format ");
        moreInfo.add("RA and DEC are to the sky what longitude and latitude are to the surface of the Earth. RA corresponds to East/West directions (like longitude) while DEC measures North/South directions (like latitude).");
        moreInfo.add("RA and DEC are to the sky what longitude and latitude are to the surface of the Earth. RA corresponds to East/West directions (like longitude) while DEC measures North/South directions (like latitude). ");
        moreInfo.add("Distance of planet from our sun in Parsec. One parsec is 3.26 light years");
        moreInfo.add("Host Star mass relative to mass of of Sun Mass denoted by Msun.");
        moreInfo.add("Host Star radius relative to radius of of Sun Mass denoted by Rsun ");
        moreInfo.add("Metallicity, ratio of Iron and Hydrogen ");
        moreInfo.add("Temperature of Host Star in Kelvin ");
        moreInfo.add("Host Star age in Giga year or billion year ");
        moreInfo.add("Confirmed or Controversial");
        moreInfo.add(mainActivityList.getParticularData().get(0).getValue());



        /**
         *
         * now we have to call
         */
//
//        for (int i=0; i<questions.size(); i++){
//
//            MoreInfoContent moreInfoContent = new MoreInfoContent();
//            moreInfoContent.setQuestions(questions.get(i));
//            moreInfoContent.setShort_ans(shortAns.get(i));
//            moreInfoContent.setMoreInfo(moreInfo.get(i));
//
//            allInfo.add(moreInfoContent);
//
//        }
/**
 More Info link is after this

 */
cardMoreInfo.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String formatName = mainActivityList.getPlanetIdentifier().replace(" ", "%20");
        String uri = "http://www.openexoplanetcatalogue.com/planet/"+formatName+"/";
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(browse);
    }
});
//        String formatName = mainActivityList.getPlanetIdentifier().replace(" ", "%20");
//                         String uri = "http://www.openexoplanetcatalogue.com/planet/"+formatName+"/";
//                         Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
//                         this.startActivity(browse);


    }


}
