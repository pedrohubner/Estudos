package com.semanatres.featuresnove.Arquivo;

import java.io.*;

public class NewFile {
    public static void main(String[] args) {

        File file = new File("arq.txt");

        //Criando arquivo
        try {
            boolean value = file.createNewFile();
            if (value){
                System.out.println("Arquivo criado");
            }else System.out.println("Arquivo já existe.");
        }catch (IOException e){
        }

        String data = "Conteúdo arquivo";

        //Escrevendo no arquivo
        try {
            FileWriter output = new FileWriter("arq.txt");

            output.write(data);

            System.out.println("Escreveram no arquivo");

            output.close();
        } catch (IOException e){}

        char[] array = new char[16];

        //Lendo arquivo
        try {
            FileReader input = new FileReader("arq.txt");

            input.read(array);
//            System.out.println("\narq.txt: ");
//            System.out.println(array);

        }catch (IOException e){}

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
