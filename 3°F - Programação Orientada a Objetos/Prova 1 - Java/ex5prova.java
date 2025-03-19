import java.util.Scanner;

public class ex5prova {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //declara o scanner

        int i = 0, numerohomens = 0, numeromulheres = 0; //declara as variaveis int

        double altura, pesomulheres, pesohomens, menoraltura = 999, maioraltura = 0, mediapesomulheres = 0, pesodetodasmulheres = 0; //declara as variaveis double

        String sexo;

        while (i < 20) { //aqui está 20 porque foi pedido, mas peço que deixe em um valor menor para testar :)
            System.out.println("Programa (re)começando...");
            System.out.println("Digite a altura: ");
            altura = scanner.nextDouble();
            scanner.nextLine(); //faz a quebra de linha do outro scanner

            if (altura > maioraltura) { //if para descobrir a maior altura
                maioraltura = altura;
            }

            else if (altura < menoraltura) { //if para descobrir a menor altura
                menoraltura = altura;
            }

            System.out.println("Digite o sexo (Masculino - M, Feminino - F): ");
            sexo = scanner.nextLine(); //pede o sexo do usuário

            if (sexo.equalsIgnoreCase("m")) { //se o sexo for masculino, aumenta 1 na variavel do numero de homens, e pede o peso do homem
                numerohomens++;
                System.out.println("Digite o peso: ");
                pesohomens = scanner.nextDouble();
                scanner.nextLine(); //faz a quebra de linha do outro scanner
            }
            else if (sexo.equalsIgnoreCase("f")) { //se o sexo for feminino, aumenta 1 na variavel do numero de mulheres, e pede o peso da mulher
                numeromulheres++;
                System.out.println("Digite o peso: ");
                pesomulheres = scanner.nextDouble();
                scanner.nextLine(); //faz a quebra de linha do outro scanner
                pesodetodasmulheres = pesomulheres + pesodetodasmulheres; //pesodetodasmulheres armazena o peso de todas, para no final descobrir a media dividindo pelo número de mulheres
            }
            else {
                System.out.println("Você digitou algo errado...");
            }
            i++;
        }
        mediapesomulheres = pesodetodasmulheres / numeromulheres; //calcula a média do peso de todas as mulheres
        System.out.println("Maior altura: " + maioraltura + ", Menor altura: " + menoraltura); //exibe a maior e menor altura
        System.out.println("Média do peso das mulheres: " + mediapesomulheres); //exibe a média do peso das mulheres
        System.out.println("Número de homens cadastrados: " + numerohomens + ", Número de mulheres cadastradas: " + numeromulheres); //exibe o número de homens e mulheres cadastrados
    }
}
