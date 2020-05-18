package com.semanaquatro.strategy;

import com.semanaquatro.strategy.racas.Cachorro;
import com.semanaquatro.strategy.racas.Labrador;
import com.semanaquatro.strategy.racas.PastorAlemao;

public class Beta8 {
    public static void main(String[] args) {

        Cachorro dog1 = new PastorAlemao("Astor");

        System.out.println("\n" + dog1.doEat());

        System.out.println(dog1.doBark());

        Cachorro dog2 = new Labrador("Black");

        System.out.println("\n" + dog2.doBark());

        System.out.println(dog2.doEat());

    }
}
