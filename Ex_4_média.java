package Ex_4_1_ao_7;
import java.util.Scanner;
public class Ex_4_média {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double media;
		int n1,n2,n3,n4; 
		
		System.out.printf("Informe 4 valores para calcular média \n\n");	
		System.out.printf("Digite o primeiro numero:");
		n1 = ler.nextInt();
		System.out.printf("Digite o segundo numero:");
		n2 = ler.nextInt();
		System.out.printf("Digite o terceiro numero:");
		n3 = ler.nextInt();
		System.out.printf("Digite o quarto numero:");
		n4 = ler.nextInt();
		
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.printf("A média dos valores digitados é: %.2f", media);
	}

}
