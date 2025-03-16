//Escrever um algoritmo para ler nome e a sigla do estado civil de uma pessoa e verificar a classificação:

//Sigla			Classificação
//S				Solteiro 
//C				Casado 	
//V				Viúvo 
//D				Divorciado

import java.util.Scanner;

public class ex2lista3java
{
	public static void main(String[] args) {
		
		String nome, estadocivil;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();
		System.out.print("Digite a sigla do seu estado civil, S para Solteiro, C para Casado, V para Viúvo e D para Divorciado: ");
		estadocivil = scanner.nextLine();
		
		if (estadocivil.equalsIgnoreCase("s")) {
		    System.out.print("Você é solteiro!");
		}
		else if (estadocivil.equalsIgnoreCase("c")) {
		    System.out.print("Você é casado!");
		}
		else if (estadocivil.equalsIgnoreCase("v")) {
		    System.out.print("Você é viúvo!");
		}
		else if (estadocivil.equalsIgnoreCase("d")) {
		    System.out.print("Você é divorciado!");
		}
		else {
		    System.out.print("Você digitou errado...");
		}
	}
}