//Construir um programa em JAVA que contenha um método,
//que leia nome e média final de um aluno e verifique sua situação:
//Média < 5            – Situação Reprovado
//Média entre 5 e 7  – Situação Recuperação
//Média >= 7          – Situação Aprovado

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        media();
        }
        public static void media() {

        String nome;
        double mediaFinal;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite sua média final: ");
            mediaFinal = scanner.nextDouble();
            scanner.nextLine();

            if (mediaFinal < 5) {
                System.out.println("Você foi reprovado...");
            }
            else if (mediaFinal >= 5 && mediaFinal < 7) {
                System.out.println("Você está de recuperação...");
            }
            else if (mediaFinal >= 7) {
                System.out.println("Você foi aprovado!");
            }
        }
    }
