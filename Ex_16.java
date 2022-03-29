package Ex_5_11_ao_20;
import java.util.Scanner;
public class Ex_16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.printf("informe o primeiro valor:");
		n1 = ler.nextInt();
		System.out.printf("informe o segunto valor:");
		n2 = ler.nextInt();
		System.out.printf("informe o terceiro valor:");
		n3 = ler.nextInt();
		
				
		if (((n3*n3) == (n1 * n1) + (n2 * n2))) {
			System.out.printf("forma um triangulo retangular");
		} else if (((n2*n2) == (n1 * n1) + (n3 * n3))) {
			System.out.printf("forma um triangulo retangular");
			
		} else if (((n1*n1) == (n2 * n2) + (n3 * n3))) {
			System.out.printf("forma um triangulo retangular");
			
		} else { 
			System.out.printf("não forma triangulo retangular");
		}
		
		

	}

}
