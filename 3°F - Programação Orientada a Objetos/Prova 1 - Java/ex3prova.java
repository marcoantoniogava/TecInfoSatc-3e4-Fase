import java.util.Scanner;

public class ex3prova {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //declara o scanner

        String nome;

        int numeroconta;

        double saldocliente, valorcredito; //double para as variaveis de operação

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        numeroconta = scanner.nextInt();
        scanner.nextLine(); //faz a quebra de linha do outro scanner

        System.out.println("Digite o saldo médio no último ano: ");
        saldocliente = scanner.nextDouble();
        scanner.nextLine(); //faz a quebra de linha do outro scanner

        if (saldocliente >= 0 && saldocliente <= 2000) { //condições para decidir o valor do crédito
            System.out.println("Olá, " + nome + ", Você não possui saldo para crédito!");
        }
        else if (saldocliente >= 2001 && saldocliente <= 4000) {
            valorcredito = (saldocliente * 1.05) - saldocliente;
            System.out.println("Olá, " + nome + ", O valor do seu crédito é de: " + valorcredito);
        }
        else if (saldocliente >= 4001 && saldocliente <= 6000) {
            valorcredito = (saldocliente * 1.10) - saldocliente;
            System.out.println("Olá, " + nome + ", O valor do seu crédito é de: " + valorcredito);
        }
        else if (saldocliente > 6000) {
            valorcredito = (saldocliente * 1.15) - saldocliente;
            System.out.println("Olá, " + nome + ", O valor do seu crédito é de: " + valorcredito);
        }
        else {
            System.out.println("Erro, você digitou algo errado!");
        }
    }
}
