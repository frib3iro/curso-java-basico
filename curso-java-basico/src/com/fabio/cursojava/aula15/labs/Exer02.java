package com.fabio.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        // Faça um Programa que peça um valor e mostre na tela 
        // se o valor é positivo ou negativo.
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = scan.nextInt();

        if (valor >= 0) {
            System.out.println("O valor " + valor + " é positivo");
        } else {
            System.out.println("O valor " + valor + " é negativo");
        }

        scan.close();
    }
}
