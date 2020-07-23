package com.datastructure.stack;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private String name;
    private String email;

    @Override
    public String toString() {
        return name;
    }
}
