package com.designpatterns.bridge;

import com.designpatterns.bridge.abstraction.Console;
import com.designpatterns.bridge.abstraction.Ps5;
import com.designpatterns.bridge.abstraction.Xseries;
import com.designpatterns.bridge.implementation.Lancamento;
import com.designpatterns.bridge.implementation.Producao;

public class StatusConsole {
    public static void main(String[] args) {

        Console console1 = new Ps5(new Producao(), new Lancamento());
        System.out.println(console1.vender());

        Console console2 = new Xseries(new Producao(), new Lancamento());
        System.out.println(console2.vender());

    }
}
