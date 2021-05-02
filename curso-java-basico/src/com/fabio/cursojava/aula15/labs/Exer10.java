package com.fabio.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {
    
    public static void main(String[] args) {        
        
        // Faça um Programa que pergunte em que turno você estuda. Peça
        // para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
        // mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
        // Inválido!", conforme o caso.
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Em que turno você estuda, digite (M-matutino ou V-Vespertino ou N- Noturno): ");
        String resposta = scan.next();
        
        switch (resposta) {
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Inválido!");
        }
        scan.close();
    }
}
