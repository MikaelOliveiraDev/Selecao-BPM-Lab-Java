// Maior valor - versão 3
import java.util.Scanner;

public class Exercicio_2_06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double a = entrada.nextDouble();
		System.out.print("Digite outro número: ");
		double b = entrada.nextDouble();
		System.out.print("Digite mais um número: ");
		double c = entrada.nextDouble();

		double maior;
		if(a > b) {
			if(a > c) 
				maior = a;
			else
				maior = c;
		} else {
			if(b > c)
				maior = b;
			else 
				maior = c; 
		}
		System.out.println("O maior número é " + maior);

		entrada.close();
	}
}
