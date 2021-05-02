package com.fabio.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        // Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra [F ou M]: ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("F")) {
            System.out.println("Sexo feminino");
        } else if (letra.equalsIgnoreCase("M")) {
            System.out.println("Sexo masculino");
        } else {
            System.out.println("Sexo inválido");
        }
        scan.close();
    }
}
