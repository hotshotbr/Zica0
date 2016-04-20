package com.example.hotshotbr.zica0.entities;

import java.util.Date;

/**
 * Created by hotshotbr on 14/04/2016.
 */
public class Andamento {
    private Integer idAndamento;
    private Integer idDenuncia;
    private Integer idOrgao;
    private Date dataAndamento;
    private String dsConclusao;
    private Date dataConclusao;


    public Andamento() {
    }

    public Andamento(Integer idAndamento, Integer idDenuncia, Integer idOrgao, Date dataAndamento, String dsConclusao, Date dataConclusao) {
        this.idAndamento = idAndamento;
        this.idDenuncia = idDenuncia;
        this.idOrgao = idOrgao;
        this.dataAndamento = dataAndamento;
        this.dsConclusao = dsConclusao;
        this.dataConclusao = dataConclusao;
    }

    public Integer getIdAndamento() {
        return idAndamento;
    }

    public void setIdAndamento(Integer idAndamento) {
        this.idAndamento = idAndamento;
    }

    public Integer getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(Integer idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public Integer getIdOrgao() {
        return idOrgao;
    }

    public void setIdOrgao(Integer idOrgao) {
        this.idOrgao = idOrgao;
    }

    public Date getDataAndamento() {
        return dataAndamento;
    }

    public void setDataAndamento(Date dataAndamento) {
        this.dataAndamento = dataAndamento;
    }

    public String getDsConclusao() {
        return dsConclusao;
    }

    public void setDsConclusao(String dsConclusao) {
        this.dsConclusao = dsConclusao;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
}
