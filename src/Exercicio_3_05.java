// Tabuada de um número positivo
import java.util.Scanner;

public class Exercicio_3_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite um número: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.print("O número deve ser positivo: ");
			num = sc.nextInt();
		}

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}

		sc.close();
	}
}
