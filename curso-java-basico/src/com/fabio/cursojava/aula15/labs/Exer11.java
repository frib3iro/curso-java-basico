package com.fabio.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        // As Organizações Tabajara resolveram dar um aumento de salário aos
        // seus colaboradores e lhe contraram para desenvolver o programa que
        // calculará os reajustes.
        // Faça um programa que recebe o salário de um colaborador e o
        // reajuste segundo o seguinte critério, baseado no salário atual:
        // salários até R$ 280,00 (incluindo) : aumento de 20%
        // salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        // salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        // salários de R$ 1500,00 em diante : aumento de 5% Após o
        // aumento ser realizado, informe na tela:
        // salário antes do reajuste;
        // percentual de aumento aplicado;
        // valor do aumento;
        // novo salário, após o aumento.
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = scan.nextDouble();
        double salarioNovo = 0;
        String percentual = null;

        if (salario <= 280.00) {
            salarioNovo = (20 / 100) * 280.00;
            percentual = "20%";
        } else if (salario >= 280.00 && salario <= 700.00) {
            salarioNovo = (15 / 100) * 280.00;
            percentual = "15%";
        }else if (salario >= 700.00 && salario <= 1500.00) {
            salarioNovo = (10 / 100) * 280.00;
            percentual = "10%";
        }else if (salario > 1500.00) {
            salarioNovo = (5 / 100) * 280.00;
            percentual = "5%";
        }
        
        System.out.println("O salario antes do reajuste era de: " + salario);
        System.out.println("O percentual de aumento foi de: " + percentual);
//        System.out.println("O valor do aumentoo foi de: " + );
        System.out.println("O seu novo salário é de: "+ salarioNovo);
        scan.close();
    }

}
