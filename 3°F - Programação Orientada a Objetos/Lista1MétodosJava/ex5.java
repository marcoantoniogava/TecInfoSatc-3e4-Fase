//Exercicio5 - Construir um programa em JAVA que contenha um método,
//que leia nome e estado civil de uma pessoa e verificar a classificação:
//Sigla	Estado Civil
//S			Solteiro
//C			Casado
//V			Viúvo
//D			Divorciado

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        verifyClass();
    }
    public static void verifyClass () {

        String nome, estadoCivil, classificacao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite seu estado civil, S para solteiro, C para casado, V para viuvo, D para divorciado: ");
        estadoCivil = scanner.nextLine();

        if (estadoCivil.equalsIgnoreCase("s")) {
            System.out.println("Você é solteiro!");
        }
        else if (estadoCivil.equalsIgnoreCase("c")) {
            System.out.println("Você é casado!");
        }
        else if (estadoCivil.equalsIgnoreCase("v")) {
            System.out.println("Você é viuvo!");
        }
        else if (estadoCivil.equalsIgnoreCase("d")) {
            System.out.println("Você é divorciado!");
        }
        else {
            System.out.println("Erro, você digitou algo errado...");
        }
    }
}
