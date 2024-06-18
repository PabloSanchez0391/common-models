package com.pasanmidev.skyroutes.models.firebase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trip {
    private String id;
    private String name;
    private long timeRequest;
    private List<MyRoute> listMyRoutes;

    public Trip() {
    }

    public Trip(String id, String name, long timeRequest, List<MyRoute> listMyRoutes) {
        this.id = id;
        this.name = name;
        this.timeRequest = timeRequest;
        this.listMyRoutes = listMyRoutes;
    }

    public Trip(Trip original) {
        this.id = original.id;
        this.name = original.name;
        this.timeRequest = original.timeRequest;
        if (original.listMyRoutes != null) {
            this.listMyRoutes = new ArrayList<>();
            for (MyRoute route : original.listMyRoutes) {
                this.listMyRoutes.add(new MyRoute(route));
            }
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

    public List<MyRoute> getListMyRoutes() {
        return listMyRoutes;
    }

    public void setListMyRoutes(List<MyRoute> listMyRoutes) {
        this.listMyRoutes = listMyRoutes;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("name", name);
        result.put("timeRequest", timeRequest);
        result.put("listMyRoutes", listMyRoutes);
        return result;
    }

}
