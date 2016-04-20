package com.example.hotshotbr.zica0.entities;

/**
 * Created by hotshotbr on 14/04/2016.
 */
public class Usuario {
    private Integer idUsuario;
    private String login;
    private String senha;
    private  Orgao orgao;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String login, String senha, Orgao orgao) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.orgao = orgao;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Orgao getOrgao() {
        return orgao;
    }

    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }
}
