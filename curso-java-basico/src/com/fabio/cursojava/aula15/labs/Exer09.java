package com.fabio.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {
        // Faça um Programa que leia três números e mostre-os em ordem decrescente.
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        int a = scan.nextInt();

        System.out.print("Entre com o segundo número: ");
        int b = scan.nextInt();

        System.out.print("Entre com o terceiro número: ");
        int c = scan.nextInt();

        if (a >= b && a >= c && b >= c) {
            System.out.println("A ordem decrescente é: " + a + " - " + b + " - " + c);
        } else if (a >= b && a >= c && c >= b) {
            System.out.println("A ordem decrescente é: " + a + " - " + c + " - " + b);
        } else if (b >= a && b >= c && a >= c) {
            System.out.println("A ordem decrescente é: " + b + " - " + a + " - " + c);
        } else if (b >= a && b >= c && c >= a) {
            System.out.println("A ordem decrescente é: " + b + " - " + c + " - " + a);
        } else if (c >= a && c >= b && a >= b) {
            System.out.println("A ordem decrescente é: " + c + " - " + a + " - " + b);
        } else if (c >= a && c >= b && b >= a) {
            System.out.println("A ordem decrescente é: " + c + " - " + b + " - " + a);
        }

        scan.close();
    }
}
