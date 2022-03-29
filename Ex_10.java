package Ex_5_8_ao_10;
import java.util.Scanner;
public class Ex_10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;

		System.out.printf("informe o primeiro numero:");
		n1 = ler.nextInt();
		System.out.printf("informe o segundo numero:");
		n2= ler.nextInt();
		
		if (n1==n2) {
			System.out.printf("Os numeros são iguais");
		} 
		else if (n1>n2) {
			System.out.printf("O numero %d é maior", n1);
		} 
		else {
			System.out.printf("O numero %d é o maior", n2);
		}
	}
}

