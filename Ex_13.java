package Ex_5_11_ao_20;
import java.util.Scanner;
public class Ex_13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.printf("Qual o valor do primeiro numero?");
		n1 = ler.nextInt();
		System.out.printf("Qual o valor do segundo numero?");
		n2 = ler.nextInt();
		System.out.printf("qual o valor do terceiro numero?");
		n3 = ler.nextInt();
		
		if (n1>n2){
			if (n1>n3) {
				System.out.printf("o maior é: %d", n1);
			}else {
				System.out.printf("o maior é: %d", n3);
			}
			
		} else if(n2>n3) {
			System.out.printf("o maior é: %d", n2);
		} else { 
			System.out.printf("o maior é: %d", n3);
		}

	}

}
