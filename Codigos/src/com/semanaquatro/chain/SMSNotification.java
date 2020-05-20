package com.semanaquatro.chain;

public class SMSNotification extends HandlerNotificacao {

    SMSNotification(HandlerNotificacao msg) {
        super(msg);
    }

    @Override
    protected String escolher(Request pedido) {
        if (pedido.getTipoMensagem().equals("Sms"))
            return "Notificação sms";
        else
            return proximo(pedido);
    }
}
