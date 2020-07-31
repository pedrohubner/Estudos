package com.features.eleven;

public class Beta3 {
    public static void main(String[] args) {

        String endereco = " Casmurro ";

        if (endereco.isBlank()) {
            System.out.println("String está vazia");
        }
        System.out.println("String tem corpo");

        System.out.print("\nDom");
        System.out.print(endereco.strip());
        System.out.println("55");

        System.out.print("\nDom");
        System.out.print(endereco.stripTrailing());
        System.out.println("55");

        System.out.print("\nDom");
        System.out.print(endereco.stripLeading());
        System.out.println("55");

//        Path path = Files.writeString(Files.createTempFile("ppp", null),
//                "Conteúdo file" );
//        System.out.println(path);
//        String s = Files.readString(path);
//        System.out.println(s);

//        To Do:
//
//        STREAMS:
//        - stream são mutáveis? sim
//                - map() retorna mesma referência de memória do objeto usado?
//        ok - filter recebe o que como parâmetro? um predicate (interface funcional com o método test())
//
//        VAR:
//        - posso alterar o tipo de dado do var depois de criado (como o compilador reage)? não, e isso dá um erro de compilação
//        - onde que o var é alocado?
//                - se não atribuir um valor ao var dá erro (versões acima do 10)? 11 -> sim
//                - var é mais custoso que uma variável normal?
//                - depois que o var recebe um valor, o que acontece com ele?
//
//        MÉTODOS DE CRIAÇÃO DE ARQUIVOS:
//        - como era trabalhar com arquivos antes dos métodos do java 11
//
//        JAVA:
//        - os dados do java estão disposição em tempo de execução ou compilação
//                - como o compilador trabalha com o * dos pacotes
//
//        TASK NOVA
//        - features 12, 13, 14
    }
}
