package Ex_5_11_ao_20;
import java.util.Scanner;
public class Ex_18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		double a, vi, t, v, km;
		
		System.out.printf("qual a acelera��o em m/s");
		a = ler.nextDouble();
		System.out.printf("qual a velocidade inicial em m/s");
		vi = ler.nextDouble();
		System.out.printf("qual o tempo de percurso em segundos");
		t = ler.nextDouble();
		
		v = (vi + a * t) * 3.6;
		
		
		System.out.printf("velocidade em km/s �: %.1f \n", v);
		
		if (v>120) { 
			System.out.printf("Velocidade muito r�pido");
		} else if (v<=120 && v>80) {
			System.out.printf("velocidade r�pido");
		} else if (v<=80 && v>60) {
			System.out.printf("velocidade regular");
		} else if (v<=60 && v>40) {
			System.out.printf("velocidade permitida");
		} else { 
			System.out.printf("velocidade muito lento");
		}
		
	}

}
