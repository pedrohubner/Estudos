package com.semanaquatro.chain;

public class Notification {
    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification(null);
        SMSNotification smsNotification = new SMSNotification(emailNotification);
        TeamsNotification teamsNotification = new TeamsNotification(smsNotification);

        Request exibirMensagem = new Request("Sms");

        System.out.println(teamsNotification.escolher(exibirMensagem));
    }
}
