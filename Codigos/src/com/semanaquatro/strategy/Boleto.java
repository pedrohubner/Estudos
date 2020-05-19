package com.semanaquatro.strategy;

public class Hotel extends Opcoes {

    public Hotel(boolean arCondicionado, boolean estacionamento, boolean camaCasal, boolean internet, int custo){
        super(arCondicionado, estacionamento, camaCasal, internet, custo);
    }

    @Override
    public void terArCondicionado() {
        if (isArCondicionado()){
            System.out.println("Este quarto tem ar-condicionado");
        }else System.out.println("Este quarto não tem ar-condicionado");
    }

    @Override
    public void terCamaCasal() {
        if (isCamaCasal()){
            System.out.println("Este quarto tem cama de casal");
        }else System.out.println("Este quarto tem cama de solteiro");
    }

    @Override
    public void terEstacionamento() {
        if (isEstacionamento()){
            System.out.println("Tem estacionamento");
        } else System.out.println("Não tem estacionamento");
    }

    @Override
    public void terInternet() {
        if (isInternet()){
            System.out.println("Tem internet");
        }else System.out.println("Não tem internet");
    }
}
