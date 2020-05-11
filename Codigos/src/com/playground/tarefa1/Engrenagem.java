package com.playground.tarefa;

public class Engrenagem {

    private int h, m, s;

    public Engrenagem(){}

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public String cronometrar(){
        try {

            Thread.sleep(1000);
            s++;

            if (s >= 60) {
                s = 0;
                m++;
            }
            if (m >= 60) {
                s = m = 0;
                h++;
            }
            return String.format("%02d:%02d:%02d \n", h, m, s);

        } catch (Exception e) {
            return "Deu bad";
        }
    }
}
