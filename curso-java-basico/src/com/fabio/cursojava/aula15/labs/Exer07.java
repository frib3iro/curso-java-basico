package com.fabio.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        // Faça um Programa que leia três números e mostre o maior e o menor deles.
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num3 = scan.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro numero é o maior " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo numero é o maior " + num2);
        } else {
            System.out.println("O terceiro numero é o maior " + num3);
        } 
        
        if (num1 < num2 && num1 < num3) {
            System.out.println("O primeiro numero é o menor " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O segundo numero é o menor " + num2);
        } else {
            System.out.println("O terceiro numero é o menor " + num3);
        } 
        scan.close();
    }
}
