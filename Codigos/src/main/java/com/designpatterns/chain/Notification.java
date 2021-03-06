package com.designpatterns.chain;

public class Notification {
    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification(null);
        SMSNotification smsNotification = new SMSNotification(emailNotification);
        TeamsNotification teamsNotification = new TeamsNotification(smsNotification);

        Request exibirMensagem = new Request("Email");

        System.out.println(teamsNotification.choose(exibirMensagem));
    }
}
