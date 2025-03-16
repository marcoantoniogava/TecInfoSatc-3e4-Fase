import java.util.Scanner;

public class ex5lista1java
{
	public static void main(String[] args) {
	    //declara tudo
	    double base, altura, area;
	    //faz o scanner
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite a base: ");
	    base = entrada.nextInt();
	    System.out.print("Digite a altura: ");
	    altura = entrada.nextInt();
	    area = (base * altura) / 2;
	    System.out.print("Área: " + area);
	}
}