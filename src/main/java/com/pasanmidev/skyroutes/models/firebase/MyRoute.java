package com.pasanmidev.skyroutes.models.firebase;

import com.pasanmidev.skyroutes.models.map.request.MyLatLng;
import com.pasanmidev.skyroutes.models.weather.OpenWeatherResponse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyRoute implements Serializable {
    private String id;
    private String origin;
    private String destination;
    private String encodedPolyline;
    private long timeRequest;
    private List<MyLatLng> listPointsRouteHash;
    private List<OpenWeatherResponse> listaAuxRespuestasWeatherHash;
    private List<Long> arrayLatLngForTimeHash;
    private List<Boolean> arrayBooleanForSunIncidence;

    public MyRoute(String id, String origin, String destination, String encodedPolyline, long timeRequest,
                   List<MyLatLng> listPointsRouteHash, List<OpenWeatherResponse> listaAuxRespuestasWeatherHash,
                   List<Long> timerOriginToRequest, List<Boolean> arrayBooleanForSunIncidence) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.encodedPolyline = encodedPolyline;
        this.timeRequest = timeRequest;
        this.listPointsRouteHash = listPointsRouteHash;
        this.listaAuxRespuestasWeatherHash = listaAuxRespuestasWeatherHash;
        this.arrayLatLngForTimeHash = timerOriginToRequest;
        this.arrayBooleanForSunIncidence = arrayBooleanForSunIncidence;
    }

    public MyRoute(MyRouteFirebasePush myRouteFirebasePush) {
        this.id = myRouteFirebasePush.getId();
        this.origin = myRouteFirebasePush.getOrigin();
        this.destination = myRouteFirebasePush.getDestination();
        this.encodedPolyline = myRouteFirebasePush.getEncodedPolyline();
        this.timeRequest = myRouteFirebasePush.getTimeRequest();
        this.listPointsRouteHash = new ArrayList<>(myRouteFirebasePush.getListPointsRouteHash().values());
        this.listaAuxRespuestasWeatherHash = new ArrayList<>(myRouteFirebasePush.getListaAuxRespuestasWeatherHash().values());
        this.arrayLatLngForTimeHash = new ArrayList<>(myRouteFirebasePush.getArrayLatLngForTimeHash().values());
        this.arrayBooleanForSunIncidence = new ArrayList<>(myRouteFirebasePush.getArrayBooleanForSunIncidence().values());
    }

    public MyRoute(MyRoute original) {
        this.id = original.id;
        this.origin = original.origin;
        this.destination = original.destination;
        this.encodedPolyline = original.encodedPolyline;
        this.timeRequest = original.timeRequest;
        if (original.listPointsRouteHash != null) {
            this.listPointsRouteHash = new ArrayList<>(original.listPointsRouteHash);
        }
        if (original.listaAuxRespuestasWeatherHash != null) {
            this.listaAuxRespuestasWeatherHash = new ArrayList<>(original.listaAuxRespuestasWeatherHash);
        }
        if (original.arrayLatLngForTimeHash != null) {
            this.arrayLatLngForTimeHash = new ArrayList<>(original.arrayLatLngForTimeHash);
        }
        if (original.arrayBooleanForSunIncidence != null) {
            this.arrayBooleanForSunIncidence = new ArrayList<>(original.arrayBooleanForSunIncidence);
        }
    }


    public MyRoute() {
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

    public List<Boolean> getArrayBooleanForSunIncidence() {
        return arrayBooleanForSunIncidence;
    }

    // Setters
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

    public void setArrayBooleanForSunIncidence(List<Boolean> arrayBooleanForSunIncidence) {
        this.arrayBooleanForSunIncidence = arrayBooleanForSunIncidence;
    }
}
