package com.example.hotshotbr.zica0.entities;

/**
 * Created by hotshotbr on 14/04/2016.
 */
public class Causa {
    private Denuncia denuncia;
    private TipoOjeito tipoOjeito;


    public Causa() {
    }

    public Causa(Denuncia denuncia, TipoOjeito tipoOjeito) {
        this.denuncia = denuncia;
        this.tipoOjeito = tipoOjeito;
    }

    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }

    public TipoOjeito getTipoOjeito() {
        return tipoOjeito;
    }

    public void setTipoOjeito(TipoOjeito tipoOjeito) {
        this.tipoOjeito = tipoOjeito;
    }
}
