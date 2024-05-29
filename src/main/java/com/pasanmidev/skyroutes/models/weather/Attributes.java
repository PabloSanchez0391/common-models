
package com.pasanmidev.skyroutes.models.weather;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Attributes {

    @SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("orto")
    @Expose
    private String orto;
    @SerializedName("ocaso")
    @Expose
    private String ocaso;

    public Attributes() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getOrto() {
        return orto;
    }

    public void setOrto(String orto) {
        this.orto = orto;
    }

    public String getOcaso() {
        return ocaso;
    }

    public void setOcaso(String ocaso) {
        this.ocaso = ocaso;
    }

}
