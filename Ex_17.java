package Ex_5_11_ao_20;
import java.util.Scanner;
public class Ex_17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		String sexo;
		char g1='M', g2 = 'F';
		
		
		System.out.printf("Qual é seu peso?");
		peso = ler.nextDouble();
		System.out.printf("Qual sua altura?");
		altura = ler.nextDouble();
		imc = peso/(altura * altura);
		System.out.printf("Qual o seu sexo? M ou F ?");
		sexo = ler.next();
		
		switch (g1) {
		
		case 'M': 
			if (imc>=25) { 
				System.out.printf("acima do peso");
	
			} else if (imc<20) {
				System.out.printf("abaixo do peso");
				
			} else { 
				System.out.printf("Peso Ideal");
			}
			break;
		case 'F': 
			if (imc>=24) {
				System.out.printf("acima do peso");
			} else if (imc<19) {
				System.out.printf("abaixo do peso");
				
			} else {
				System.out.printf("Peso Ideal");
			}
			break;
			
		}
		
	}

}
