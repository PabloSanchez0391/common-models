
package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class HumedadRelativa {

    @SerializedName("maxima")
    @Expose
    private String maxima;
    @SerializedName("minima")
    @Expose
    private String minima;
    @SerializedName("dato")
    @Expose
    private List<String> dato;

    public HumedadRelativa() {
    }

    public String getMaxima() {
        return maxima;
    }

    public void setMaxima(String maxima) {
        this.maxima = maxima;
    }

    public String getMinima() {
        return minima;
    }

    public void setMinima(String minima) {
        this.minima = minima;
    }

    public List<String> getDato() {
        return dato;
    }

    public void setDato(List<String> dato) {
        this.dato = dato;
    }

}
