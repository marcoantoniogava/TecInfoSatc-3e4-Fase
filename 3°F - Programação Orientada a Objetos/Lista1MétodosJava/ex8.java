//Exercicio8 - Construir um programa em JAVA que contenha um método,
//que leia os dados de 300 alunos. A partir dos dados de entrada:
//nome e formação dos alunos verificar o total de alunos em cada formação:
//Ensino Fundamental
//Ensino Médio
//Ensino Técnico


import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        verifyStudents();
    }
    public static void verifyStudents() {

        Scanner scanner = new Scanner(System.in);

        String nome, formacao;
        int i = 0, totalF = 0, totalM = 0, totalT = 0;

        while (i < 300) {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite sua formação, F para ensino fundamental, M para ensino medio, T para ensino tecnico: ");
            formacao = scanner.nextLine();

            if (formacao.equalsIgnoreCase("f")) {
                totalF++;
            }
            else if (formacao.equalsIgnoreCase("m")) {
                totalM++;
            }
            else if (formacao.equalsIgnoreCase("t")) {
                totalT++;
            }
            else {
                System.out.println("Você digitou algo errado... tente novamente!");
            }
            i++;
        }
        System.out.println("Total de estudantes nos ensinos: Fundamental: " + totalF + ", Medio: " + totalM + ", Tecnico: " + totalT);
    }
}
