package com.semanadois.teste;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private String formaPagamento;
    private double qntdDinheiro;

    public Cliente(String nome, String endereco, String cpf, String formaPagamento, double troco){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.formaPagamento = formaPagamento;
        this.qntdDinheiro = qntdDinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getQntdDinheiro() {
        return qntdDinheiro;
    }

    public void setQntdDinheiro(double qntdDinheiro) {
        this.qntdDinheiro = qntdDinheiro;
    }

    public double comprarProduto(double qntdDinheiro){
        if (this.qntdDinheiro < Farmacia.preco){
            Exception e;
        } else System.out.println(qntdDinheiro - Farmacia.preco);
        return comprarProduto(qntdDinheiro);
    }

    @Override
    public String toString() {
        return "\nCliente: " + nome + "\nEndereço: " + endereco + "\nCPF: " + cpf + "\nForma de pagamento mais " +
                "utilizada: " + formaPagamento + "\nSaldo atual: " + qntdDinheiro;
    }
}
