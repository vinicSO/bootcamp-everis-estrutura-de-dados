package com.bootcampeveris.duplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo primeiroNo;
    private NoDuplo ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public int size() {
        return tamanhoLista;
    }

}
