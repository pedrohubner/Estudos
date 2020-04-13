package com.semanadois;

public class Carrinho extends  Mercado{
    private boolean carrinho;

    public Carrinho(boolean carrinho, String produto, double valor, int qntd, int codigo){
        super(produto, valor, qntd, codigo);
        this.carrinho = carrinho;
    }

    public boolean getCarrinho(){
        return carrinho;
    }

    public void setCarrinho(boolean carrinho){
        this.carrinho = carrinho;
    }

    public void pegarCarrinho(boolean carrinho){
        if (carrinho = true){
            System.out.println("Peguei um carrinho");
        }
    }

    @Override
    public void pegarProduto() {
        //super.pegarProduto();
        if (Mercado.qntd > 0){
            --Mercado.qntd;
        }
    }
}
