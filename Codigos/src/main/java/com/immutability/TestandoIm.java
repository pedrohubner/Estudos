package com.immutability;

public class TestandoIm {
    public static void main(String[] args) {

        JavaImmutable imm1 = new JavaImmutable("PNH", 18);

        JavaImutavel im1 = new JavaImutavel("SMH", 35);

        System.out.println(im1.getAge());

        System.out.println(imm1);

    }
}
