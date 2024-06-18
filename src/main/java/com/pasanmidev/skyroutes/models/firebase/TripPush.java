package com.pasanmidev.skyroutes.models.firebase;

import java.util.ArrayList;
import java.util.List;

public class TripPush {
    private String id;
    private String name;
    private long timeRequest;
    private List<MyRouteFirebasePush> listMyRoutes;

    public TripPush() {
        listMyRoutes = new ArrayList<MyRouteFirebasePush>();
    }

    public TripPush(String id, String name, long timeRequest, List<MyRouteFirebasePush> listMyRoutes) {
        this.id = id;
        this.name = name;
        this.timeRequest = timeRequest;
        this.listMyRoutes = listMyRoutes;
    }

    public TripPush(Trip trip) {
        this.id = trip.getId();
        this.name = trip.getName();
        this.timeRequest = trip.getTimeRequest();
        this.listMyRoutes = new ArrayList<>();
        for (MyRoute route : trip.getListMyRoutes()) {
            this.listMyRoutes.add(new MyRouteFirebasePush(route));
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTimeRequest() {
        return timeRequest;
    }

    public void setTimeRequest(long timeRequest) {
        this.timeRequest = timeRequest;
    }

    public List<MyRouteFirebasePush> getListMyRoutes() {
        return listMyRoutes;
    }

    public void setListMyRoutes(List<MyRouteFirebasePush> listMyRoutes) {
        this.listMyRoutes = listMyRoutes;
    }
}
