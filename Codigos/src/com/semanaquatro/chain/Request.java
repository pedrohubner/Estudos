package com.semanaquatro.chain;

public class Request {

    private String tipoMensagem;

    Request(String tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    String getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(String tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }
}
