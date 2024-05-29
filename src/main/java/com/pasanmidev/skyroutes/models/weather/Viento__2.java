
package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Viento__2 {

    @SerializedName("@attributes")
    @Expose
    private Attributes__4 attributes;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("velocidad")
    @Expose
    private String velocidad;

    public Viento__2() {
    }

    public Attributes__4 getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes__4 attributes) {
        this.attributes = attributes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

}
