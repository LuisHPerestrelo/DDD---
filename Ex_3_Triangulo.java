package Ex_4_1_ao_7;
import java.util.Scanner;
public class Ex_3_Triangulo {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double area, altura, base;
	
	
	System.out.printf("Informe a base do triangulo:");
	base = ler.nextDouble();
	System.out.printf("informe a altura do triangulo:");
	altura = ler.nextDouble();
	
	area = base * altura / 2;
	
	System.out.printf("a area do triangulo é: %.2f", area);

	}

}
