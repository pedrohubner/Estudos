package com.features.ten;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Data
@Builder
public class Books {

    private String titulo;
    private String editora;
    private Integer qntdPaginas;
    private Double valor;
    private Integer estoqueDisponivel;

    public Books(String titulo, String editora, Integer qntdPaginas, Double valor, Integer estoqueDisponivel) {
        this.titulo = titulo;
        this.editora = editora;
        this.qntdPaginas = qntdPaginas;
        this.valor = valor;
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public String isEmpty() {
        return Optional.ofNullable(titulo).orElseThrow();
    }

    @Override
    public String toString() {
        return titulo;
    }
}
