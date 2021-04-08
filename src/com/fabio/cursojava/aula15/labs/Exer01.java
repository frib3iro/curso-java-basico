package com.fabio.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        // Faça um Programa que peça dois números e imprima o maior deles.
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O maior numero é: " + num1);
        } else {
            System.out.println("O maior numero é: " + num2);
        }
        scan.close();
    }

}
