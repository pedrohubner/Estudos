package com.semanatres.featuresnove.gaveta;

import java.io.*;
import java.util.Scanner;

public class GerenciadorDeArquivos {
    private Scanner nome = new Scanner(System.in);
    private Scanner conteudo = new Scanner(System.in);

    public Scanner getNome() {
        return nome;
    }

    public Scanner getConteudo() {
        return conteudo;
    }

    //    public void criarArquivo(){
//
//        System.out.println("Digite o nome do arquivo: ");
//        File file = new File(nome.next());
//
//            try {
//                boolean value = file.createNewFile();
//                if (value){
//                    System.out.println("Arquivo criado");
//                }else System.out.println("Arquivo já existe.");
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//    }

    public void EscreverArquivo(){

        System.out.println("Digite o conteúdo do arquivo: ");
        String data = conteudo.next();

            try {
                System.out.println("Digite o nome do arquivo: ");
                FileWriter output = new FileWriter(nome.next());

                output.write(data);

                System.out.println("Escreveram no arquivo");

                output.close();
            } catch (IOException e){
                e.printStackTrace();
            }
    }

    public void LerArquivo(){

        try (BufferedReader br = new BufferedReader(new FileReader("DOcumentos"))){
            String arquivo =  br.readLine();
            while (arquivo != null){
                System.out.println(arquivo);
                arquivo = br.readLine();
            }
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
