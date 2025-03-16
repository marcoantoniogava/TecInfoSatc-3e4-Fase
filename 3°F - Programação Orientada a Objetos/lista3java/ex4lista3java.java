//Escrever um algoritmo para ler dois valores e escolher a operação matemática desejada (adição, subtração, multiplicação e divisão). Ao final exibir o resultado.

//Exemplo:       valor1 =  2
//			     valor2 =  3
//               operação = adição
//               Resultado = 5

import java.util.Scanner;

public class ex4lista3java
{
	public static void main(String[] args) {

        String operacao;
		double valor1, valor2, resultado = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		valor2 = scanner.nextDouble();
		scanner.nextLine(); //Limpa o buffer
		
		System.out.print("Digite a operacão, A para adição, S para subtração, M para multiplicação e D para  divisão: ");
		operacao = scanner.nextLine();
		
		if (operacao.equalsIgnoreCase("a")) {
		    resultado = valor1 + valor2;
		}
		else if (operacao.equalsIgnoreCase("s")) {
		    resultado = valor1 - valor2;
		}
		else if (operacao.equalsIgnoreCase("m")) {
		    resultado = valor1 * valor2;
		}
		else if (operacao.equalsIgnoreCase("d")) {
		    resultado = valor1 / valor2;
		}
		else {
		    System.out.print("Você digitou errado...");
		}
		System.out.print("Resultado do cálculo: " + resultado);
	}
}