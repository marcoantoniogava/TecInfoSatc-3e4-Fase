//Exercicio6 - Construir um programa em JAVA que contenha um método,
//que leia dois valores e escolha a operação matemática desejada
//(adição, subtração, multiplicação e divisão).
//Ao final exibir o resultado.
//Exemplo:  valor1 =  2
//		    valor2 =  3
//                 operação = adição
//                 resultado = 5

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        calculadora();
    }
    public static void calculadora() {

        String escolha;

        double valor1, valor2, resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a operacao desejada, A para adicao, S para subtracao, M para multiplicacao, D para divisao: ");
        escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("a")) {
            resultado = valor1 + valor2;
            System.out.println("Resultado: " + resultado);
        }
        else if (escolha.equalsIgnoreCase("s")) {
            resultado = valor1 - valor2;
            System.out.println("Resultado: " + resultado);
        }
        else if (escolha.equalsIgnoreCase("m")) {
            resultado = valor1 * valor2;
            System.out.println("Resultado: " + resultado);
        }
        else if (escolha.equalsIgnoreCase("d")) {
            resultado = valor1 / valor2;
            System.out.println("Resultado: " + resultado);
        }
        else {
            System.out.println("Erro, você digitou algo errado!");
        }
    }
}
