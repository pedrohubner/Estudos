package com.semanaum;

public class CafePassado {
    public static void main(String[] args) {

        CafeLeite cafe2 = new CafeLeite(0, false, 0, 1.5, false, 0,
                0, 0);

        System.out.println((!cafe2.getChaleira() ? "A Chaleira está desligada.":"Chaleira está ligada.") +
                "\nColoco " + cafe2.getColheres() + " colheres de café na cafeteira." +
                "\nColocar " + cafe2.getAgua() + " litros de água fervida da chaleira na cafeteira e ligar a cafeteira"
                + "\nCafé está pronto? " + (!cafe2.getTermica() ? "Ainda não":"Sim, então agora coloca-se " +
                "na térmica") + "\nQuero " + cafe2.getLeite() + " ml de leite no café." +
                " \nE coloque " + cafe2.getGelo() +  " cubos de gelo e adiciono" + cafe2.getAdocante() +
                " gotas de adoçante \n");

        cafe2.chaleiraLigada();
        cafe2.setColheres(4);
        cafe2.colocarColheres();
        cafe2.colocarColheres();
        cafe2.cafeNaTermica();
        cafe2.colocarLeite();
        cafe2.colocarLeite();
        cafe2.colocarAdocante();

        System.out.println((!cafe2.getChaleira() ? "A Chaleira está desligada.":"Chaleira está ligada.") +
                "\nColoco " + cafe2.getColheres() + " colheres de café na cafeteira." +
                "\nColocar " + cafe2.getAgua() + " litros de água fervida da chaleira na cafeteira e ligar a cafeteira"
                + "\nCafé está pronto? " + (!cafe2.getTermica() ? "Ainda não":"Sim, então agora coloca-se " +
                "na térmica"));

        Cafe.servirXicara();

        System.out.println("Quero " + cafe2.getLeite() + " ml de leite no café." +
                " \nE coloco " + cafe2.getGelo() + " cubos de gelo e adiciono " + cafe2.getAdocante() +
                " gotas de adoçante\n");

        Mocaccino cafe3 = new Mocaccino(0, false, 0, false, 1.5, 0,
                0);

        System.out.println((!cafe3.getChaleira() ? "A Chaleira está desligada.":"Chaleira está ligada.") +
                "\nColoco " + cafe3.getColheres() + " colheres de café na cafeteira." +
                "\nColocar " + cafe3.getAgua() + " litros de água fervida da chaleira na cafeteira e ligar a cafeteira"
                + "\nCafé está pronto? " + (!cafe3.getTermica() ? "Ainda não":"Sim, então agora coloca-se " +
                "na térmica") + "\nQuero " + cafe3.getChocolate() + " colheres de achocolatado.\n" + "Também vou por "
                + cafe3.getAcucar() + " colheres de açucar.\n");

        cafe3.chaleiraLigada();
        cafe3.setColheres(6);
        cafe3.cafeNaTermica();
        cafe3.colocarAcucar();
        cafe3.colocarAcucar();

        System.out.println((!cafe3.getChaleira() ? "A Chaleira está desligada.":"Chaleira está ligada.") +
                "\nColoco " + cafe3.getColheres() + " colheres de café na cafeteira." +
                "\nColocar " + cafe3.getAgua() + " litros de água fervida da chaleira na cafeteira e ligar a cafeteira"
                + "\nCafé está pronto? " + (!cafe3.getTermica() ? "Ainda não":"Sim, então agora coloca-se " +
                "na térmica"));

        Cafe.servirXicara();

        System.out.println("Quero " + cafe3.getChocolate() + " colheres de achocolatado.\n" + "Também vou por "
                + cafe3.getAcucar() + " colheres de açucar.\n");

        System.out.println("Café tá forte");
    }
}