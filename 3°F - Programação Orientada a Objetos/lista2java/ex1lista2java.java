//Faça um programa que receba dois números e imprima o maior deles.

import java.util.Scanner;

public class ex1lista2java
{
	public static void main(String[] args) {
	    double primeironumero, segundonumero;
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Digite o primeiro número: ");
	    primeironumero = scanner.nextDouble();
	    System.out.print("Digite o segundo número: ");
	    segundonumero = scanner.nextDouble();
	    
	    if (primeironumero > segundonumero) {
	        System.out.print("O maior número é: " + primeironumero);
	    }
	    
	    else if (segundonumero > primeironumero) {
	        System.out.print("O maior número é: " + segundonumero);
	    }
	    
	    else {
	        System.out.print("Aconteceu um erro!");
	    }
	}
}