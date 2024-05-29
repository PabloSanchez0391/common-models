package com.pasanmidev.skyroutes.models.map.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Route {
    private int distanceMeters;
    private String duration;
    private EncodedPolyline polyline;

    public int getDistanceMeters() {
        return distanceMeters;
    }

    public String getDuration() {
        return duration;
    }

    public EncodedPolyline getPolyline() {
        return polyline;
    }

    public Route(int distanceMeters, String duration, EncodedPolyline polyline) {
        this.distanceMeters = distanceMeters;
        this.duration = duration;
        this.polyline = polyline;
    }
}

