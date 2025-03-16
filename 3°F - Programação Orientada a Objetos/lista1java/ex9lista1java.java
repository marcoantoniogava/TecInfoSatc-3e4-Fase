import java.util.Scanner;

public class ex9lista1java
{
	public static void main(String[] args) {
	    //declara tudo
	    double valorconsumidor, valordefabrica;
	    //faz o scanner
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite o valor de fábrica do carro: ");
	    valordefabrica = entrada.nextDouble();
	    valorconsumidor = (valordefabrica * 1.55);
	    System.out.println("Valor final do carro é: " + valorconsumidor);
	}
}