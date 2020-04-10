package com.semanadois;
import java.util.*;

public class Cidadao {
    public static void main(String[] args) {

        ArrayList <Paciente> paciente = new ArrayList<>();
        Set <Aluno> aluno = new HashSet();
        Stack <String> oi = new Stack<>();

        oi.push("Hello");
        oi.push("Hi");

        System.out.println(oi);

        oi.peek();

        System.out.println(oi);

        oi.pop();

        System.out.println(oi);

        /**
        ArrayList - paciente
        Possui método para organização (alfabética, númerica, etc.) = sort
        É possível ser encontrado pelo índice (posição na matriz)
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

        Collections.sort(paciente);

        System.out.println("\n=====Hospital Dom João Becker=====\n" + "Três pacientes (" + paciente1.getNome() + ", " +
                paciente2.getNome() + " e " + paciente3.getNome() + ") fizeram teste para o novo Coronavírus.\n" +
                "O resultado foi o seguinte:");

        //Imprimindo um elemento da ArrayList através do índice
        System.out.println(paciente.get(0));

        for (Paciente pacientes : paciente){
            System.out.println(pacientes);
        }

        System.out.println("\n");

        /**
        Set/HashSet - cli
        Set possui um padrão pré-ordenado, assim não é possível usar sort
        Também não tem como achar um elemento da lista pelo índice
         */

        Aluno aluno1 = new Aluno(111, 8.7, 10.0, "Yasmim", 18,
                "06/06", 1.65, 60.2, 'F', "BH");
        Aluno aluno2 = new Aluno(112, 7.2, 8.0, "Lucas", 17,
                "16/05", 1.70, 67.8, 'M', "RJ");
        Aluno aluno3 = new Aluno(113, 6.2, 9.3, "Fernanda", 19,
                "10/03", 1.79, 65.3, 'F', "SP");
        Aluno aluno4 = new Aluno(111, 8.7, 10.0, "Vitória", 18,
                "23/07", 1.60, 80.6, 'F', "ES");

        aluno.add(aluno1);
        aluno.add(aluno2);
        aluno.add(aluno3);
        aluno.add(aluno4);
        aluno.add(aluno4);

        for (Object Aluno : aluno){
            System.out.println(Aluno);
        }
    }
}
