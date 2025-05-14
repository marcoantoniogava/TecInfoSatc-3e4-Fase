package exaula12marco;
import java.util.Scanner;

public class cadastrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        oficina oficina = new oficina();

        System.out.println("Escolha o tipo de veículo:");
        System.out.println("1 - Automóvel");
        System.out.println("2 - Bicicleta");
        System.out.println("3 - Caminhão");
        System.out.println("4 - Ônibus");
        System.out.println("Digite sua opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        // Variável para armazenar o veículo escolhido
        veiculo veiculoEscolhido = null;

        // Pedir informações do veículo (Código, Descrição, Marca e Modelo)
        System.out.println("Digite o código do veículo: ");
        String codigo = scanner.nextLine();
        System.out.println("Digite a marca do veículo: ");
        String marca = scanner.nextLine();
        System.out.println("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();
        System.out.println("Digite o ano do veículo: ");
        String ano = scanner.nextLine();
        System.out.println("Digite a cor do veículo: ");
        String cor = scanner.nextLine();
        System.out.println("Digite o peso do veículo: ");
        String peso = scanner.nextLine();
        System.out.println("Digite o tamanho do veículo: ");
        String tamanho = scanner.nextLine();

        // escolher tipo veiculo (filhos)
        if (opcao == 1) {
            veiculoEscolhido = new automovel(codigo, marca, modelo, ano, cor, peso, tamanho);
            System.out.println("\nVocê escolheu um automóvel!");
        } else if (opcao == 2) {
            veiculoEscolhido = new bicicleta(codigo, marca, modelo, ano, cor, peso, tamanho);
            System.out.println("\nVocê escolheu uma bicicleta!");
        } else if (opcao == 3) {
            veiculoEscolhido = new caminhao(codigo, marca, modelo, ano, cor, peso, tamanho);
            System.out.println("\nVocê escolheu um caminhão!");
        } else if (opcao == 4) {
            veiculoEscolhido = new onibus(codigo, marca, modelo, ano, cor, peso, tamanho);
            System.out.println("\nVocê escolheu um ônibus!");
        } else {
            System.out.println("Opção inválida!");
        }
        veiculoEscolhido.exibirInformacoes();

        System.out.println("Iniciando os serviços para o veículo escolhido...");
        System.out.println("Escolha o tipo de serviço: ");
        System.out.println("1 - Revisão");
        System.out.println("2 - Manutenção");
        System.out.println("3 - Limpeza");
        System.out.println("4 - Abastecimento");
        System.out.println("Digite sua opção: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.println("\nVocê escolheu fazer revisão...");
            oficina.fazerRevisao();
        } else if (tipo == 2) {
            System.out.println("\nVocê escolheu fazer manutenção...");
            oficina.fazerManutencao();
        } else if (tipo == 3) {
            System.out.println("\nVocê escolheu fazer limpeza...");
            oficina.fazerLimpeza();
        } else if (tipo == 4) {
            System.out.println("\nVocê escolheu fazer abastecimento...");
            oficina.fazerAbastecimento();
        } else {
            System.out.println("Opção inválida!");
        }
        scanner.close();
    }
}
