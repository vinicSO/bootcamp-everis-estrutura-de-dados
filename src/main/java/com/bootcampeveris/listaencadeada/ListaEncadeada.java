package com.bootcampeveris.listaencadeada;

public class ListaEncadeada<T> {

    private No<T> refNoEntrada;

    public ListaEncadeada() {
        this.refNoEntrada = null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null ? true : false;
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> refAux = refNoEntrada;

        while (true){
            if (refAux != null){
                tamanhoLista++;
                if (refAux.getProximoNo() != null) {
                    refAux = refAux.getProximoNo();
                } else break;
            } else break;
        }

        return tamanhoLista;
    }
}
