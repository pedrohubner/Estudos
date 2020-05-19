package com.semanaquatro.strategy;

public class Pagamento {
    public static void main(String[] args) {

        Opcoes pagamento1 = new CartaoCredito(48., "Panvel", 12, 5642817,
                "MasterCard");
        pagamento1.notaFiscal();

        System.out.println();

        Opcoes pagamento2 = new Boleto(15.5, "Panvel", 6482134855L, "06/11/19");
        pagamento2.notaFiscal();

    }
}
