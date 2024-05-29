
package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class AnswerMunicipioEspecifico {

    @SerializedName("origin")
    @Expose
    private Origin origin;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("metadescripcion")
    @Expose
    private String metadescripcion;
    @SerializedName("keywords")
    @Expose
    private String keywords;
    @SerializedName("municipio")
    @Expose
    private Municipio municipio;
    @SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("stateSky")
    @Expose
    private StateSky stateSky;
    @SerializedName("temperatura_actual")
    @Expose
    private String temperaturaActual;
    @SerializedName("temperaturas")
    @Expose
    private Temperaturas temperaturas;
    @SerializedName("humedad")
    @Expose
    private String humedad;
    @SerializedName("viento")
    @Expose
    private String viento;
    @SerializedName("precipitacion")
    @Expose
    private String precipitacion;
    @SerializedName("lluvia")
    @Expose
    private String lluvia;
    @SerializedName("imagen")
    @Expose
    private Object imagen;
    @SerializedName("pronostico")
    @Expose
    private Pronostico pronostico;
    @SerializedName("proximos_dias")
    @Expose
    private List<ProximosDia> proximosDias;
    @SerializedName("breadcrumb")
    @Expose
    private List<Breadcrumb> breadcrumb;

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetadescripcion() {
        return metadescripcion;
    }

    public void setMetadescripcion(String metadescripcion) {
        this.metadescripcion = metadescripcion;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public StateSky getStateSky() {
        return stateSky;
    }

    public void setStateSky(StateSky stateSky) {
        this.stateSky = stateSky;
    }

    public String getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(String temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public Temperaturas getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(Temperaturas temperaturas) {
        this.temperaturas = temperaturas;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getViento() {
        return viento;
    }

    public void setViento(String viento) {
        this.viento = viento;
    }

    public String getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(String precipitacion) {
        this.precipitacion = precipitacion;
    }

    public String getLluvia() {
        return lluvia;
    }

    public void setLluvia(String lluvia) {
        this.lluvia = lluvia;
    }

    public Object getImagen() {
        return imagen;
    }

    public void setImagen(Object imagen) {
        this.imagen = imagen;
    }

    public Pronostico getPronostico() {
        return pronostico;
    }

    public void setPronostico(Pronostico pronostico) {
        this.pronostico = pronostico;
    }

    public List<ProximosDia> getProximosDias() {
        return proximosDias;
    }

    public void setProximosDias(List<ProximosDia> proximosDias) {
        this.proximosDias = proximosDias;
    }

    public List<Breadcrumb> getBreadcrumb() {
        return breadcrumb;
    }

    public void setBreadcrumb(List<Breadcrumb> breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

}
