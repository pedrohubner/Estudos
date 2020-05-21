package com.semanaquatro.chain;

public class Request {

    private String tipoMensagem;

    public Request(String tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public String getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(String tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }
}
