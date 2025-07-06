// Apenas positivo
import java.util.Scanner;

public class Exercicio_3_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (num <= 0) {
			System.out.print("Digite um número positivo: ");
			num = sc.nextInt();
		}
		System.out.println("Fim");

		sc.close();
	}
}
