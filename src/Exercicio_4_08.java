// Ordem crescente
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_4_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] valores = new int[20];
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite um número: ");
			valores[i] = sc.nextInt();
		}

		Arrays.sort(valores);

		for (int i = 0; i < 20; i++) {
			System.out.print(valores[i] + " ");
		}
		
		System.out.println();
		sc.close();
	}
}
