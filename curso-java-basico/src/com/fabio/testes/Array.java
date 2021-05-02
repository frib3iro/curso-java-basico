package com.fabio.testes;

import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int[][] numerosAleatorios = new int[4][4];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = rand.nextInt(10);
            }
        }
        
        boolean maior = Integer.MAX_VALUE;
        boolean menor = Integer.MIN_VALUE;

        for (int i = 0; i < numerosAleatorios.length; i++) {

        }

        scan.close();
    }
}
