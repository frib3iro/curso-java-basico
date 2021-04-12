package com.fabio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        // Criar um vetor A com 10 elementos inteiros. Implementar um programa
        // que determine a soma dos elementos armazenados neste vetor que
        // são múltiplos de 5.
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int soma = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o numero " + i + ": ");
            A[i] = scan.nextInt();
            if (A[i] % 5 == 0) {
                soma += A[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.println("A soma de todos os multiplos é: " + soma);
        scan.close();

    }
}
