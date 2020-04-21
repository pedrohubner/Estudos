package com.semanadois.projeto;
import com.semanadois.exercicios.Mercado;

import java.util.*;

public class Aplicativo {
    public static void main(String[] args) throws StackOverflowError{
        Scanner input = new Scanner(System.in);

        List <Farmacia> produtos = new ArrayList<>();
        Set <Cliente> clientes = new HashSet<>();
        Map <Cliente, Farmacia> compra = new HashMap<>();
        Queue <Mensagem> msg = new LinkedList<>();

        Farmacia produto11 = new Farmacia("Dorflex", 1.5);
        Farmacia produto12 = new Farmacia("Dipirona", 5.00);
        Farmacia produto13 = new Farmacia("Eno", 3.00);

        produtos.add(produto11);
        produtos.add(produto12);
        produtos.add(produto13);

        Cliente cli1 = new Cliente("Marcos", 60.8);
        Cliente cli2 = new Cliente("Karina", 86.0);
        Cliente cli3 = new Cliente("Luana", 75.0);

        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);

        Mensagem msg1 = new Mensagem("Bom dia! Confira os descontos do Dorflex para o dia de hoje!");
        Mensagem msg2 = new Mensagem("\nBoa tarde! No dia 26/04 estaremos distribuindo máscaras na filial 48.");

        msg.add(msg1);
        msg.add(msg2);

        msg.remove();

        System.out.println("\n===== Aplicativo Farmácia =====\n\nEscolhe uma das opções:\n 1 - Exibir lista " +
                "de produtos e seus valores\n 2 - Exibir dados do usuário\n 3 - Exibir avisos");

        System.out.println("\nSelecione:");
        int escolha = input.nextInt();

        switch (escolha){
            case 1:
                System.out.println(produtos);
                break;

            case 2:
                System.out.println(cli2);
                break;

            case 3:
                System.out.println(msg);
                break;

            default:
                System.out.println("Não foi possível executar operação");
                break;
        }

        /**
         *Try/Catch para implementar método comprarProduto
         * erro de loop do valor e também exception não tratada
         * o método não está acessando o valor do produto instanciado
         * por isso não executado uma subtração corretamente
         */
//        System.out.println(cli3.getQntdDinheiro());
//
//        try {
//            System.out.println(cli3.comprarProduto(produto12.getPreco()));
//        }catch (Exception e){
//            System.out.println("Não foi possível concluir a compra.");
//        }
//
//        System.out.println(cli3.getQntdDinheiro());

    }
}
