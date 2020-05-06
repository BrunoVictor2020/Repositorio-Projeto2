package com.example.listagemdedados.model;

public class Lista {
    private String descricao;
    private int urlFoto;
    public Lista(String descricao, int urlFoto) {
        this.descricao = descricao;
        this.urlFoto = urlFoto;
    }

    public Lista() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(int urlFoto) {
        this.urlFoto = urlFoto;
    }
}
