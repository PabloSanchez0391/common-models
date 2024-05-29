
package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Hoy {

    @SerializedName("@attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("estado_cielo")
    @Expose
    private List<String> estadoCielo;
    @SerializedName("precipitacion")
    @Expose
    private List<String> precipitacion;
    @SerializedName("prob_precipitacion")
    @Expose
    private List<String> probPrecipitacion;
    @SerializedName("prob_tormenta")
    @Expose
    private List<String> probTormenta;
    @SerializedName("nieve")
    @Expose
    private List<String> nieve;
    @SerializedName("prob_nieve")
    @Expose
    private List<String> probNieve;
    @SerializedName("temperatura")
    @Expose
    private List<String> temperatura;
    @SerializedName("sens_termica")
    @Expose
    private List<String> sensTermica;
    @SerializedName("humedad_relativa")
    @Expose
    private List<String> humedadRelativa;
    @SerializedName("viento")
    @Expose
    private List<Viento> viento;
    @SerializedName("racha_max")
    @Expose
    private List<String> rachaMax;
    @SerializedName("estado_cielo_descripcion")
    @Expose
    private List<String> estadoCieloDescripcion;

    public Hoy() {
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public List<String> getEstadoCielo() {
        return estadoCielo;
    }

    public void setEstadoCielo(List<String> estadoCielo) {
        this.estadoCielo = estadoCielo;
    }

    public List<String> getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(List<String> precipitacion) {
        this.precipitacion = precipitacion;
    }

    public List<String> getProbPrecipitacion() {
        return probPrecipitacion;
    }

    public void setProbPrecipitacion(List<String> probPrecipitacion) {
        this.probPrecipitacion = probPrecipitacion;
    }

    public List<String> getProbTormenta() {
        return probTormenta;
    }

    public void setProbTormenta(List<String> probTormenta) {
        this.probTormenta = probTormenta;
    }

    public List<String> getNieve() {
        return nieve;
    }

    public void setNieve(List<String> nieve) {
        this.nieve = nieve;
    }

    public List<String> getProbNieve() {
        return probNieve;
    }

    public void setProbNieve(List<String> probNieve) {
        this.probNieve = probNieve;
    }

    public List<String> getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(List<String> temperatura) {
        this.temperatura = temperatura;
    }

    public List<String> getSensTermica() {
        return sensTermica;
    }

    public void setSensTermica(List<String> sensTermica) {
        this.sensTermica = sensTermica;
    }

    public List<String> getHumedadRelativa() {
        return humedadRelativa;
    }

    public void setHumedadRelativa(List<String> humedadRelativa) {
        this.humedadRelativa = humedadRelativa;
    }

    public List<Viento> getViento() {
        return viento;
    }

    public void setViento(List<Viento> viento) {
        this.viento = viento;
    }

    public List<String> getRachaMax() {
        return rachaMax;
    }

    public void setRachaMax(List<String> rachaMax) {
        this.rachaMax = rachaMax;
    }

    public List<String> getEstadoCieloDescripcion() {
        return estadoCieloDescripcion;
    }

    public void setEstadoCieloDescripcion(List<String> estadoCieloDescripcion) {
        this.estadoCieloDescripcion = estadoCieloDescripcion;
    }

}
