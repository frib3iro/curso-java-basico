package com.fabio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        // Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
        // um vetor C, onde cada elemento de C é a soma dos respectivos
        // elementos em A e B, ou seja:
        // C[i] = A[i] + B[i].
        Scanner scan = new Scanner(System.in);

        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o indice " + i + " do vetor A: ");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.print("Digite o indice " + i + " do vetor B: ");
            B[i] = scan.nextInt();
        }

        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println();

        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor C = ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }

        System.out.println();

        scan.close();
    }
}
