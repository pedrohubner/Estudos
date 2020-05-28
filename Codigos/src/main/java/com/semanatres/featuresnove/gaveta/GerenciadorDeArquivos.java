package com.semanatres.featuresnove.gaveta;

import java.io.*;
import java.util.Scanner;

public class GerenciadorDeArquivos {
    private Scanner nome = new Scanner(System.in);

    public Scanner getNome() {
        return nome;
    }

    public void setNome(Scanner nome) {
        this.nome = nome;
    }

    public String criarArquivo(String nomeArquivo) {
        try {
            File file = new File(nomeArquivo);
            boolean value = file.createNewFile();
            if (value)
                return "Arquivo criado";
            else
                return "Arquivo já existe.";

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Ocorreu um erro na criação do arquivo");
        }
    }

    public void escreverArquivo(String nomeArquivo) {

        System.out.println("Digite o conteúdo do arquivo: ");
        String data = nome.next();

        try {
            System.out.println("Digite o nome do arquivo: ");
            FileWriter output = new FileWriter(criarArquivo(nomeArquivo));

            output.write(data);

            System.out.println("Escreveram no arquivo");

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lerArquivo(String nomeArquivo) throws IOException{

        File file = new File(criarArquivo(nomeArquivo));
        BufferedReader br = new BufferedReader(new FileReader(file));

        try (br) {
            String arquivo = br.readLine();
            while (arquivo != null) {
                System.out.println(arquivo);
                arquivo = br.readLine();
            }
        }
    }
}
