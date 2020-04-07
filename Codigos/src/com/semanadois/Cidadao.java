package com.semanadois;
import java.util.*;

public class Cidadao {
    public static void main(String[] args) {
        ArrayList <Paciente> paciente = new ArrayList<>();
        Set /*<Pessoa>*/ cli = new HashSet();
        /*
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

        System.out.println("=====Hospital Dom João Becker=====\n" + "Três pacientes (" + paciente1.getNome() + ", " +
                paciente2.getNome() + " e " + paciente3.getNome() + ") fizeram teste para o novo Coronavírus.\n" +
                "O resultado foi o seguinte:");

        //Imprimindo um elemento da ArrayList através do índice
        System.out.println(paciente.get(0));

        for (Paciente pacientes : paciente){
            System.out.println(pacientes);
        }

        /*
        Set/HashSet - cli
        Set possui um padrão pré-ordenado, assim não é possível usar sort
        Também não tem como achar um elemento da lista pelo índice
         */
        Pessoa p1 = new Pessoa("Yasmim", 18, "06/06", 1.65, 60.2, 'F',
                "BH");
        Pessoa p2 = new Pessoa("Joana", 22, "04/01", 1.58, 52.1, 'F',
                "PoA");
        Pessoa p3 = new Pessoa("Pedro", 31, "28/03", 1.97, 69.7, 'M',
                "NY");
        Pessoa p4 = new Pessoa("Mathias", 25, "11/07", 1.88, 93.5, 'M',
                "G");

        cli.add(p1);
        cli.add(p2);
        cli.add(p3);
        cli.add(p4);

        System.out.println("\n" + cli.size());

        for (Object pessoa : cli){
            System.out.println(pessoa);
        }
    }
}
