package com.pasanmidev.skyroutes.models.firebase;

import com.google.type.LatLng;
import com.pasanmidev.skyroutes.models.weather.OpenWeatherResponse;


import java.util.List;

// TODO eliminar clase
public class MyRouteFirebasePull {

    public String id;
    private String origin;
    private String destination;
    private String encodedPolyline;
    private long timeRequest;
    private List<LatLng> listPointsRouteHash;
    private List<OpenWeatherResponse> listaAuxRespuestasWeatherHash;
    private List<Long> arrayLatLngForTimeHash;

    public MyRouteFirebasePull() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEncodedPolyline() {
        return encodedPolyline;
    }

    public void setEncodedPolyline(String encodedPolyline) {
        this.encodedPolyline = encodedPolyline;
    }

    public long getTimeRequest() {
        return timeRequest;
    }

    public void setTimeRequest(long timeRequest) {
        this.timeRequest = timeRequest;
    }

    public List<LatLng> getListPointsRouteHash() {
        return listPointsRouteHash;
    }

    public void setListPointsRouteHash(List<LatLng> listPointsRouteHash) {
        this.listPointsRouteHash = listPointsRouteHash;
    }

    public List<OpenWeatherResponse> getListaAuxRespuestasWeatherHash() {
        return listaAuxRespuestasWeatherHash;
    }

    public void setListaAuxRespuestasWeatherHash(List<OpenWeatherResponse> listaAuxRespuestasWeatherHash) {
        this.listaAuxRespuestasWeatherHash = listaAuxRespuestasWeatherHash;
    }

    public List<Long> getArrayLatLngForTimeHash() {
        return arrayLatLngForTimeHash;
    }

    public void setArrayLatLngForTimeHash(List<Long> arrayLatLngForTimeHash) {
        this.arrayLatLngForTimeHash = arrayLatLngForTimeHash;
    }
}
