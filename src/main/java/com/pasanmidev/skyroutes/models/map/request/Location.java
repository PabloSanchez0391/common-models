package com.pasanmidev.skyroutes.models.map.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Location {
    private MyLatLng latLng;


    public Location(MyLatLng latLng) {
        this.latLng = latLng;
    }

    public MyLatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(MyLatLng latLng) {
        this.latLng = latLng;
    }

    public Location() {
    }
}
