package com.playground.cadastro;

public class MensagensDaTela {

    static void mensagemInicial() {
        System.out.println("===Cadastro cidade e estudante===\n 1 - " +
                "Cadastro cidade e estudante;" + "\n 0 - Encerrar operação.");
    }

    static void mensagemNovoCadastro() {
        System.out.println("\nDeseja cadastrar outra cidade e outros estudantes?"
                + "\nSim - 1;\nNão - 0.\nDigite a opção desejada:");
    }

    static void exibirDadosCadastro(Cidades cidade, Estudantes estudante) {
        System.out.println("Cidade: " + cidade.getDescricao() + "\nEstudante: " + estudante.getNome() +
                "\nMatrícula: " + estudante.getCodigoAluno() + "\nEmail: " + estudante.getEmail());
    }

    static void atualizarDados(String nome) {
        System.out.println("\n" + nome + ", deseja atualizar algum dado?\nSim - 1\nNão - 0");
        System.out.println("\nSelecione a opção desejada");
    }

    static void selecionarDadoAlteracao() {
        System.out.println("Seleciona o dado que você deseja alterar:\n 1 - nome;" +
                "\n 2 - email;\n 3 - senha.");
    }

    static void selecionarOpcaoIndisponivel() {
        System.out.println("Opção não disponível\n");
    }

    static void terminarOperacao() {
        System.out.println("Operação encerrada");
    }
}
