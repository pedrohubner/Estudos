package com.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BackUp> backUpList = new ArrayList<>();

        Message message = new Message();
        JohnDoe johnDoe = new JohnDoe(backUpList);

        message.setMessage("Hello, World");
        johnDoe.saveChanges(message.saveBackUp());

        message.setMessage("How u doing?");
        johnDoe.saveChanges(message.saveBackUp());

        message.setMessage("Good bye!");
        System.out.println("Mensagem atual: " + message);

        message.getBackUp(backUpList.get(0));
        System.out.println("Retornando primeiro backup: " + message);

        message.getBackUp(backUpList.get(1));
        System.out.println("Retornando segundo backup: " + message);
    }
}
