// Maior valor - versão 1
import java.util.Scanner;

public class Exercicio_2_01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double a = entrada.nextDouble();
		System.out.print("Digite outro número: ");
		double b = entrada.nextDouble();

		if(a > b) {
			System.out.println(a + " é o maior número");
		} else {
			System.err.println(b + " é o maior número");
		}

		entrada.close();
	}
}
