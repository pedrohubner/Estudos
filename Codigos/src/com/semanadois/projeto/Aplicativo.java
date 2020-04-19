package com.semanadois.projeto;
import java.util.*;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List <Farmacia> produtos = new ArrayList<>();
        Set <Cliente> clientes = new HashSet<>();
        Map <Cliente, Farmacia> compra = new HashMap<>();

        Farmacia produto11 = new Farmacia("Dorflex", 7.5);
        Farmacia produto12 = new Farmacia("Dipirona", 5.00);
        Farmacia produto13 = new Farmacia("Eno", 2.00);

        produtos.add(produto11);
        produtos.add(produto12);
        produtos.add(produto13);

        Cliente cli1 = new Cliente("Marcos", 60.8);
        Cliente cli2 = new Cliente("Karina", 86.0);
        Cliente cli3 = new Cliente("Luana", 63.5);

        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);

        System.out.println("\n===== Aplicativo Farmácia =====\n\nEscolhe uma das opções:\n 1 - Exibir dados cliente;\n"+
                "2 - Exibir lista de produtos;\n 3 - Comprar produto");
        System.out.println("\nSelecione:");
        int escolha = input.nextInt();

        if (escolha == 1) {
            System.out.println(cli1);
        } else if (escolha == 2)
            System.out.println(produtos);
        else System.out.println("Não foi possível realizar operação");
    }
}
