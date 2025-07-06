// N número da sequência - versão 1
import java.util.Scanner;

public class Exercicio_3_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número (0 < n < 100): ");
		int n = sc.nextInt();
		while (n <= 0 || n > 100) {
			System.out.println("Erro: o número deve ser positivo e menor que 100(cem).");
			System.out.println("Digite novamente: ");
			n = sc.nextInt();
		}

		int soma = 2;
		for (int i = 3; i < n*2 + 2; i++) {
			if (i % 2 == 1) {
				System.out.print(soma+" ");
				soma += i;
			}
		}

		System.out.println();
		sc.close();
	}
}
