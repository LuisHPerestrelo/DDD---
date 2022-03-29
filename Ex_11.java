package Ex_5_11_ao_20;
import java.util.Scanner;
public class Ex_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		
		System.out.printf("informe a base do retangulo");
		base = ler.nextDouble();
		System.out.printf("informe a altura do retangulo");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		if (area>100) {
			System.out.printf("Terreno grande", area);
		}
		
	}

}
