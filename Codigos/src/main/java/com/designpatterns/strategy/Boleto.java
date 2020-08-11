package com.designpatterns.strategy;

public class Boleto extends Opcoes {

    private Long codigo;
    private String data;

    Boleto(Double valor, String destinatario, Long codigo, String data) {
        super(valor, destinatario);
        this.codigo = codigo;
        this.data = data;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    @Override
    protected String notaFiscal() {
        return "====Boleto===="
                + "\nCódigo: " + codigo
                + "\n" + super.notaFiscal()
                + "\nData: " + data;
    }
}
