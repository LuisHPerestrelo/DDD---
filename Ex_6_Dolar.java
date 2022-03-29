package Ex_4_1_ao_7;
import java.util.Scanner;
public class Ex_6_Dolar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double vd, real, qtd;
		
		System.out.printf("Digite a quantidade de dolar:");
		qtd = ler.nextDouble();
		System.out.printf("Digite a variação do dólar:");
		vd = ler.nextDouble();
		
		
		real = qtd * vd;
		
		System.out.printf("O valor em Real é: R$%.2f", real);
	}

}
