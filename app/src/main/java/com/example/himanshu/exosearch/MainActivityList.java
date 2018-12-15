package com.example.himanshu.exosearch;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivityList implements Serializable {
    String planetIdentifier;
    String listsPlanetIsOn;
    String discoveryYear;
    String periodDays;
    ArrayList<ParticularData> particularData;
//    String planetaryMassJpt;
//    String RadiusJpt;
//    String SemiMajorAxisAU;
//    String Eccentricity;
//    String PeriastronDeg;
//    String LongitudeDeg;
//    String AscendingNodeDeg;
//    String InclinationDeg;
//    String SurfaceTempK;
//    String AgeGyr;
//    String DiscoveryMethod;
//    String LastUpdated;
//
//    String RightAscension;
//    String Declination;
//    String DistFromSunParsec;
//    String HostStarMassSlrMass;
//    String HostStarRadiusSlrRad;
//    String HostStarMetallicity ;
//    String HostStarTempK;
//    String HostStarAgeGyr;

//    public String getRadiusJpt() {
//        return RadiusJpt;
//    }
//
//    public void setRadiusJpt(String radiusJpt) {
//        RadiusJpt = radiusJpt;
//    }
//
//    public String getSemiMajorAxisAU() {
//        return SemiMajorAxisAU;
//    }
//
//    public void setSemiMajorAxisAU(String semiMajorAxisAU) {
//        SemiMajorAxisAU = semiMajorAxisAU;
//    }
//
//    public String getEccentricity() {
//        return Eccentricity;
//    }
//
//    public void setEccentricity(String eccentricity) {
//        Eccentricity = eccentricity;
//    }
//
//    public String getPeriastronDeg() {
//        return PeriastronDeg;
//    }
//
//    public void setPeriastronDeg(String periastronDeg) {
//        PeriastronDeg = periastronDeg;
//    }
//
//    public String getLongitudeDeg() {
//        return LongitudeDeg;
//    }
//
//    public void setLongitudeDeg(String longitudeDeg) {
//        LongitudeDeg = longitudeDeg;
//    }
//
//    public String getAscendingNodeDeg() {
//        return AscendingNodeDeg;
//    }
//
//    public void setAscendingNodeDeg(String ascendingNodeDeg) {
//        AscendingNodeDeg = ascendingNodeDeg;
//    }
//
//    public String getInclinationDeg() {
//        return InclinationDeg;
//    }
//
//    public void setInclinationDeg(String inclinationDeg) {
//        InclinationDeg = inclinationDeg;
//    }
//
//    public String getSurfaceTempK() {
//        return SurfaceTempK;
//    }
//
//    public void setSurfaceTempK(String surfaceTempK) {
//        SurfaceTempK = surfaceTempK;
//    }
//
//    public String getAgeGyr() {
//        return AgeGyr;
//    }
//
//    public void setAgeGyr(String ageGyr) {
//        AgeGyr = ageGyr;
//    }
//
//    public String getDiscoveryMethod() {
//        return DiscoveryMethod;
//    }
//
//    public void setDiscoveryMethod(String discoveryMethod) {
//        DiscoveryMethod = discoveryMethod;
//    }
//
//    public String getLastUpdated() {
//        return LastUpdated;
//    }
//
//    public void setLastUpdated(String lastUpdated) {
//        LastUpdated = lastUpdated;
//    }
//
//    public String getRightAscension() {
//        return RightAscension;
//    }
//
//    public void setRightAscension(String rightAscension) {
//        RightAscension = rightAscension;
//    }
//
//    public String getDeclination() {
//        return Declination;
//    }
//
//    public void setDeclination(String declination) {
//        Declination = declination;
//    }
//
//    public String getDistFromSunParsec() {
//        return DistFromSunParsec;
//    }
//
//    public void setDistFromSunParsec(String distFromSunParsec) {
//        DistFromSunParsec = distFromSunParsec;
//    }
//
//    public String getHostStarMassSlrMass() {
//        return HostStarMassSlrMass;
//    }
//
//    public void setHostStarMassSlrMass(String hostStarMassSlrMass) {
//        HostStarMassSlrMass = hostStarMassSlrMass;
//    }
//
//    public String getHostStarRadiusSlrRad() {
//        return HostStarRadiusSlrRad;
//    }
//
//    public void setHostStarRadiusSlrRad(String hostStarRadiusSlrRad) {
//        HostStarRadiusSlrRad = hostStarRadiusSlrRad;
//    }
//
//    public String getHostStarMetallicity() {
//        return HostStarMetallicity;
//    }
//
//    public void setHostStarMetallicity(String hostStarMetallicity) {
//        HostStarMetallicity = hostStarMetallicity;
//    }
//
//    public String getHostStarTempK() {
//        return HostStarTempK;
//    }
//
//    public void setHostStarTempK(String hostStarTempK) {
//        HostStarTempK = hostStarTempK;
//    }
//
//    public String getHostStarAgeGyr() {
//        return HostStarAgeGyr;
//    }
//
//    public void setHostStarAgeGyr(String hostStarAgeGyr) {
//        HostStarAgeGyr = hostStarAgeGyr;
//    }
//
//
//
//
//    public String getPlanetaryMassJpt() {
//        return planetaryMassJpt;
//    }
//
//    public void setPlanetaryMassJpt(String planetaryMassJpt) {
//        this.planetaryMassJpt = planetaryMassJpt;
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
    public void setArrayList(ArrayList<ParticularData> particularData)
    {
        this.particularData = particularData;
    }
    public ArrayList<ParticularData> getParticularData()
    {
        return particularData;
    }


}
