package com.semanatres.featuresnove.Arquivo;

import java.io.*;

public class NewFile {
    public static void main(String[] args) {

        //Criando arquivo
        File file = new File("arq.txt");

        try {
            boolean value = file.createNewFile();
            if (value){
                System.out.println("Arquivo criado");
            }else System.out.println("Arquivo já existe.");
        }catch (IOException e){
        }

        //Escrevendo no arquivo
        String data = "Conteúdo arquivo";

        try {
            FileWriter output = new FileWriter("arq.txt");

            output.write(data);

            System.out.println("Escreveram no arquivo");

            output.close();
        } catch (IOException e){}

        //Lendo arquivo
        char[] array = new char[16];

        try (BufferedReader br = new BufferedReader(new FileReader("arq.txt"))){
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
