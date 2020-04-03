package com.semanadois;
import java.util.HashMap;

public class Cidadao {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        Paciente pessoa1 = new Paciente("Carla", 18, "15/04/01", 1.67, 65.5,
                'F', "Nova York", 'O', '-');

        System.out.println("Olá! Me chamo " + pessoa1.getNome() + ", tenho " + pessoa1.getIdade() + " anos. Nasci no" +
                " dia " + pessoa1.getDataNascimento() + ", e tenho " + pessoa1.getAltura() + " de altura.");

        pessoa1.fazerAniversario();
        pessoa1.fazerAniversario();

        System.out.println("Olá! Me chamo " + pessoa1.getNome() +   ", tenho " + pessoa1.getIdade() + " anos. Nasci no" +
                " dia " + pessoa1.getDataNascimento() + ", e tenho " + pessoa1.getAltura() + " de altura.");

        capitalCities.put("15/04/01 ", " Carla");
        System.out.println(capitalCities);
    }
}
