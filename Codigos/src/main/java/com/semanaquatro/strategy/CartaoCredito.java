package com.semanaquatro.strategy;

public class CartaoCredito extends Opcoes {

    private int parcelas;
    private int numeroCartao;
    private String bandeira;

    CartaoCredito(double valor, String destinatario, int parcelas, int numeroCartao, String bandeira) {
        super(valor, destinatario);
        this.parcelas = parcelas;
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    private String quantidadeParcelas(){
        if (parcelas <= 10 && parcelas != 0)
            return "Contexto parcelado em " + parcelas + "x. Valor mensal: " + (getValor() / parcelas);
        else if (parcelas >= 11 && parcelas <= 12){
            return "Contexto parcelado em " + parcelas + "x. Valor mensal com juros: " +
                    (getValor() / parcelas + 10.0);
        }
        else
            return "Opcção não disponível";
    }

    @Override
    protected String notaFiscal() {
        return "====Cartão Crédito===="
        + "\nNúmero cartão: " + numeroCartao
        + "\nBandeira: " + bandeira
        + "\n" + super.notaFiscal()
        + "\n" + quantidadeParcelas();
    }
}
