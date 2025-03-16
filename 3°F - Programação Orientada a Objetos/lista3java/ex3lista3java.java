//Construir um algoritmo para cadastrar os dados de um funcionário, a partir dos dados de entrada: nome, cargo e salário. 

//Sigla		Cargo		
//T			Técnico		
//E			Engenheiro de Software
//A			Analista Sistemas
//P			Programador
//W			Web-Designer
//G			Gerente Projetos

import java.util.Scanner;

public class ex3lista3java
{
	public static void main(String[] args) {
		
		String nome, cargo;
		double salario;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();
		System.out.print("Digite a sigla do seu cargo, T para Técnico, E para Engenheiro de Software, A para Analista de Sistemas, P para Programador, W para Web-Designer e G para Gerente de Projetos : ");
		cargo = scanner.nextLine();
		System.out.print("Digite o salário: ");
		salario = scanner.nextDouble();
		
		if (cargo.equalsIgnoreCase("t")) {
		    cargo = "Técnico";
		}
		else if (cargo.equalsIgnoreCase("e")) {
		    cargo = "Engenheiro de Software";
		}
		else if (cargo.equalsIgnoreCase("a")) {
		    cargo = "Analista de Sistemas";
		}
		else if (cargo.equalsIgnoreCase("p")) {
		    cargo = "Programador";
		}
		else if (cargo.equalsIgnoreCase("w")) {
		    cargo = "Web-Designer";
		}
		else if (cargo.equalsIgnoreCase("g")) {
		    cargo = "Gerente de Projetos";
		}
		else {
		    System.out.print("Você digitou errado...");
		}
		System.out.print("Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + salario);
	}
}