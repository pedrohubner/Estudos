package com.semanadois.projeto;
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
        Cliente cli2 = new Cliente("Karina", "Eldorado", "098.765.432-10",
                "Crédito", 85.9);
        Cliente cli3 = new Cliente("Luana", "Gtí", "012.345.678-90", "Débito",
                50.6);

        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);

        compra.put(cli1, produto13);
        compra.put(cli2, produto11);

        Mensagem msg1 = new Mensagem("Bom dia! Confira os descontos do Dorflex para o dia de hoje!");
        Mensagem msg2 = new Mensagem("Nova atualização do app!");

        msg.add(msg1);
        msg.add(msg2);

        Mensagem aviso1 = new Mensagem("Novo Pedido!\nCliente: " + cli1.getNome() + "\nProduto: " +
                produto13.getPreco() + " - R$" + produto13.getPreco() + "\nForma de pagamento: " +
                cli1.getFormaPagamento());
        Mensagem aviso2 = new Mensagem("\nNovo Pedido!\nCliente: " + cli2.getNome() + "\nProduto: " +
                produto11.getPreco() + " - R$" + produto11.getPreco() + "\nForma de pagamento: " +
                cli2.getFormaPagamento());

        aviso.push(aviso1);
        aviso.push(aviso2);

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
