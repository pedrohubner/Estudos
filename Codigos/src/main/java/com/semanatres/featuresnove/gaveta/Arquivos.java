package com.semanatres.featuresnove.gaveta;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Arquivos {
    public static void main(String[] args) throws IOException {

        Map <String, String> lista = Map.of("Banana", "Limão");
        List <String> lista2 = List.of("Jaqueta", "Camiseta", "Calça");
        Set <String> lista3 = Set.of("Meia", "Tênis");

        for (String f : lista2){
            System.out.println(f);
        }

        GerenciadorDeArquivos g1 = new GerenciadorDeArquivos();

        g1.escreverArquivo("novoArquivo.txt");

        g1.lerArquivo("novoArquivo.txt");
    }
}
