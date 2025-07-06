// Menor valor
import java.util.Scanner;

public class Exercicio_2_02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double a = entrada.nextDouble();
		System.out.print("Digite outro número: ");
		double b = entrada.nextDouble();

		if(a < b) {
			System.out.println(a + " é o menor número.");
		} else {
			System.out.println(b + " é o menor número.");
		}

		entrada.close();
	}
}
