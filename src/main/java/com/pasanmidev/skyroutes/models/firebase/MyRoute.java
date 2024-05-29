package com.pasanmidev.skyroutes.models.firebase;

import com.google.type.LatLng;
import com.pasanmidev.skyroutes.models.map.request.MyLatLng;
import com.pasanmidev.skyroutes.models.weather.OpenWeatherResponse;

import java.io.Serializable;
import java.util.List;

public class MyRoute implements Serializable {
    private  String id;
    private  String origin;
    private  String destination;
    private  String encodedPolyline;
    private  long timeRequest;
    private List<MyLatLng> listPointsRouteHash;
    private  List<OpenWeatherResponse> listaAuxRespuestasWeatherHash;
    private  List<Long> arrayLatLngForTimeHash;


    public MyRoute(String id, String origin, String destination, String encodedPolyline, long timeRequest,
                   List<MyLatLng> listPointsRouteHash, List<OpenWeatherResponse> listaAuxRespuestasWeatherHash,
                   List<Long> timerOriginToRequest
    ) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.encodedPolyline = encodedPolyline;
        this.timeRequest = timeRequest;
        this.listPointsRouteHash = listPointsRouteHash;
        this.listaAuxRespuestasWeatherHash = listaAuxRespuestasWeatherHash;
        this.arrayLatLngForTimeHash = timerOriginToRequest;
    }

    @Override
    public String toString() {
        return "Origin: " + origin + ", Destination: " + destination;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getEncodedPolyline() {
        return encodedPolyline;
    }

    public long getTimeRequest() {
        return timeRequest;
    }

    public List<MyLatLng> getListPointsRouteHash() {
        return listPointsRouteHash;
    }

    public List<OpenWeatherResponse> getListaAuxRespuestasWeatherHash() {
        return listaAuxRespuestasWeatherHash;
    }

    public List<Long> getArrayLatLngForTimeHash() {
        return arrayLatLngForTimeHash;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setEncodedPolyline(String encodedPolyline) {
        this.encodedPolyline = encodedPolyline;
    }

    public void setTimeRequest(long timeRequest) {
        this.timeRequest = timeRequest;
    }

    public void setListPointsRouteHash(List<MyLatLng> listPointsRouteHash) {
        this.listPointsRouteHash = listPointsRouteHash;
    }

    public void setListaAuxRespuestasWeatherHash(List<OpenWeatherResponse> listaAuxRespuestasWeatherHash) {
        this.listaAuxRespuestasWeatherHash = listaAuxRespuestasWeatherHash;
    }

    public void setArrayLatLngForTimeHash(List<Long> arrayLatLngForTimeHash) {
        this.arrayLatLngForTimeHash = arrayLatLngForTimeHash;
    }
}