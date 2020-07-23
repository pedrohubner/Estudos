package com.datastructure.stack;

import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Integer edition;
    private String name;
    private Double value;
    private Integer pages;
    private Author author;

    @Override
    public String toString() {
        return "\nLivro: " + name + "\nAutor: " + author + "\nQntd. páginas: " + pages +
                "\nPreço: R$" + value;
    }
}
