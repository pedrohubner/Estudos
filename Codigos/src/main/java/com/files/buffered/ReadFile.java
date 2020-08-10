package com.files.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("testFile.txt"))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
        }
    }
}
