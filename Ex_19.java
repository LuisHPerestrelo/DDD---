package Ex_5_11_ao_20;
import java.util.Scanner;
public class Ex_19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.printf("qual foi a primeira nota?");
		n1 = ler.nextDouble();
		
		System.out.printf("qual foi a segunda nota?");
		n2 = ler.nextDouble();
		
		media = (n1 + 2*n2) / 3;
		
		if (media>=5) {
			System.out.printf("Aprovado");
		} else { 
			System.out.printf("Reprovado");
		}
		
		
	}

}
