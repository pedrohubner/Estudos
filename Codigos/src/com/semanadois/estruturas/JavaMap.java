package com.semanadois.estruturas;

import java.util.*;

public class JavaMap {
    public static void main(String[] args) throws NullPointerException{

        System.out.println("\nLista TreeMap");
        Map<String, String> map = new TreeMap<>();

        map.put("beta", "bu");
        map.put("teste", "teste");
        map.put("Alfa", "au");
        map.put("Omega","ou");

        System.out.println(map);

        //não imprime esses dois pois eles não foram add
        //em nenhum map
        try {
            System.out.println(map.get(map));
            System.out.println(map.get("outra coisa"));
        }catch (NullPointerException e){
            System.out.println("Não foi possível imprimir esta lista");
        } catch (ClassCastException e){
            System.out.println("Não foi possível imprimir esta lista");
        }

        Map<String, String> map2 = new HashMap<>();

        map2.put("beta", "bu");
        map2.put(null, "hey");
        map2.put(null, null);
        map2.put("Alfa", null);
        map2.put("Omega","ou");

        System.out.println("\nLista HashMap");

        System.out.println(map2);

        //não imprime esses dois pois eles não foram add
        //em nenhum map
        try {
            System.out.println(map2.get(null));
            System.out.println(map2.get("outra coisa"));
        }catch (NullPointerException e){
            System.out.println("Não foi possível imprimir esta lista");
        }

        Map<String, String> map3 = new LinkedHashMap<>();

        map3.put("beta", "bu");
        map3.put("pieta", null);
        map3.put("teste", null);
        map3.put(null, "au");
        map3.put(null,"ou");

        System.out.println("\nLista HashMap");

        System.out.println(map3);

        //
        try {
            System.out.println(map3.get(null));
            System.out.println(map3.get("outra coisa"));
        }catch (NullPointerException e){
            System.out.println("Não foi possível imprimir esta lista");
        }

    }
}
