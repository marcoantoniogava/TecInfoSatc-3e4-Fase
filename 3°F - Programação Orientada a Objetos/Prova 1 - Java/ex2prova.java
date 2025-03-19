import java.util.Scanner;

public class ex2prova {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //declara o scanner

        String nome;

        int idade, totalbercario = 0, totalinfantil = 0, totalfund1 = 0, totalfund2 = 0, totalensmedio = 0;

        while (true) { //enquanto true, repete (infinito até que usuario digite 999) (break)
            System.out.println("Digite o nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite a idade, ou 999 para sair: ");
            idade = scanner.nextInt();
            scanner.nextLine(); //faz a quebra de linha do outro scanner

            if (idade >= 0 && idade <= 3) { //condições para decidir qual variavel o cadastrado será incluido
                totalbercario++;
                System.out.println("O cadastrado está no berçário!");
            }
            else if (idade >= 4 && idade <= 7) {
                totalinfantil++;
                System.out.println("O cadastrado está no infantil!");
            }
            else if (idade >= 8 && idade <= 10) {
                totalfund1++;
                System.out.println("O cadastrado está no fundamental 1!");
            }
            else if (idade >= 11 && idade <= 14) {
                totalfund2++;
                System.out.println("O cadastrado está no fundamental 2!");
            }
            else if (idade >= 15 && idade <= 21) { //coloquei 21 anos como limite para estar no ensino médio
                totalensmedio++;
                System.out.println("O cadastrado está no ensino médio!");
            }
            else if (idade == 999) { //exibe os totais e fecha o programa
                System.out.println("Total berçário: " + totalbercario + ", Infantil: " + totalinfantil + ", Fundamental 1: " + totalfund1 + ", Fundamental 2: " + totalfund2 + "Ensino médio: " +totalensmedio);
                System.out.println("Programa encerrado!");
                break;
            }
            else {
                System.out.println("Erro! tente novamente...");
            }
        }
    }
}
