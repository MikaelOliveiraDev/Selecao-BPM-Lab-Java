// Fatorial
import java.util.Scanner;

public class Exercicio_3_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) { 
			System.out.print("Digite um número: ");
			int n = sc.nextInt();
			while(n <= 0) {
				System.out.println("Erro: o número deve ser positivo.");
				System.out.print("Digite novamente: ");
				n = sc.nextInt();
			}

			int res = 1;
			for (int i = n; i > 0; i--) {
				res *= i;
			}
			System.out.println(res);

			System.out.print("Deseja fazer um novo cálculo? (S/N): ");
			sc.nextLine();
			String resposta = sc.nextLine();
			while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
				System.out.print("Digite \"S\" para \"Sim\" ou \"N\" para \"Não\": ");
				resposta = sc.nextLine();
			}

			if (resposta.equalsIgnoreCase("n")) {
				break;
			}
		}
	}
}
