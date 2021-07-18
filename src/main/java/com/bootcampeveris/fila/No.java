package com.bootcampeveris.fila;

public class No<T> {

    private T object;
    private No<T> refNo;

    public No() {
    }

    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("No{");
        sb.append("object=").append(object);
        sb.append('}');
        return sb.toString();
    }
}
