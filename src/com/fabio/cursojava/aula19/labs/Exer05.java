package com.fabio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        // Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
        // mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
        // ser o respectivo elemento de A multiplicado por sua posição (ou
        // índice), ou seja:
        // B[i] = A[i] * i.
        Scanner scan = new Scanner(System.in);

        int[] A = new int[3];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o numero " + i + ": ");
            A[i] = scan.nextInt();
            B[i] = A[i] * i;
        }
        
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

        scan.close();
    }
}
