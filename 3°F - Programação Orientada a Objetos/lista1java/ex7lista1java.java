import java.util.Scanner;

public class ex7lista1java
{
	public static void main(String[] args) {
	    //declara tudo
	    double lugares, valor, sessoes, semana, mes, totaldia, totalsemana, totalmes;
	    lugares = 80;
	    valor = 20;
	    sessoes = 3;
	    semana = 7;
	    mes = 30;
	    totaldia = (lugares * valor) * sessoes;
	    totalsemana = totaldia * semana;
	    totalmes = totaldia * mes;
	    System.out.println("Faturamento do dia: " + totaldia);
	    System.out.println("Faturamento da semana: " + totalsemana);
	    System.out.println("Faturamento do mês: " + totalmes);
	}
}