package com.example.himanshu.exosearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

RecyclerView rvExtraTopic;
ExpandableListAdapter expandableListAdapter;
ArrayList<String> questions = new ArrayList<>();
ArrayList<String> shortAns = new ArrayList<>();
ArrayList<String> moreInfo = new ArrayList<>();
    MainGridList mainGridList;
    CardView cardMoreInfo;
    TextView nameOfPlanet,tvMoreInfoBox,tvMoreInfoDescription;



public static final String TAG="M2A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         nameOfPlanet=findViewById(R.id.nameofPlanet);
        rvExtraTopic=findViewById(R.id.rvExtraTopic);
        rvExtraTopic.setLayoutManager(new LinearLayoutManager(this));
         tvMoreInfoBox=findViewById(R.id.tvMoreInfoBox);
        tvMoreInfoDescription=findViewById(R.id.tvMoreInfoDescription);
//         cardMoreInfo=findViewById(R.id.CardMoreInfo);



      mainGridList = (MainGridList) getIntent().getExtras().getSerializable("Data");
        expandableListAdapter = new ExpandableListAdapter(questions,moreInfo,shortAns);
        rvExtraTopic.setAdapter(expandableListAdapter);
        nameOfPlanet.setText(mainGridList.getParticularData().get(0).getValue());



        questions.add("Planetary Mass");
