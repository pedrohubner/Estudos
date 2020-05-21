package com.semanaquatro.chain;

public class EmailNotification extends HandlerNotificacao {

    EmailNotification(HandlerNotificacao msg) {
        super(msg);
    }

    @Override
    protected String escolher(Request pedido) {
        if (pedido.getTipoMensagem().equals("Email"))
            return "Notificação via email";
        else
            return proximo(pedido);
    }
}
