//Escrever um algoritmo para ler o nome de um aluno e a sigla do curso e verificar:
//		Sigla			Curso
//		ADM 		      Administração
//		DIR			Direito
//		CEX			Comércio Exterior

import java.util.Scanner;

public class ex1lista3java
{
	public static void main(String[] args) {
		
		String nome, curso;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();
		System.out.print("Digite a sigla do seu curso, ADM para Administração, DIR para Direito e CEX para Comércio Exterior: ");
		curso = scanner.nextLine();
		
		if (curso.equalsIgnoreCase("adm")) {
		    System.out.print("Você faz Administração!");
		}
		else if (curso.equalsIgnoreCase("dir")) {
		    System.out.print("Você faz Direito!");
		}
		else if (curso.equalsIgnoreCase("cex")) {
		    System.out.print("Você faz Comércio Exterior!");
		}
		else {
		    System.out.print("Você digitou errado...");
		}
	}
}