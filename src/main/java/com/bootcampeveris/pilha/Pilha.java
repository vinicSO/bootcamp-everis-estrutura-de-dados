package com.bootcampeveris.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pilha{");

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if(noAuxiliar != null){
                sb.append("\n[No{dado=" + noAuxiliar + "}]");
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }

        sb.append("\n}\n");
        return sb.toString();
    }
}
