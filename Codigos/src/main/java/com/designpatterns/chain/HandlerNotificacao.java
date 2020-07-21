package com.designpatterns.chain;

public abstract class HandlerNotificacao {

    private HandlerNotificacao novaNotificacao;

    HandlerNotificacao(HandlerNotificacao novaNotificacao) {
        this.novaNotificacao = novaNotificacao;
    }

    protected abstract String escolher(Request pedido);

    String proximo(Request pedido) {
        return novaNotificacao.escolher(pedido);
    }
}
