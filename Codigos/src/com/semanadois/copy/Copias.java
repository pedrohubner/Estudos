package com.semanadois.copy;

public class Copias {
    public static void main(String[] args) throws CloneNotSupportedException{

        Revista revista1 = new Revista("Amazing Fantasy ", "#15", 21, 150.9, true);
        Revista revista2 = new Revista("Detective Comics ", "#27", 23, 498.9, true);
        Revista revista3 = new Revista("Nightwing ", "#152", 32, 10.9, false);

        Revista revista4 = (Revista) revista2.clone();

        System.out.println(revista4);

        revista4.setName("Action Comics ");
        revista4.setEdicao("#12");
        revista4.setQntdPags(36);
        revista4.setPreco(190.6);

        System.out.println(revista4);

        /**
         * SHALLOW COPY
         */



        /**
         * DEEP COPY
         */


    }
}
