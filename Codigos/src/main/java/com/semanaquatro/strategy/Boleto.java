package com.semanaquatro.strategy;

public class Boleto extends Opcoes {

    private long codigo;
    private String data;

    Boleto(double valor, String destinatario, long codigo, String data) {
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
