package com.example.hotshotbr.zica0.entities;

/**
 * Created by hotshotbr on 14/04/2016.
 */
public class Orgao {
    private Integer idorgao;
    private String descricao;
    private Integer NumOrdExec;

    public Orgao() {
    }

    public Orgao(Integer idorgao, String descricao, Integer numOrdExec) {
        this.idorgao = idorgao;
        this.descricao = descricao;
        NumOrdExec = numOrdExec;
    }

    public Integer getIdorgao() {
        return idorgao;
    }

    public void setIdorgao(Integer idorgao) {
        this.idorgao = idorgao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumOrdExec() {
        return NumOrdExec;
    }

    public void setNumOrdExec(Integer numOrdExec) {
        NumOrdExec = numOrdExec;
    }
}
