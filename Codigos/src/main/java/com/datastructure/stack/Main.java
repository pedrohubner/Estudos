package com.datastructure.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Author author = Author.builder()
                .name("Rick Riordan")
                .email("riordanrick@gmail.com")
                .build();

        Author author2 = Author.builder()
                .name("Dan Brown")
                .email("danbrown@gmail.com")
                .build();

        Stack<Book> bookStack = new Stack<>();

        bookStack.push(new Book(5, "\"The Da Vinci Code\"", 55., 624, author2));
        bookStack.push(new Book(4, "\"The Last Olimpian\"", 40., 452, author));

        System.out.println(bookStack);
    }
}
