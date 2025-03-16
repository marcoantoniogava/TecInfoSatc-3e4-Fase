//Faça um Programa que receba um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.),
//se digitar outro valor deve aparecer a mensagem “valor inválido”.

import java.util.Scanner;

public class ex4lista2java
{
	public static void main(String[] args) {
	    
	    int numero;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite um número de 1 a 7: ");
	    numero = scanner.nextInt();

	    if (numero == 1) {
	        System.out.print("Número 1, é Domingo!");
	    }
	    else if (numero == 2) {
	        System.out.print("Número 2, é Segunda!");
	    }
	    else if (numero == 3) {
	        System.out.print("Número 3, é Terça!");
	    }
	    else if (numero == 4) {
	        System.out.print("Número 4, é Quarta!");
	    }
	    else if (numero == 5) {
	        System.out.print("Número 5, é Quinta!");
	    }
	    else if (numero == 6) {
	        System.out.print("Número 6, é Sexta!");
	    }
	    else if (numero == 7) {
	        System.out.print("Número 7, é Sábado!");
	    }
	    else {
	        System.out.print("Número inválido!");
	    }
	}
}