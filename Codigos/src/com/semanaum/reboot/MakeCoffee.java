package com.semanaum.reboot;

public class beta9 {
    public static void main(String[] args) {

        Coffee novoCafe = new CafeAdocante(false, 2);

        System.out.println(novoCafe.fazerCafe(5, 0.8));
    }
}
