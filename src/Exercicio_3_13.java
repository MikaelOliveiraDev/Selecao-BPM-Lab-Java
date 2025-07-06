// Maior, soma e média
import java.util.Scanner;

public class Exercicio_3_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quant = 10; //quantidade de números que serão solicitados
		int soma = 0;
		int maior = 0;
		for (int i = 0; i < quant; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();

			while (num <= 0) {
				System.out.println("Erro: o número deve ser positivo");
				System.out.print("Digite novamente: ");
				num = sc.nextInt();
			}

			soma += num;
			if (num > maior) {
				maior = num;
			}
		}

		System.out.println("A soma dos números é "+soma);
		System.out.println("O maior número é " + maior);
		System.out.println("A média é "+ (soma / quant));
	}
}
