// Soma de 1 a 100
import java.util.Scanner;

public class Exercicio_3_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma += i;
		}
		System.out.println(soma);

		sc.close();
	}
}
