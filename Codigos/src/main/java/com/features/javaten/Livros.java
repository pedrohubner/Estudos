package com.features.javaten;

public class Livros {

    private String titulo;
    private String editora;
    private Integer qntdPaginas;
    private Double valor;
    private Integer estoqueDisponivel;

    public Livros(String titulo, String editora, Integer qntdPaginas, Double valor, Integer estoqueDisponivel) {
        this.titulo = titulo;
        this.editora = editora;
        this.qntdPaginas = qntdPaginas;
        this.valor = valor;
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getQntdPaginas() {
        return qntdPaginas;
    }

    public void setQntdPaginas(Integer qntdPaginas) {
        this.qntdPaginas = qntdPaginas;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(Integer estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public String checarEstoque(Integer estoqueDisponivel) {
        if (estoqueDisponivel <= 3)
            return  "Últimas " + estoqueDisponivel + " edições de " + titulo + " na loja. Aproveita que dá tempo!";
        else return "Temos " + estoqueDisponivel + " edições de " + titulo + " na loja";
    }

    public void exibirLivros(){
        System.out.println("- " + titulo + " - R$" + valor + "\nPáginas: " + qntdPaginas +
                " páginas.");
    }

    @Override
    public String toString() {
        return titulo + ", da editora " + editora + ", custa R$" + valor + ", e tem " + qntdPaginas + " páginas.";
    }
}
