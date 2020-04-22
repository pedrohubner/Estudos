package com.semanadois.teste;

import java.util.*;

public class AplicativoTele {
    public static void main(String[] args) throws StackOverflowError{
        Scanner input = new Scanner(System.in);

        List <Farmacia> produtos = new ArrayList<>();
        Set <Cliente> clientes = new HashSet<>();
        Map <Cliente, Farmacia> compra = new HashMap<>();
        Queue <Mensagem> msg = new LinkedList<>();
        Stack <Mensagem> aviso = new Stack<>();

        Farmacia produto11 = new Farmacia("Dorflex", 1.5);
        Farmacia produto12 = new Farmacia("Dipirona", 5.00);
        Farmacia produto13 = new Farmacia("Eno", 3.00);

        produtos.add(produto11);
        produtos.add(produto12);
        produtos.add(produto13);

        Cliente cli1 = new Cliente("Marcos", "PoA", "897.651.243-08", "Débito",
                72.4);

        clientes.add(cli1);

        compra.put(cli1, produto13);

        Mensagem msg1 = new Mensagem("Bom dia! Confira os descontos do Dorflex para o dia de hoje!");
        Mensagem msg2 = new Mensagem("\nNova atualização do app!");

        msg.add(msg1);
        msg.add(msg2);

        Mensagem aviso1 = new Mensagem("Seu pedido está a caminho!\nCliente: " + cli1.getNome() + "\nProduto: " +
                produto13.getNomeProduto() + " - R$" + produto13.getPreco() + "\nForma de pagamento: " +
                cli1.getFormaPagamento());

        aviso.push(aviso1);

        System.out.println("\n===== Aplicativo Farmácia =====\n\nEscolhe uma das opções:\n 1 - Exibir lista " +
                "de pedidos\n 2 - Exibir lista de produtos\n 3 - Exibir lista de clientes\n " +
                "4 - Exibir lista de compras\n 5 - Exibir avisos");

        System.out.println("\nSelecione:");
        int escolha = input.nextInt();

        switch (escolha){
            case 1:
                System.out.println(aviso);
                break;

            case 2:
                System.out.println(produtos);
                break;

            case 3:
                System.out.println(clientes);
                break;

            case 4:
                System.out.println(compra);
                break;

            case 5:
                System.out.println(msg);
                break;

            default:
                System.out.println("Não foi possível executar operação");
                break;
        }

//        System.out.println(cli1.getQntdDinheiro());
//
//        try {
//            System.out.println(cli1.comprarProduto(produto12.getPreco()));
//        }catch (Exception e){
//            System.out.println("Não foi possível concluir a compra.");
//        }
//
//        System.out.println(cli1.getQntdDinheiro());
//
    }
}
