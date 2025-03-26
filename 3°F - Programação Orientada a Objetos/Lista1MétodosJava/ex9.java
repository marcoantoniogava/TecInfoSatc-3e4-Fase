//Exercicio9 - Construir um programa em JAVA que contenha um método,
//que leia os dados 100 alunos de uma Universidade:
//nome, idade e sexo. Após verifique a quantidade de alunos por:
//Total de alunos maior e menor de idade (18 anos)
//Total de alunos por sexo (masculino e feminino)

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        verifyStudents();
    }
    public static void verifyStudents() {

        Scanner scanner = new Scanner(System.in);

        String nome, sexo;
        int i = 0, idade, totalMaiorIdade = 0, totalMenorIdade = 0, totalHomens = 0, totalMulheres = 0;

        while (i < 100) {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite seu sexo, F para feminino e M para masculino: ");
            sexo = scanner.nextLine();

            if (idade < 18) {
                totalMenorIdade++;
            }
            else if (idade >= 18) {
                totalMaiorIdade++;
            }
            if (sexo.equalsIgnoreCase("f")) {
                totalMulheres++;
            }
            else if (sexo.equalsIgnoreCase("m")) {
                totalHomens++;
            }
            i++;
        }
        System.out.println("Total de alunos homens: " + totalHomens + ", Total mulheres: " + totalMulheres + ", Total maiores de idade: " + totalMaiorIdade + ", Total menores de idade: " + totalMenorIdade);
    }
}
