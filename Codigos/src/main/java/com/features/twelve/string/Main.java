package com.features.twelve.string;

public class Main {
    public static void main(String[] args) {

        String str = "*****\n  Opa\n  \tHello World\rTranquilaço?\n*****";

        System.out.println(str.indent(0));
        System.out.println(str.indent(3));
        System.out.println(str.indent(-3));
    }
}
