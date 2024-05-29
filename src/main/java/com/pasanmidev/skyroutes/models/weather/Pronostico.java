
package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Pronostico {

    @SerializedName("hoy")
    @Expose
    private Hoy hoy;
    @SerializedName("manana")
    @Expose
    private Manana manana;

    public Hoy getHoy() {
        return hoy;
    }

    public void setHoy(Hoy hoy) {
        this.hoy = hoy;
    }

    public Manana getManana() {
        return manana;
    }

    public void setManana(Manana manana) {
        this.manana = manana;
    }

}
