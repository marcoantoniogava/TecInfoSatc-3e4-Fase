public class PrimeiraAtividadeDeJava
{
	public static void main(String[] args) {
	    //criar as temperaturas
	    double celsius, fah, kelvin, re, ra;
	    
	    //valor inicial da temperatura
	    celsius = 30;
	    
	    //calcular as formulas
	    fah = celsius * 1.8 + 32;
	    kelvin = celsius + 273.15;
	    re = celsius * 0.8;
	    ra = celsius * 1.8 + 32 + 459.67;
	    
	    //mostrar as temperaturas convertidas
	    System.out.println("Fahrenheit: " + fah);
	    System.out.println("Kelvin: " + kelvin);
	    System.out.println("Réaumur: " + re);
	    System.out.println("Rankine: " +ra);
	}
}