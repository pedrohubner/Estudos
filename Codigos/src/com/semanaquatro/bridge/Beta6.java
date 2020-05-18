package com.semanaquatro.bridge;

import com.semanaquatro.bridge.comercio.Console;
import com.semanaquatro.bridge.comercio.Ps5;
import com.semanaquatro.bridge.comercio.Xseries;
import com.semanaquatro.bridge.fabricacao.Lancamento;
import com.semanaquatro.bridge.fabricacao.Producao;

public class Beta6 {
    public static void main(String[] args) {

        Console console1 = new Ps5(new Producao(), new Lancamento());
        System.out.println(console1.vender());

        Console console2 = new Xseries(new Producao(), new Lancamento());
        System.out.println(console2.vender());

    }
}
