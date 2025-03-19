import java.util.Scanner;

public class ex1prova {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //declara o scanner

        int escolha, votosjose = 0, votosmaria = 0, votosbrancos = 0; //int para as variaveis

        while (true) { //enquanto true, repete (infinito até que usuario digite 4 (break)
            System.out.println("Menu de opções: 1 - José, 2 - Maria, 3 - Branco, 4 - Sair: ");
            escolha = scanner.nextInt(); //escolha das opções

            if (escolha == 1) { //para cada voto, aumenta + 1 nas variaveis
                votosjose++;
            }
            else if (escolha == 2) {
                votosmaria++;
            }
            else if (escolha == 3) {
                votosbrancos++;
            }
            else if (escolha == 4) { //exibe os votos e encerra o programa
                System.out.println("Votos para José: " + votosjose + ", Votos para Maria: " + votosmaria + ", Votos brancos: " + votosbrancos);
                System.out.println("Programa encerrado!");
                break;
            }
            else {
                System.out.println("Você digitou algo errado, tente novamente!");
            }
        }
    }
}
