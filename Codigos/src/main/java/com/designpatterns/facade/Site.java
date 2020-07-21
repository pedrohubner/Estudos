package com.designpatterns.facade;

public class Site {

    private Client client;
    private Product product;

    public Site() {
        client = new Client("Pedro", "Hübner", "20/11/2001", 1234567890L);
        product = new Product("Paracetamol", 7.9);
    }

    public String exibirPerfil(){
        return client.perfilCliente();
    }

    public String exibirListProdutos(){
        return product.listaProdutos();
    }
}
