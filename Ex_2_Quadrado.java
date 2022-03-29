package Ex_4_1_ao_7;
import java.util.Scanner;
public class Ex_2_Quadrado {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double lado, area;
	
	
	System.out.printf("Digite um dos lados do quadrado:");
	lado = ler.nextDouble();
	
	area = lado * lado;
	System.out.printf("A area do quadrado é: %.2f", area);

	}

}
