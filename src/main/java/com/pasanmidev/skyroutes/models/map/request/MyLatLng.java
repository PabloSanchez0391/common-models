package com.pasanmidev.skyroutes.models.map.request;

public class MyLatLng {
    double latitude;
    double longitude;

    public MyLatLng(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public MyLatLng() {
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public  void setLatLng(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
