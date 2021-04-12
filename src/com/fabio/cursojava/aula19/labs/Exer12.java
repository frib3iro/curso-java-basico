package com.fabio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer12 {
    
    public static void main(String[] args) {        
        
        // Criar um vetor A com 10 elementos inteiros. Implementar um programa
        // que defina e escreva a soma de todos os elementos armazenados
        // neste vetor.
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[3];
        int soma = 0;
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o numero " + i + ": ");
            A[i] = scan.nextInt();
            soma += A[i];
        }
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println();
        System.out.println("A soma de todos os elementos é: " + soma);
        
        
        scan.close();
    }
}
