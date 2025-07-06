// Tabuada parcial de um número positivo
import java.util.Scanner;

public class Exercicio_3_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número da tabuada: ");
		int x = sc.nextInt();
		while (x <= 0) {
			System.out.print("O número deve ser positivo: ");
			x = sc.nextInt();
		}

		System.out.print("Digite o número inicial: ");
		int from = sc.nextInt();
		while (from <= 0) {
			System.out.print("O número deve ser positivo: ");
			from = sc.nextInt();
		}

		System.out.print("Digite o número final: ");
		int to = sc.nextInt();
		while (to <= from) {
			System.out.print("O número final deve ser maior que o inicial");
		}

		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d\n", x, i, x * i);
		}
	}
}
