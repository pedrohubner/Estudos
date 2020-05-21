package com.semanaquatro.chain;

public class TeamsNotification extends HandlerNotificacao {

    TeamsNotification(HandlerNotificacao msg) {
        super(msg);
    }

    @Override
    protected String escolher(Request pedido) {
        if (pedido.getTipoMensagem().equals("Teams"))
            return "Notificação via Teams";
        else
            return proximo(pedido);
    }
}
