import java.util.Scanner;

public class ex1lista1java
{
	public static void main(String[] args) {
	    String nome;
	    String endereco;
	    String bairro;
	    String cidade;
	    String estado;
	    int fone;
	    
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite nome: ");
	    nome = entrada.nextLine();
	    System.out.print("Digite endereço: ");
	    endereco = entrada.nextLine();
	    System.out.print("Digite bairro: ");
	    bairro = entrada.nextLine();
	    System.out.print("Digite cidade: ");
	    cidade = entrada.nextLine();
	    System.out.print("Digite estado: ");
	    estado = entrada.nextLine();
	    System.out.print("Digite fone: ");
	    fone = entrada.nextInt();
	}
}