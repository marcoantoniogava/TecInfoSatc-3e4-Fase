import java.util.Scanner;

public class ex6lista1java
{
	public static void main(String[] args) {
	    //declara tudo
	    String nome;
	    double idade, peso, altura, massa;
	    //faz o scanner
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite o nome: ");
	    nome = entrada.nextLine();
	    System.out.print("Digite a idade: ");
	    idade = entrada.nextInt();
	    System.out.print("Digite o peso: ");
	    peso = entrada.nextDouble();
	    System.out.print("Digite a altura: ");
	    altura = entrada.nextDouble();
	    massa = peso / (altura * altura);
	    System.out.print("Olá " + nome + ", seu IMC é de: " + massa);
	}
}