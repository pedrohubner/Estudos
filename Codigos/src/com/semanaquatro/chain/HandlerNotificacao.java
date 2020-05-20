package com.semanaquatro.chain;

public abstract class HandlerNotificacao {

    protected HandlerNotificacao novaNotificacao;

    public HandlerNotificacao(HandlerNotificacao novaNotificacao) {
        this.novaNotificacao = novaNotificacao;
    }

    protected abstract String escolher(Request pedido);

    public String proximo(Request pedido){
        return novaNotificacao.escolher(pedido);
    }
}
