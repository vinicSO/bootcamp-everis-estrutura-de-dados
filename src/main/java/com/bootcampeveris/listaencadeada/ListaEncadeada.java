package com.bootcampeveris.listaencadeada;

public class ListaEncadeada<T> {

    private No<T> refNoEntrada;

    public ListaEncadeada() {
        this.refNoEntrada = null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null ? true : false;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<T>(conteudo);
        if (this.isEmpty()) {
            refNoEntrada = novoNo;
            return;
        }
        No<T> refAux = refNoEntrada;
        for (int i=0 ; i < this.size()-1 ; i++) {
            refAux = refAux.getProximoNo();
        }
        refAux.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        int ultimoIndice = this.size()-1;
        if (index > ultimoIndice) {
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + ".");
        }
        No<T> refAux = refNoEntrada;
        No<T> noRetorno = null;
        for (int i=0 ; i < ultimoIndice ; i++) {
            if (i == index) {
                noRetorno = refAux;
                break;
            }
            refAux = refAux.getProximoNo();
        }
        return noRetorno;
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
