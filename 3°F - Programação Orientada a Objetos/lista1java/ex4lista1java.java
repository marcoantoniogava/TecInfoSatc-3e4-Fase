import java.util.Scanner;

public class ex4lista1java
{
	public static void main(String[] args) {
	    //declara tudo
	    String nome, cargo;
	    double salario, novosalario;
	    //faz o scanner
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite nome: ");
	    nome = entrada.nextLine();
	    System.out.print("Digite cargo: ");
	    cargo = entrada.nextLine();
	    System.out.print("Digite o salario: ");
	    salario = entrada.nextInt();
	    novosalario = salario * 1.05;
	    System.out.print("Novo salário: " + novosalario);
	}
}