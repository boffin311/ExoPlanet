package com.example.himanshu.exosearch;

public class MainActivityList {
    String planetIdentifier;
    String listsPlanetIsOn;
    String discoveryYear;
    String periodDays;

//    public MainActivityList(String planetIdentifier, String listsPlanetIsOn, String discoveryYear, String periodDays) {
//        this.planetIdentifier = planetIdentifier;
//        this.listsPlanetIsOn = listsPlanetIsOn;
//        this.discoveryYear = discoveryYear;
//        this.periodDays = periodDays;
//    }

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
