package exaula12marco;
import java.util.Scanner;

public class oficina {

    Scanner scanner = new Scanner(System.in);

    // Métodos para serem chamados nas classes filhas

    public void fazerRevisao() {
        System.out.println("Digite a data da revisão: ");
        String data = scanner.nextLine();
        System.out.println("Digite a hora da revisão: ");
        String hora = scanner.nextLine();
        System.out.println("Verificando as condições gerais do veículo...");
    }
    public void fazerManutencao() {
        System.out.println("Digite o defeito do veículo: ");
        String defeito = scanner.nextLine();
        System.out.println("Digite o valor: ");
        String valor = scanner.nextLine();
        System.out.println("Realizando ajustes e manutenção no veículo...");
    }
    public void fazerLimpeza() {
        System.out.println("Digite o tipo: ");
        String tipo = scanner.nextLine();
        System.out.println("Digite o valor: ");
        String valor = scanner.nextLine();
        System.out.println("Realizando limpeza do veículo...");
    }
    public void fazerAbastecimento() {
        System.out.println("Digite o tipo do combustível: ");
        String tipoCombus = scanner.nextLine();
        System.out.println("Digite a quantidade: ");
        String quantidade = scanner.nextLine();
        System.out.println("Digite o valor: ");
        String valor = scanner.nextLine();
        System.out.println("Realizando abastecimento do veículo...");
    }

}
