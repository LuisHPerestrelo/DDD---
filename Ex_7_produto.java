package Ex_4_1_ao_7;
import java.util.Scanner;
public class Ex_7_produto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5, total, pgt, troco;
		
		
		System.out.printf("Digite o valor do primeiro produto:");
		p1 = ler.nextDouble();
		System.out.printf("Digite o valor do segundo produto:");
		p2 = ler.nextDouble();
		System.out.printf("Digite o valor do terceiro produto:");
		p3 = ler.nextDouble();
		System.out.printf("Digite o valor do quarto produto:");
		p4 = ler.nextDouble();
		System.out.printf("Digite o valor do quinto produto:");
		p5 = ler.nextDouble();
		
		total = p1 + p2 + p3 + p4 + p5;
		System.out.printf("O valor total dos produtos é: R$%.2f\n", total);
		System.out.printf("Digite o valor pago:\n");
		pgt = ler.nextDouble();
		
		troco = pgt - total;
		
		System.out.printf("Valor do troco R$%.2f", troco);
		

	}

}
