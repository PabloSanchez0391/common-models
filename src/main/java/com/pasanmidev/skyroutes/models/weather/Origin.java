
package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Origin {

    @SerializedName("productor")
    @Expose
    private String productor;
    @SerializedName("web")
    @Expose
    private String web;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("nota_legal")
    @Expose
    private String notaLegal;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;

    public Origin() {
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getNotaLegal() {
        return notaLegal;
    }

    public void setNotaLegal(String notaLegal) {
        this.notaLegal = notaLegal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
