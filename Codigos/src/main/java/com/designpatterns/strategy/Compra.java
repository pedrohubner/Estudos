package com.designpatterns.strategy;

import java.util.Scanner;

public class Compra {

    private static String compraPorCartao() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os dados do cartão: ");

        System.out.println("Valor: ");
        double valor = input.nextDouble();
        System.out.println("Destinatário: ");
        String destinatario = input.next();
        System.out.println("Parcelas: ");
        int parcelas = input.nextInt();
        System.out.println("Número cartão: ");
        int numeroCartao = input.nextInt();
        System.out.println("Bandeira: ");
        String bandeira = input.next();

        Contexto pagamento1 = new Contexto(new CartaoCredito(valor, destinatario, parcelas, numeroCartao, bandeira));

        return pagamento1.selecionarOpcao();
    }

    private static String compraPorBoleto() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os dados do boleto: ");

        System.out.println("Valor: ");
        double valor = input.nextDouble();
        System.out.println("Destinatário: ");
        String destinatario = input.next();
        System.out.println("Código boleto: ");
        long codigos = input.nextLong();
        System.out.println("Validade: ");
        String validade = input.next();

        Contexto pagamento2 = new Contexto(new Boleto(valor, destinatario, codigos, validade));

        return pagamento2.selecionarOpcao();
    }

    public static void main(String[] args) {

        System.out.println(compraPorCartao());
    }
}
