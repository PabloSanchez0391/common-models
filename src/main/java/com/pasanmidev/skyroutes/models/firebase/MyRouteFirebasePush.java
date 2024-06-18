package com.pasanmidev.skyroutes.models.firebase;

import com.pasanmidev.skyroutes.models.map.request.MyLatLng;
import com.pasanmidev.skyroutes.models.weather.OpenWeatherResponse;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyRouteFirebasePush implements Serializable {

    private String id;
    private String origin;
    private String destination;
    private String encodedPolyline;
    private long timeRequest;

    private HashMap<String, MyLatLng> listPointsRouteHash;
    private HashMap<String, OpenWeatherResponse> listaAuxRespuestasWeatherHash;
    private HashMap<String, Long> arrayLatLngForTimeHash;
    private HashMap<String, Boolean> arrayBooleanForSunIncidence;

    public MyRouteFirebasePush() {
    }

    public MyRouteFirebasePush(MyRouteFirebasePush other) {
        this.id = other.id;
        this.origin = other.origin;
        this.destination = other.destination;
        this.encodedPolyline = other.encodedPolyline;
        this.timeRequest = other.timeRequest;
        // Crear nuevas instancias de los mapas para evitar modificar los originales
        this.listPointsRouteHash = new HashMap<>(other.listPointsRouteHash);
        this.listaAuxRespuestasWeatherHash = new HashMap<>(other.listaAuxRespuestasWeatherHash);
        this.arrayLatLngForTimeHash = new HashMap<>(other.arrayLatLngForTimeHash);
        this.arrayBooleanForSunIncidence = new HashMap<>(other.arrayBooleanForSunIncidence);
    }

    public MyRouteFirebasePush(MyRoute myRoute) {
        this.id = myRoute.getId();
        this.origin = myRoute.getOrigin();
        this.destination = myRoute.getDestination();
        this.encodedPolyline = myRoute.getEncodedPolyline();
        this.timeRequest = myRoute.getTimeRequest();
        this.listPointsRouteHash = new HashMap<>();
        this.listaAuxRespuestasWeatherHash = new HashMap<>();
        this.arrayLatLngForTimeHash = new HashMap<>();
        this.arrayBooleanForSunIncidence = new HashMap<>();

        List<MyLatLng> puntosConsultaWeather = myRoute.getListPointsRouteHash();
        for (int i = 0; i < puntosConsultaWeather.size(); i++) {
            this.listPointsRouteHash.put(i + "", puntosConsultaWeather.get(i));
        }

        List<OpenWeatherResponse> responseWeather = myRoute.getListaAuxRespuestasWeatherHash();
        for (int i = 0; i < responseWeather.size(); i++) {
            this.listaAuxRespuestasWeatherHash.put(i + "", responseWeather.get(i));
        }

        List<Long> timerOriginToRequest = myRoute.getArrayLatLngForTimeHash();
        for (int i = 0; i < timerOriginToRequest.size(); i++) {
            this.arrayLatLngForTimeHash.put(i + "", timerOriginToRequest.get(i));
        }

        List<Boolean> sunIncidenceArray = myRoute.getArrayBooleanForSunIncidence();
        for (int i = 0; i < sunIncidenceArray.size(); i++) {
            this.arrayBooleanForSunIncidence.put(i + "", sunIncidenceArray.get(i));
        }
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

    public HashMap<String, MyLatLng> getListPointsRouteHash() {
        return listPointsRouteHash;
    }

    public void setListPointsRouteHash(HashMap<String, MyLatLng> listPointsRouteHash) {
        this.listPointsRouteHash = listPointsRouteHash;
    }

    public HashMap<String, OpenWeatherResponse> getListaAuxRespuestasWeatherHash() {
        return listaAuxRespuestasWeatherHash;
    }

    public void setListaAuxRespuestasWeatherHash(HashMap<String, OpenWeatherResponse> listaAuxRespuestasWeatherHash) {
        this.listaAuxRespuestasWeatherHash = listaAuxRespuestasWeatherHash;
    }

    public HashMap<String, Long> getArrayLatLngForTimeHash() {
        return arrayLatLngForTimeHash;
    }

    public void setArrayLatLngForTimeHash(HashMap<String, Long> arrayLatLngForTimeHash) {
        this.arrayLatLngForTimeHash = arrayLatLngForTimeHash;
    }

    public HashMap<String, Boolean> getArrayBooleanForSunIncidence() {
        return arrayBooleanForSunIncidence;
    }

    public void setArrayBooleanForSunIncidence(HashMap<String, Boolean> arrayBooleanForSunIncidence) {
        this.arrayBooleanForSunIncidence = arrayBooleanForSunIncidence;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("origin", origin);
        result.put("destination", destination);
        result.put("encodedPolyline", encodedPolyline);
        result.put("timeRequest", timeRequest);
        result.put("listPointsRouteHash", listPointsRouteHash);
        result.put("listaAuxRespuestasWeatherHash", listaAuxRespuestasWeatherHash);
        result.put("arrayLatLngForTimeHash", arrayLatLngForTimeHash);
        result.put("arrayBooleanForSunIncidence", arrayBooleanForSunIncidence);
        return result;
    }
}
