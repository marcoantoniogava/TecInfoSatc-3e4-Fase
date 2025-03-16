//Os gestores da sua empresa resolveram dar um aumento de salário aos seus colaboradores,
//lhe contrataram para desenvolver o programa que calcula os reajustes.
//Portanto, faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
//baseado no salário atual:

//Salários até R$ 280,00 (incluindo), receberão aumento de 20%
//Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
//Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
//Salários de R$ 1500,00 em diante, receberão aumento de 5% 

//Após o aumento ser realizado, informe na tela:
//O salário antes do reajuste;
//O percentual de aumento aplicado;
//O valor do aumento;
//O novo salário, após o aumento;

import java.util.Scanner;

public class ex5lista2java
{
	public static void main(String[] args) {
	    
	    double salario, novosalario = 0, valoraumento = 0;
	    int percentual = 0;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite o salário: ");
	    salario = scanner.nextDouble();

	    if (salario > 0 && salario <= 280) {
	        novosalario = salario * 1.2;
	        valoraumento = novosalario - salario;
	        percentual = 20;
	    }
	    else if (salario > 280 && salario <= 700) {
	        novosalario = salario * 1.15;
	        valoraumento = novosalario - salario;
	        percentual = 15;
	    }
	    else if (salario > 700 && salario <= 1500) {
	        novosalario = salario * 1.1;
	        valoraumento = novosalario - salario;
	        percentual = 10;
	    }
	    else if (salario > 1500) {
	        novosalario = salario * 1.05;
	        valoraumento = novosalario - salario;
	        percentual = 5;
	    }
	    else {
	        System.out.print("Número inválido!");
	    }
	    
	    System.out.println("Salário antes do reajuste: " + salario);
	    System.out.println("Percentual do aumento aplicado: " + percentual + "%");
	    System.out.println("Valor do aumento: " + valoraumento);
	    System.out.println("Novo salário, após o aumento: " + novosalario);
	    
	}
}