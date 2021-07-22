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

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAux = primeiroNo;

        for (int i=0 ; (i<index) && (noAux != null) ; i++) {
            noAux = noAux.getNoProximo();
        }

        return noAux;
    }

    public int size() {
        return tamanhoLista;
    }

}
