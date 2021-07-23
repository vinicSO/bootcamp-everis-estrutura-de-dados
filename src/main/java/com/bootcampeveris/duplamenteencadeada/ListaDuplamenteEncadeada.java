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

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        NoDuplo<T> noAux = getNo(index);
        novoNo.setNoProximo(noAux);
        if (noAux.getNoProximo() != null) {
            novoNo.setNoPrevio(noAux.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(ultimoNo);
            this.ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAux = primeiroNo;

        for (int i=0 ; (i<index) && (noAux != null) ; i++) {
            noAux = noAux.getNoProximo();
        }

        return noAux;
    }

    public int size() {
        return this.tamanhoLista;
    }

}
