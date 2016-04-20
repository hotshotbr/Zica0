package com.example.hotshotbr.zica0.entities;

/**
 * Created by hotshotbr on 14/04/2016.
 */
public class TipoOjeito {
    private Integer idTipoObjeto;
    private String dsTipoObjeto;
    private Orgao orgao;

    public TipoOjeito() {
    }

    public TipoOjeito(Integer idTipoObjeto, String dsTipoObjeto, Orgao orgao) {
        this.idTipoObjeto = idTipoObjeto;
        this.dsTipoObjeto = dsTipoObjeto;
        this.orgao = orgao;
    }

    public Integer getIdTipoObjeto() {
        return idTipoObjeto;
    }

    public void setIdTipoObjeto(Integer idTipoObjeto) {
        this.idTipoObjeto = idTipoObjeto;
    }

    public String getDsTipoObjeto() {
        return dsTipoObjeto;
    }

    public void setDsTipoObjeto(String dsTipoObjeto) {
        this.dsTipoObjeto = dsTipoObjeto;
    }

    public Orgao getOrgao() {
        return orgao;
    }

    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }
}
