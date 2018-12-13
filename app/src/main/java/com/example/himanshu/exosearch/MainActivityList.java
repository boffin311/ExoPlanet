package com.example.himanshu.exosearch;

import java.io.Serializable;

public class MainActivityList implements Serializable {
    String planetIdentifier;
    String listsPlanetIsOn;
    String discoveryYear;
    String periodDays;
    String planetaryMassJpt;

    public String getPlanetaryMassJpt() {
        return planetaryMassJpt;
    }

    public void setPlanetaryMassJpt(String planetaryMassJpt) {
        this.planetaryMassJpt = planetaryMassJpt;
    }

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
}
