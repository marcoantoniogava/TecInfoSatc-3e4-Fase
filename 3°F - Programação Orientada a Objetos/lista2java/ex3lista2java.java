//Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.


import java.util.Scanner;

public class ex3lista2java
{
	public static void main(String[] args) {
	    
	    double nota1, nota2, media;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite a primeira nota: ");
	    nota1 = scanner.nextDouble();
	    System.out.print("Digite a segunda nota: ");
	    nota2 = scanner.nextDouble();
	    
	    media = (nota1 + nota2) / 2;
	    
	    if (media >= 7) {
	        System.out.print("Aprovado! Sua média foi: " + media);
	    }
	    else if (media < 7) {
	        System.out.print("Reprovado! Sua média foi: " + media);
	    }
	    else if (media == 10) {
	        System.out.print("Aprovado com Distinção! Sua média foi: " + media);
	    }
	    else {
	        System.out.print("Aconteceu um erro!");
	    }
	}
}