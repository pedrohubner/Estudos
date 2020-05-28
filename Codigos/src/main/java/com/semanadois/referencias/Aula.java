package com.semanadois.referencias;

public class Aula {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Luana", "lusilva@yahoo.com.br", 21, 192786);
        Aluno a2 = new Aluno("Rodrigo", "rodri@outlook.com", 19, 623487);
        Aluno a3 = new Aluno("Mathias", "mat@gmail.com", 20, 678524);

        //Acessando valor
        alterarEmail(a3);

        System.out.println("\n" + a3.getNome() + " alterou seu email para " + a3.getEmail());

        //Acessando referência
        exibirCarteiraEstudante(a1);

        System.out.println("Documento de " + a1.getNome() + ": " + a1.getId());

    }

    //Passando parâmetro de referência email
    public static void alterarEmail(Aluno a3){
        a3.setEmail("mathiaspereira@gmail.com");
    }

    //Passando parâmetro de referência id
    public static void exibirCarteiraEstudante(Aluno a1){
        a1.getId();
    }
}