package com.fabio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer14 {
    
    public static void main(String[] args) {        
        
        // Criar um vetor A com 10 elementos inteiros. Implementar um programa
        // que defina e escreva a média aritmética simples dos elementos
        // ímpares armazenados neste vetor.
        Scanner scan = new Scanner(System.in);
        int[] A = new int[10];
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o elemento " + i + ": ");
            A[i] = scan.nextInt();
        }
        
        
        scan.close();
    }
}
