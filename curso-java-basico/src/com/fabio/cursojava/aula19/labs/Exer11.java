package com.fabio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Criar um vetor A com 10 elementos inteiros. Implementar um programa
        // que defina e escreva a quantidade de elementos armazenados neste
        // vetor que são pares.
        int[] A = new int[5];
        int qtd = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o numero " + i + ": ");
            A[i] = scan.nextInt();
            if (A[i] % 2 == 0) {
                qtd++;
            }
        }

        System.out.println("O vetor A tem " + qtd + " numeros pares.");

        scan.close();
    }
}
