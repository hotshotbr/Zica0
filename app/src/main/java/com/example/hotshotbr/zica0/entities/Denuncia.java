package com.example.hotshotbr.zica0.entities;

import java.util.Date;

/**
 * Created by hotshotbr on 14/04/2016.
 */
public class Denuncia {
    private Integer idDenuncia;
    private String longitude;
    private String latitude;
    private String endereco;
    private String pntoReferencia;
    private Date dataDenuncia;

    public Denuncia(Integer idDenuncia, String longitude, String latitude, String endereco, String pntoReferencia, Date dataDenuncia) {
        this.idDenuncia = idDenuncia;
        this.longitude = longitude;
        this.latitude = latitude;
        this.endereco = endereco;
        this.pntoReferencia = pntoReferencia;
        this.dataDenuncia = dataDenuncia;
    }

    public Denuncia() {

    }

    public Integer getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(Integer idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPntoReferencia() {
        return pntoReferencia;
    }

    public void setPntoReferencia(String pntoReferencia) {
        this.pntoReferencia = pntoReferencia;
    }

    public Date getDataDenuncia() {
        return dataDenuncia;
    }

    public void setDataDenuncia(Date dataDenuncia) {
        this.dataDenuncia = dataDenuncia;
    }
}
