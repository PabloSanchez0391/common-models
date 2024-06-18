package com.pasanmidev.skyroutes.models.map.response;

import java.util.List;

import lombok.Data;

@Data
public class CustomComputeRoutesResponseTime {
    private List<RouteTime> routes;

    public List<RouteTime> getRoutes() {
        return routes;
    }

    public CustomComputeRoutesResponseTime(List<RouteTime> routes) {
        this.routes = routes;
    }

    public CustomComputeRoutesResponseTime() {
    }
}
