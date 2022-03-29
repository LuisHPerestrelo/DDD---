package Ex_4_1_ao_7;
import java.util.Scanner;
public class Ex_5_Grau_Cel {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double f;
		int gc;
		
		System.out.printf("Digite o graus Celsius: ");
		gc = ler.nextInt();
		
		f = gc * 1.8 + 32;
		
		System.out.printf("%d° Equivale a %.1f° Fahrenheit", gc, f);
	}

}
