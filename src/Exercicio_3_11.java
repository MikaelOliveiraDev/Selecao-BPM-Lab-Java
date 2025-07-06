// N números da sequência - versão 2
import java.util.Scanner;

public class Exercicio_3_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número (0 < n < 50): ");
		int n = sc.nextInt();
		while (n <= 0 || n > 50) {
			System.out.println("Erro: o número deve ser positivo e menor que 50(cinquenta).");
			System.out.print("Digite novamente: ");
			n = sc.nextInt();
		}

		for (double i = 1; i <= n; i++) {
			System.out.printf("%.0f / %.0f = %.2f\n", i, i+1, i / (i + 1));
		}

		sc.close();
	}
}
