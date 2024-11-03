package com.fabio.cursojava.aula16;

public class Aula16 {

    public static void main(String[] args) {

	System.out.println("While imprimindo at� 10: ");

	int aux = 1;
	int max = 10;

	while (aux <= max) {
	    System.out.println("Contando at� " + aux);
	    aux++;
	}

	System.out.println();

	System.out.println("Valor da variavel aux no final do while " + aux);

	System.out.println();

	System.out.println("Do-while imprimindo at� 15: ");

	do {
	    aux++;
	    System.out.println("Contando at� " + aux);
	} while (aux < 15);
	
	System.out.println();
	
	System.out.println("Valor da variavel aux no final do do-while " + aux);
	
	System.out.println();
    }

}
