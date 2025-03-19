import java.util.Scanner;

public class ex4prova {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //declara o scanner

        double raio, perimetro, area;

        System.out.println("Digitea medida do raio do círculo em metros: ");
        raio = scanner.nextDouble();
        scanner.nextLine(); //faz a quebra de linha do outro scanner

        perimetro = 2 * 3.14159 * raio;//calcula o perimetro

        area = 3.14159 * (raio * raio);//calcula a area, raio * raio = raio ao quadrado

        System.out.println("Perímetro do círculo: " + perimetro); //exibe o perimetro e a area do circulo
        System.out.println("Área do círculo: " + area);
    }
}
