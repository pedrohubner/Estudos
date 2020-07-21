package com.features.nine;

public interface Salario {

    default String entrarSalario(int a, int salario){
        ganharBonus(a, salario);
        return "Salário entrou. Valor depositado: R$" + (a + salario);
    }

    private Integer ganharBonus(int a, int salario){
        if (a < salario && a != 0) {
            System.out.println("Este mês os funcionários ganharão um bônus");
            return a + salario;
        }
        return a;
    }

}
