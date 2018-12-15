package com.example.himanshu.exosearch;

import java.io.Serializable;
import java.util.ArrayList;

public class MainGridList implements Serializable {
    String planetIdentifier;
    String listsPlanetIsOn;
    String discoveryYear;
    String periodDays;
    ArrayList<ParticularData> particularData;


    public String getPlanetIdentifier() {
        return planetIdentifier;
    }

    public void setPlanetIdentifier(String planetIdentifier) {
        this.planetIdentifier = planetIdentifier;
    }

    public String getListsPlanetIsOn() {
        return listsPlanetIsOn;
    }

    public void setListsPlanetIsOn(String listsPlanetIsOn) {
        this.listsPlanetIsOn = listsPlanetIsOn;
    }

    public String getDiscoveryYear() {
        return discoveryYear;
    }

    public void setDiscoveryYear(String discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    public String getPeriodDays() {
        return periodDays;
    }

    public void setPeriodDays(String periodDays) {
        this.periodDays = periodDays;
    }
    public void setArrayList(ArrayList<ParticularData> particularData)
    {
        this.particularData = particularData;
    }
    public ArrayList<ParticularData> getParticularData()
    {
        return particularData;
    }


}
