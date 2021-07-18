package com.bootcampeveris;

public class No<T> {

    private T conteudo;
    private No<T> proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public No(T conteudo, No<T> proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("No{");
        sb.append("conteudo=").append(conteudo);
        sb.append('}');
        return sb.toString();
    }

    public String toStringEncadeado() {
        final StringBuilder sb = new StringBuilder("No{");
        sb.append("conteudo=").append(conteudo);
        sb.append('}');

        if(proximoNo != null) {
            sb.append(" -> ").append(proximoNo.toString());
        } else
            sb.append(" -> null");
    }
}
