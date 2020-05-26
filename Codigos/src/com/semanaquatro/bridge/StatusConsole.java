package com.semanaquatro.bridge;

import com.semanaquatro.bridge.abstraction.Console;
import com.semanaquatro.bridge.abstraction.Ps5;
import com.semanaquatro.bridge.abstraction.Xseries;
import com.semanaquatro.bridge.implementation.Lancamento;
import com.semanaquatro.bridge.implementation.Producao;

public class StatusConsole {
    public static void main(String[] args) {

        Console console1 = new Ps5(new Producao(), new Lancamento());
        System.out.println(console1.vender());

        Console console2 = new Xseries(new Producao(), new Lancamento());
        System.out.println(console2.vender());

    }
}
