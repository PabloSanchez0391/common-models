
package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class ProximosDia {

    @SerializedName("@attributes")
    @Expose
    private Attributes__4 attributes;                       // Modificado por mi OK
    @SerializedName("prob_precipitacion")
    @Expose
    private Object probPrecipitacion;                   // Esto da problemas !Recordar 3º List, resto String¡
    @SerializedName("cota_nieve_prov")
    @Expose
    private Object cotaNieveProv;                       // Esto da problemas !Recordar 3º List, resto String¡
    @SerializedName("estado_cielo")
    @Expose
    private Object estadoCielo;                         // Esto da problemas !Recordar 3º List, resto String¡
    @SerializedName("viento")
    @Expose
    private Object viento;                         // Esto da problemas !Recordar 3º List, resto String¡
    @SerializedName("racha_max")
    @Expose
    private Object rachaMax;                        // Esto da problemas !Recordar 3º List, resto String¡
    @SerializedName("temperatura")
    @Expose
    private Temperatura temperatura;                        // OK
    @SerializedName("sens_termica")
    @Expose
    private SensTermica sensTermica;                        // OK
    @SerializedName("humedad_relativa")
    @Expose
    private HumedadRelativa humedadRelativa;                // OK
    @SerializedName("uv_max")
    @Expose
    private String uvMax;                                   // OK
    @SerializedName("estado_cielo_descripcion")
    @Expose
    private Object estadoCieloDescripcion;            // Esto da problemas !Recordar 3º List, resto String¡

    public ProximosDia() {
    }

    public Attributes__4 getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes__4 attributes) {
        this.attributes = attributes;
    }

    public Object getProbPrecipitacion() {
        return probPrecipitacion;
    }

    public void setProbPrecipitacion(Object probPrecipitacion) {
        this.probPrecipitacion = probPrecipitacion;
    }

    public Object getCotaNieveProv() {
        return cotaNieveProv;
    }

    public void setCotaNieveProv(Object cotaNieveProv) {
        this.cotaNieveProv = cotaNieveProv;
    }

    public Object getEstadoCielo() {
        return estadoCielo;
    }

    public void setEstadoCielo(Object estadoCielo) {
        this.estadoCielo = estadoCielo;
    }

    public Object getViento() {
        return viento;
    }

    public void setViento(Object viento) {
        this.viento = viento;
    }

    public Object getRachaMax() {
        return rachaMax;
    }

    public void setRachaMax(Object rachaMax) {
        this.rachaMax = rachaMax;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public SensTermica getSensTermica() {
        return sensTermica;
    }

    public void setSensTermica(SensTermica sensTermica) {
        this.sensTermica = sensTermica;
    }

    public HumedadRelativa getHumedadRelativa() {
        return humedadRelativa;
    }

    public void setHumedadRelativa(HumedadRelativa humedadRelativa) {
        this.humedadRelativa = humedadRelativa;
    }

    public String getUvMax() {
        return uvMax;
    }

    public void setUvMax(String uvMax) {
        this.uvMax = uvMax;
    }

    public Object getEstadoCieloDescripcion() {
        return estadoCieloDescripcion;
    }

    public void setEstadoCieloDescripcion(Object estadoCieloDescripcion) {
        this.estadoCieloDescripcion = estadoCieloDescripcion;
    }
}
