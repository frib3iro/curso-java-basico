package com.fabio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
        // mesmo tipo e tamanho e com os elementos do vetor A multiplicados
        // por 2, ou seja: B[i] = A[i] * 2.
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com a posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");
        scan.close();
    }
}
