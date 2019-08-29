package com.bappedemo.tourmate.TripAdapter;

public class Trip {

    private String tripName;
    private String tripDetails;


    public Trip() {
    }

    public Trip(String tripName, String tripDetails) {
        this.tripName = tripName;
        this.tripDetails = tripDetails;
    }


    public String getTripName() {
        return tripName;
    }

    public String getTripDetails() {
        return tripDetails;
    }
}
