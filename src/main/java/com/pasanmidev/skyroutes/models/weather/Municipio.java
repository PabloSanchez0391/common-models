
package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Municipio {

    @SerializedName("CODIGOINE")
    @Expose
    private String codigoine;
    @SerializedName("ID_REL")
    @Expose
    private String idRel;
    @SerializedName("COD_GEO")
    @Expose
    private String codGeo;
    @SerializedName("CODPROV")
    @Expose
    private String codprov;
    @SerializedName("NOMBRE_PROVINCIA")
    @Expose
    private String nombreProvincia;
    @SerializedName("NOMBRE")
    @Expose
    private String nombre;
    @SerializedName("POBLACION_MUNI")
    @Expose
    private Integer poblacionMuni;
    @SerializedName("SUPERFICIE")
    @Expose
    private Double superficie;
    @SerializedName("PERIMETRO")
    @Expose
    private Integer perimetro;
    @SerializedName("CODIGOINE_CAPITAL")
    @Expose
    private String codigoineCapital;
    @SerializedName("NOMBRE_CAPITAL")
    @Expose
    private String nombreCapital;
    @SerializedName("POBLACION_CAPITAL")
    @Expose
    private String poblacionCapital;
    @SerializedName("HOJA_MTN25")
    @Expose
    private String hojaMtn25;
    @SerializedName("LONGITUD_ETRS89_REGCAN95")
    @Expose
    private Double longitudEtrs89Regcan95;
    @SerializedName("LATITUD_ETRS89_REGCAN95")
    @Expose
    private Double latitudEtrs89Regcan95;
    @SerializedName("ORIGEN_COORD")
    @Expose
    private String origenCoord;
    @SerializedName("ALTITUD")
    @Expose
    private Integer altitud;
    @SerializedName("ORIGEN_ALTITUD")
    @Expose
    private String origenAltitud;
    @SerializedName("DISCREPANTE_INE")
    @Expose
    private Integer discrepanteIne;

    public Municipio() {
    }

    public String getCodigoine() {
        return codigoine;
    }

    public void setCodigoine(String codigoine) {
        this.codigoine = codigoine;
    }

    public String getIdRel() {
        return idRel;
    }

    public void setIdRel(String idRel) {
        this.idRel = idRel;
    }

    public String getCodGeo() {
        return codGeo;
    }

    public void setCodGeo(String codGeo) {
        this.codGeo = codGeo;
    }

    public String getCodprov() {
        return codprov;
    }

    public void setCodprov(String codprov) {
        this.codprov = codprov;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoblacionMuni() {
        return poblacionMuni;
    }

    public void setPoblacionMuni(Integer poblacionMuni) {
        this.poblacionMuni = poblacionMuni;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public Integer getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Integer perimetro) {
        this.perimetro = perimetro;
    }

    public String getCodigoineCapital() {
        return codigoineCapital;
    }

    public void setCodigoineCapital(String codigoineCapital) {
        this.codigoineCapital = codigoineCapital;
    }

    public String getNombreCapital() {
        return nombreCapital;
    }

    public void setNombreCapital(String nombreCapital) {
        this.nombreCapital = nombreCapital;
    }

    public String getPoblacionCapital() {
        return poblacionCapital;
    }

    public void setPoblacionCapital(String poblacionCapital) {
        this.poblacionCapital = poblacionCapital;
    }

    public String getHojaMtn25() {
        return hojaMtn25;
    }

    public void setHojaMtn25(String hojaMtn25) {
        this.hojaMtn25 = hojaMtn25;
    }

    public Double getLongitudEtrs89Regcan95() {
        return longitudEtrs89Regcan95;
    }

    public void setLongitudEtrs89Regcan95(Double longitudEtrs89Regcan95) {
        this.longitudEtrs89Regcan95 = longitudEtrs89Regcan95;
    }

    public Double getLatitudEtrs89Regcan95() {
        return latitudEtrs89Regcan95;
    }

    public void setLatitudEtrs89Regcan95(Double latitudEtrs89Regcan95) {
        this.latitudEtrs89Regcan95 = latitudEtrs89Regcan95;
    }

    public String getOrigenCoord() {
        return origenCoord;
    }

    public void setOrigenCoord(String origenCoord) {
        this.origenCoord = origenCoord;
    }

    public Integer getAltitud() {
        return altitud;
    }

    public void setAltitud(Integer altitud) {
        this.altitud = altitud;
    }

    public String getOrigenAltitud() {
        return origenAltitud;
    }

    public void setOrigenAltitud(String origenAltitud) {
        this.origenAltitud = origenAltitud;
    }

    public Integer getDiscrepanteIne() {
        return discrepanteIne;
    }

    public void setDiscrepanteIne(Integer discrepanteIne) {
        this.discrepanteIne = discrepanteIne;
    }

}
