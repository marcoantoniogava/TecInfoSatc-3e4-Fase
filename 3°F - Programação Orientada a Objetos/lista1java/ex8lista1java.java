import java.util.Scanner;

public class ex8lista1java
{
	public static void main(String[] args) {
	    //declara tudo
	    String nome;
	    double numerohoras, valorhoras, salariobruto, salariofinal;
	    //faz o scanner
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite o nome: ");
	    nome = entrada.nextLine();
	    System.out.print("Digite o numero de horas trabalhadas: ");
	    numerohoras = entrada.nextDouble();
	    System.out.print("Digite o valor de cada hora trabalhada: ");
	    valorhoras = entrada.nextDouble();
	    salariobruto = numerohoras * valorhoras;
	    salariofinal = salariobruto * 0.98;
	    System.out.println("Olá " + nome + ", seu salário final é de: " + salariofinal);
	}
}