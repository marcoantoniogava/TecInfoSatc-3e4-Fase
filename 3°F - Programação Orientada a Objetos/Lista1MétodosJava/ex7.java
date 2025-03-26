//Exercicio7 - Construir um programa em JAVA que contenha um método,
//que leia os dados de 50 funcionários.
//A partir dos dados de entrada: nome e salário,  verificar o total de funcionários:
//Total que recebem até R$ 3.000
//Total que recebe entre R$ 3000 e R$ 5000
//Total que recebem mais que R$ 5000

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        verificarFuncionarios();
    }
    public static void verificarFuncionarios() {

        Scanner scanner = new Scanner(System.in);

        String nome;
        double salario;
        int i = 0, totalate3k = 0, total3a5k = 0, totalmaisde5k = 0;

        while (i < 50) {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite seu salario: ");
            salario = scanner.nextDouble();
            scanner.nextLine();

            if (salario < 3000) {
                totalate3k++;
            }
            else if (salario >= 3000 && salario <= 5000) {
                total3a5k++;
            }
            else if (salario > 5000) {
                totalmaisde5k++;
            }
            i++;
        }
        System.out.println("Funcionarios que recebem ate 3000: " + totalate3k + ", funcionarios que recebem de 3000 a 5000: " + total3a5k + ", funcionarios que recebem mais de 5000: " + totalmaisde5k);
    }
}
