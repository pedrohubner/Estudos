package com.semanadois;
import java.util.*;

public class Cidadao {
    public static void main(String[] args) {

        Set <Paciente> paciente = new HashSet<>();
        Map <String, Aluno> aluno = new HashMap<>();
        Stack <String> oi = new Stack<>();

        oi.push("Hello");
        oi.push("Hi");

        System.out.println(oi);

        oi.peek();

        System.out.println(oi);

        oi.pop();

        System.out.println(oi);

        /**
         Set/HashSet - cli
         Set possui um padrão pré-ordenado, assim não é possível usar sort
         Também não tem como achar um elemento da lista pelo índice
         */
        Paciente paciente1 = new Paciente("Luana", 18, "20/11/01", 1.84, 67.5,
                'F', "Dom Casmurro", "A-", '+');

        Paciente paciente2 = new Paciente("João", 9, "06/07/10", 1.50, 52.2,
                'M', "Dom Casmurro", "O-", '-');

        Paciente paciente3 = new Paciente("Vanessa", 42, "06/11/76", 1.58,
                62.2, 'F', "Dom Casmurro", "AB", '+' );

        paciente.add(paciente1);
        paciente.add(paciente2);
        paciente.add(paciente3);

        System.out.println("\n=====Hospital Dom João Becker=====\n" + "Três pacientes (" + paciente1.getNome() + ", " +
                paciente2.getNome() + " e " + paciente3.getNome() + ") fizeram teste para o novo Coronavírus.\n" +
                "O resultado foi o seguinte:");

        for (Paciente pacientes : paciente){
            System.out.println(pacientes);
        }

        System.out.println("\n");

        /**
         Map/HashMap - aluno
         Map são estruturas de dados que trabalham com chaves e valores <keys, values>
         Estas podendo ser de qualquer tipo de dados, e colocando a chave de certo tipo, ele entrega um valor
         de acordo com aquele mesmo tipo
         */
        Aluno aluno1 = new Aluno(111, 8.7, 10.0, "Yasmim", 18,
                "06/06", 1.65, 60.2, 'F', "BH");

        Aluno aluno2 = new Aluno(112, 7.2, 8.0, "Lucas", 17,
                "16/05", 1.70, 67.8, 'M', "RJ");

        Aluno aluno3 = new Aluno(113, 6.2, 9.3, "Fernanda", 19,
                "10/03", 1.79, 65.3, 'F', "SP");

        Aluno aluno4 = new Aluno(111, 8.7, 10.0, "Vitória", 18,
                "23/07", 1.60, 80.6, 'F', "ES");

        aluno.put(aluno1.toString(), aluno1);
        aluno.put(aluno2.toString(), aluno2);
        aluno.put(aluno3.toString(), aluno3);
        aluno.put(aluno4.toString(), aluno4);

        System.out.println(aluno.keySet());

    }
}
