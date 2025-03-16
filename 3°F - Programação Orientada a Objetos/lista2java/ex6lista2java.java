//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
//que depende do salário bruto (conforme tabela abaixo) e 10% para o INSS e que o FGTS corresponde a 11% do Salário Bruto,
//mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos.
//O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. Desconto do IR:

//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20%

//Mostrar na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.


import java.util.Scanner;

public class ex6lista2java
{
	public static void main(String[] args) {
	    
	    double salariobruto = 0, salarioliquido = 0, valorhoras, quanthoras, imposto = 0, inss = 0, fgts = 0;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite o valor da hora: ");
	    valorhoras = scanner.nextDouble();
	    System.out.print("Digite a quantidade de horas trabalhadas: ");
	    quanthoras = scanner.nextDouble();
	    
	    salariobruto = valorhoras * quanthoras;

	    if (salariobruto > 0 && salariobruto <= 900) {
	        imposto = 0;
	    }
	    else if (salariobruto > 900 && salariobruto <= 1500) {
	        imposto = (salariobruto * 0.05);
	    }
	    else if (salariobruto > 1500 && salariobruto <= 2500) {
	        imposto = (salariobruto * 0.1);
	    }
	    else if (salariobruto > 2500) {
	        imposto = (salariobruto * 0.2);
	    }
	    else {
	        System.out.print("Erro!");
	    }
	    
	    fgts = salariobruto * 0.11;
	    
	    inss = salariobruto * 0.1;
	    salarioliquido = salariobruto - (imposto + inss);
	    
	    System.out.println("Salário bruto: " + salariobruto);
	    System.out.println("Imposto de renda: " + imposto);
	    System.out.println("INSS: " + inss);
	    System.out.println("FGTS: " + fgts);
	    System.out.println("Salário líquido: " + salarioliquido);
	    
	}
}