//        questions.add("Type Flag")
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


        shortAns.add(mainGridList.getParticularData().get(1).getValue() + " MJ");
        shortAns.add(mainGridList.getParticularData().get(2).getValue() + " RJ");
        shortAns.add(mainGridList.getParticularData().get(3).getValue() + " days");
        shortAns.add(mainGridList.getParticularData().get(4).getValue() + " AU");
        shortAns.add(mainGridList.getParticularData().get(5).getValue());
        shortAns.add(mainGridList.getParticularData().get(6).getValue() + "°");
        shortAns.add(mainGridList.getParticularData().get(7).getValue() + "°");
        shortAns.add(mainGridList.getParticularData().get(8).getValue() + "°");
        shortAns.add(mainGridList.getParticularData().get(9).getValue() + "°");
        shortAns.add(mainGridList.getParticularData().get(10).getValue()+ " K");
        shortAns.add(mainGridList.getParticularData().get(11).getValue() + " Billion Years");
        shortAns.add(mainGridList.getParticularData().get(12).getValue());
        shortAns.add(mainGridList.getParticularData().get(13).getValue());
        shortAns.add(mainGridList.getParticularData().get(14).getValue());
        shortAns.add(mainGridList.getParticularData().get(15).getValue());
        shortAns.add(mainGridList.getParticularData().get(16).getValue());
        shortAns.add(mainGridList.getParticularData().get(17).getValue()+ " Parsec");
        shortAns.add(mainGridList.getParticularData().get(18).getValue()+ " Msun");
        shortAns.add(mainGridList.getParticularData().get(19).getValue()+ " Rsun");
        shortAns.add(mainGridList.getParticularData().get(20).getValue()+ " [Fe/H]");
        shortAns.add(mainGridList.getParticularData().get(21).getValue()+ " K");
        shortAns.add(mainGridList.getParticularData().get(22).getValue()+" Billion years");
        shortAns.add(mainGridList.getParticularData().get(23).getValue());



        try {
            moreInfo.add("The Planetary mass relative to the mass of Jupiter denoted with MJ \n\n" +
                    "Planetary mass is a measure of the mass of a planet-like object. Within the Solar System, planets are usually measured in the astronomical system of units, where the unit of mass is the solar mass (M☉), the mass of the Sun. In the study of extrasolar planets, the unit of measure is typically the mass of Jupiter (MJ) for large gas giant planets, and the mass of Earth (M⊕) for smaller rocky terrestrial planets.\n" +
                    "\n\n"
                     +"Mass in KG: " + String.valueOf(Double.parseDouble(mainGridList.getParticularData().get(1).getValue()) * 1.898e27) + " KG\n\n" +
                    "Mass (M⊕) : " + (Double.parseDouble(mainGridList.getParticularData().get(1).getValue()) * 1.898e27) / 5.972e24 + " M⊕ \n");


        }
        catch (Exception e)
        {
            moreInfo.add("The Planetary mass relative to the mass of Jupiter denoted with MJ \n\n" +
                    "Planetary mass is a measure of the mass of a planet-like object. Within the Solar System, planets are usually measured in the astronomical system of units, where the unit of mass is the solar mass (M☉), the mass of the Sun. In the study of extrasolar planets, the unit of measure is typically the mass of Jupiter (MJ) for large gas giant planets, and the mass of Earth (M⊕) for smaller rocky terrestrial planets.\n" +
                    "\n");
        }

     try{
             moreInfo.add("The Planetary radius relative to the radius of Jupiter denoted with RJ \n\n" + "" +
                             "Jupiter radius or Jovian radius (RJ or RJup) is the distance equal to the radius of planet Jupiter. It has a value of 71,492 km (44,423 mi), or 11.2 Earth radii (R⊕)[2] (one Earth radius equals 0.08921 RJ). Jupiter radius is a unit of length used in astronomy to describe the radii of gas giants and some extrasolar planets. It is also used in describing brown dwarfs. \n"+
                     " \n Radius (KM):"+" "+String.valueOf((Float.valueOf(mainGridList.getParticularData().get(2).getValue())*69911)) + " KM");
             Log.d(TAG, "onCreate: "+"I am here again" );
         }
         catch (Exception e)
         {
             moreInfo.add("The Planetary radius relative to the radius of Jupiter denoted with RJ \n\n" + "" +
                     "Jupiter radius or Jovian radius (RJ or RJup) is the distance equal to the radius of planet Jupiter. It has a value of 71,492 km (44,423 mi), or 11.2 Earth radii (R⊕)[2] (one Earth radius equals 0.08921 RJ). Jupiter radius is a unit of length used in astronomy to describe the radii of gas giants and some extrasolar planets. It is also used in describing brown dwarfs. \n");

         }
        moreInfo.add("It is the revolution period of the planet around its star in terms of earth days \n\n" + "" +
                "In astronomy, the rotation/revolution period of a celestial object is the time that it takes to complete one revolution around its axis of rotation relative to the background stars. It differs from the planet's solar day, which includes an extra fractional rotation needed to accommodate the portion of the planet's orbital period during one day. \n");
        moreInfo.add("The semi-major axis is one half of the major axis, and thus runs from the centre, through a focus, and to the perimeter. For the special case of a circle, the semi-major axis is the radius." +
                " It is given in Astronomical Unit");
        moreInfo.add("The orbital eccentricity of an astronomical object is a parameter that determines the amount by which its orbit around another body deviates from a perfect circle. A value of 0 is a circular orbit, values between 0 and 1 form an elliptic orbit, 1 is a parabolic escape orbit, and greater than 1 is a hyperbola. ");
        moreInfo.add("The point of the orbit of a celestial body that is closest to the star around which the body is orbiting. ");
        moreInfo.add("Mean longitude is the ecliptic longitude at which an orbiting body could be found if its orbit were circular and free of perturbations. While nominally a simple longitude, in practice the mean longitude does not correspond to any one physical angle. \n");
        moreInfo.add("The longitude of the ascending node (☊ or Ω) is one of the orbital elements used to specify the orbit of an object in space. It is the angle from a reference direction, called the origin of longitude, to the direction of the ascending node, measured in a reference plane. The ascending node is the point where the orbit of the object passes through the plane of reference, as seen in the adjacent image. Commonly used reference planes and origins of longitude include: \n");
        moreInfo.add("Orbital inclination measures the tilt of an object's orbit around a celestial body. It is expressed as the angle between a reference plane and the orbital plane or axis of direction of the orbiting object. \n");
        moreInfo.add("Temperature at surface in Kelvin \n ");
        moreInfo.add("Age of planet in terms of Giga year or Billion year \n");
        moreInfo.add("Any planet is an extremely faint light source compared to its parent star. For example, a star like the Sun is about a billion times as bright as the reflected light from any of the planets orbiting it. In addition to the intrinsic difficulty of detecting such a faint light source, the light from the parent star causes a glare that washes it out. For those reasons, very few of the extrasolar planets reported as of April 2014 have been observed directly, with even fewer being resolved from their host star. \n");
        moreInfo.add("Year in which the planet was discovered \n");
        moreInfo.add("Last date it was updated in yy/mm/dd format ");
        moreInfo.add("RA and DEC are to the sky what longitude and latitude are to the surface of the Earth. RA corresponds to East/West directions (like longitude) while DEC measures North/South directions (like latitude).");
        moreInfo.add("RA and DEC are to the sky what longitude and latitude are to the surface of the Earth. RA corresponds to East/West directions (like longitude) while DEC measures North/South directions (like latitude). ");
        moreInfo.add("Distance of planet from our sun in Parsec. One parsec is 3.26 light years");
        moreInfo.add("Host Star mass relative to mass of of Sun Mass denoted by Msun.");
        moreInfo.add("Host Star radius relative to radius of of Sun Mass denoted by Rsun ");
        moreInfo.add("Metallicity, ratio of Iron and Hydrogen \n\n" + "" +
                "In astronomy, metallicity is used to describe the abundance of elements present in an object that are heavier than hydrogen or helium. Most of the physical matter in the Universe is in the form of hydrogen and helium, so astronomers use the word \"metals\" as a convenient short term for \"all elements except hydrogen and helium\". This usage is distinct from the usual physical definition of a solid metal. For example, stars and nebulae with relatively high abundances of carbon, nitrogen, oxygen, and neon are called \"metal-rich\" in astrophysical terms, even though those elements are non-metals in chemistry.\n");
        moreInfo.add("Temperature of Host Star in Kelvin ");
        moreInfo.add("Host Star age in Giga year or billion year ");
        moreInfo.add("Confirmed, Controversial or in Solar System");




        tvMoreInfoBox.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
            String formatName = mainGridList.getPlanetIdentifier().replace(" ", "%20");
            String uri = "http://www.openexoplanetcatalogue.com/planet/"+formatName+"/";
            Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
            startActivity(browse);
          }
        });

    }


}
