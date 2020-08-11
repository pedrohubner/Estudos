package com.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BackUp> backUpList = new ArrayList<>();

        Message message = new Message();
        Changes change = new Changes(backUpList);

        message.setMessage("BackUp realizado em 01/08/20 às 22:05");
        change.saveChanges(message.saveBackUp());

        message.setMessage("BackUp realizado em 05/08/20 às 06:32");
        change.saveChanges(message.saveBackUp());

        message.setMessage("BackUp realizado em 09/08/20 às 02:40");
        System.out.println("Backup atual: " + message);

        message.getBackUp(backUpList.get(0));
        System.out.println("Restaurando primeiro backup: " + message);

        message.getBackUp(backUpList.get(1));
        System.out.println("Restaurando segundo backup: " + message);
    }
}
