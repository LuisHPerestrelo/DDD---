package Ex_4_1_ao_7;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		
		System.out.printf("informe a Base do retangulo:");
		
		base = ler.nextDouble();
		
		System.out.printf("informe a altura do retangulo:");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		System.out.printf("A area do retangulo é: %.2f", area);
		
	}

}
