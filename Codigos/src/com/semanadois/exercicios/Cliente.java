package com.semanadois;

public class Cliente implements Runnable{
    private String nome;
    private double qntdDinheiro;
    private boolean entrar;
    Mercado mercado;

    public Cliente(String nome, double qntdDinheiro, boolean entrar){
        this.nome = nome;
        this.qntdDinheiro = qntdDinheiro;
        this.entrar = entrar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQntdDinheiro() {
        return qntdDinheiro;
    }

    public void setQntdDinheiro(double qntdDinheiro) {
        this.qntdDinheiro = qntdDinheiro;
    }

    public boolean isEntrar() {
        return entrar;
    }

    public void setEntrar(boolean entrar) {
        this.entrar = entrar;
    }

    public void entrarNoMercado(){
        if (entrar = true){
            System.out.println(nome + " entrou no mercado e está indo pegar seus produtos.");
        } else if (entrar = false){
            System.out.println(nome + " já terminou suas compras e está indo embora.");
        }
    }

//    public void comprarProduto(double qntdDinheiro) {
//        if (this.qntdDinheiro < mercado.getValor()){
//            IndexOutOfBoundsException e;
//        } else {
//            System.out.println(qntdDinheiro - mercado.getValor());
//        }
//    }

    @Override
    public void run() throws NullPointerException{
        if (this.qntdDinheiro < mercado.getValor()){
            IndexOutOfBoundsException e;
        } else {
            System.out.println(qntdDinheiro - mercado.getValor());
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
