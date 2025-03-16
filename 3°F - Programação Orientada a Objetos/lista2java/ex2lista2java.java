//Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

import java.util.Scanner;

public class ex2lista2java
{
	public static void main(String[] args) {
	    
	    double primeirovalor, segundovalor, terceirovalor, menorvalor = 0;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite o valor do primeiro produto: ");
	    primeirovalor = scanner.nextDouble();
	    System.out.print("Digite o valor do segundo produto: ");
	    segundovalor = scanner.nextDouble();
	    System.out.print("Digite o valor do terceiro produto: ");
	    terceirovalor = scanner.nextDouble();
	    
	    if (primeirovalor <= segundovalor && primeirovalor <= terceirovalor) {
	        menorvalor = primeirovalor;
	    }
	    else if (segundovalor <= primeirovalor && segundovalor <= terceirovalor) {
	        menorvalor = segundovalor;
	    }
	    else if (terceirovalor <= primeirovalor && terceirovalor <= segundovalor) {
	        menorvalor = terceirovalor;
	    }
	    else {
	        System.out.print("Aconteceu um erro!");
	    }
	    System.out.print("O produto de menor valor é: " + menorvalor);
	}
}