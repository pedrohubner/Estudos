package com.semanadois;
import java.util.*;

public class Cidadao {
    public static void main(String[] args) {

        //Fazer mapa de clientes e seus produtos (chave?, valor?)
        //Map <Mercado, Cliente> compra = new HashMap<>();
        //Fazer classe de classe mercado e depois instanciar um objeto produto para usar na Stack
        Stack <Mercado> produto = new Stack<>();
        //Fazer uma classe para clientes, que servirá para o queue (first in, first out)
        Queue <Cliente> fila = new LinkedList<>();

        //Stack para uma lista de produtos que vão ser
        Mercado produto1 = new Mercado("Sabonete", 4.50, 5, 111);
        Mercado produto2 = new Mercado("Shampoo", 10.00, 1, 222);
        Mercado produto3 = new Mercado("Desodorante", 7.99, 2, 333);
        Mercado produto4 = new Mercado("Pão", 3.99, 2, 444);

        produto.push(produto1);
        produto.push(produto2);
        produto.push(produto3);
        produto.push(produto4);

        System.out.println(produto);

        //imprimindo o produto que está no topo
        System.out.println(produto.peek());

        //verificando se a lista de produtos está vazia
        System.out.println(produto.empty());

        //retirando o produto no topo
        produto.pop();

        System.out.println(produto);

        //Queue para fila de clientes
        Cliente cliente1 = new Cliente("Matthew");
        Cliente cliente2 = new Cliente("Karen");
        Cliente cliente3 = new Cliente("Franklin");
        Cliente cliente4 = new Cliente("Wilson");

        fila.add(cliente1);
        fila.add(cliente2);
        fila.add(cliente3);
        fila.add(cliente4);

        System.out.println("\n");

        System.out.println(fila);

        System.out.println(fila.peek());

        System.out.println(fila.size());

        fila.poll();

        System.out.println(fila);

        fila.poll();

        System.out.println(fila);

        /**
         Set/HashSet - cli
         Set possui um padrão pré-ordenado, assim não é possível usar sort
         Também não tem como achar um elemento da lista pelo índice
         */
        /**
         * Tentar fazer uma lista imprimindo os produtos que foram comprados e por qual cliente
         * Set <Mercado> produto = new HashSet<>()
         */
//        Produto produto1 = new Produto("Luana", 18, "20/11/01", 1.84, 67.5,
//                'F', "Dom Casmurro", "A-", '+');
//
//        Produto produto2 = new Produto("João", 9, "06/07/10", 1.50, 52.2,
//                'M', "Dom Casmurro", "O-", '-');
//
//        Produto produto3 = new Produto("Vanessa", 42, "06/11/76", 1.58,
//                62.2, 'F', "Dom Casmurro", "AB", '+' );
//
//        produto.add(produto1);
//        produto.add(produto2);
//        produto.add(produto3);
//
//        System.out.println("\n=====Hospital Dom João Becker=====\n" + "Três pacientes (" + produto1.getNome() + ", " +
//                produto2.getNome() + " e " + produto3.getNome() + ") fizeram teste para o novo Coronavírus.\n" +
//                "O resultado foi o seguinte:");
//
//        for (Produto pacientes : produto){
//            System.out.println(pacientes);
//        }
//
//        System.out.println("\n");
//
//        /**
//         Map/HashMap - aluno
//         Map são estruturas de dados que trabalham com chaves e valores <keys, values>
//         Estas podendo ser de qualquer tipo de dados, e colocando a chave de certo tipo, ele entrega um valor
//         de acordo com aquele mesmo tipo
//         */
//        Aluno aluno1 = new Aluno(111, 8.7, 10.0, "Yasmim", 18,
//                "06/06", 1.65, 60.2, 'F', "BH");
//
//        Aluno aluno2 = new Aluno(112, 7.2, 8.0, "Lucas", 17,
//                "16/05", 1.70, 67.8, 'M', "RJ");
//
//        Aluno aluno3 = new Aluno(113, 6.2, 9.3, "Fernanda", 19,
//                "10/03", 1.79, 65.3, 'F', "SP");
//
//        Aluno aluno4 = new Aluno(111, 8.7, 10.0, "Vitória", 18,
//                "23/07", 1.60, 80.6, 'F', "ES");
//
//        aluno.put(aluno1.toString(), aluno1);
//        aluno.put(aluno2.toString(), aluno2);
//        aluno.put(aluno3.toString(), aluno3);
//        aluno.put(aluno4.toString(), aluno4);
//
//        System.out.println(aluno.keySet());

    }
}
