package com.pasanmidev.skyroutes.models.map.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CustomComputeRoutesResponse {
    private List<Route> routes;

    public List<Route> getRoutes() {
        return routes;
    }

    public CustomComputeRoutesResponse(List<Route> routes) {
        this.routes = routes;
    }
}
