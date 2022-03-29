package Ex_5_11_ao_20;
import java.util.Scanner;
public class Ex_15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double lado1, lado2, base;
	
	System.out.printf("informe o lado do triangulo");
	lado1 = ler.nextDouble();
	System.out.printf("informe outro lado do triangulo");
	lado2 = ler.nextDouble();
	System.out.printf("informe a base do triangulo");
	base = ler.nextDouble();
	
	
	if ((lado1 != lado2) && (lado2 != base)){
		System.out.printf("seu triangulo é escaleno");
	} else if ((lado1 == lado2) && (lado2 != base)) {
		System.out.printf("seu triangulo é isósceles");
	} else {
		System.out.printf("Seu triangulo é eqüilátero");
	}

	}

}
