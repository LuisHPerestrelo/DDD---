package Ex_5_8_ao_10;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, max;
		
		System.out.printf("Informe o primeiro numero:");
		n1 = ler.nextInt();
		
		System.out.printf("informe o segundo numero:");
		n2 = ler.nextInt();
		
		if (n1>n2){
			System.out.printf(" o numero %d é o maior", n1);
		}
			else{
				System.out.printf("o numero %d é o maior", n2);
				
			}
			
		}
		
	}


