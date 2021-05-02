package com.fabio.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {
        // Faça um programa que pergunte o preço de três produtos e informe
        // qual produto você deve comprar, sabendo que a decisão é sempre
        // pelo mais barato.
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor do produto 1: ");
        double produto1 = scan.nextDouble();

        System.out.print("Entre com o valor do produto 2: ");
        double produto2 = scan.nextDouble();

        System.out.print("Entre com o valor do produto 3: ");
        double produto3 = scan.nextDouble();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("Você deve comprar o produto 1, pois é mais barato: " + produto1);
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("Você deve comprar o produto 2, pois é mais barato: " + produto2);
        } else {
            System.out.println("Você deve comprar o produto 3, pois é mais barato: " + produto3);
        }

        scan.close();
    }
}
