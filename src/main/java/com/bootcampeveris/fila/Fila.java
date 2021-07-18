package com.bootcampeveris.fila;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                    continue;
                }
                noAuxiliar.setRefNo(null);
                break;
            }
            return primeiroNo;
        }
        return null;
    }

    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                    continue;
                }
                break;
            }
            return primeiroNo;
        }
        return null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fila{ ");
        No noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila != null) {
            while (true){
                sb.append("[No{objeto=").append(noAuxiliar.getObject()).append("}]--->");

                if(noAuxiliar.getRefNo() != null)
                    noAuxiliar = noAuxiliar.getRefNo();
                else {
                    sb.append("null");
                    break;
                }
            }
        }
        sb.append(" }");
        return sb.toString();
    }
}
