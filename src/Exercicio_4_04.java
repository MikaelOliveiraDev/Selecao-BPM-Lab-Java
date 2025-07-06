// Pesquisando valor
import java.util.Scanner;

public class Exercicio_4_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Colher os dados
		System.out.print("Digite a quantidade de valores: ");
		int quant = sc.nextInt();
		while (quant <= 0 || quant > 20) {
			System.out.println("Erro: a quantidade deve ser positiva e menor que 20.");
			System.out.print("Digite novamente: ");
			quant = sc.nextInt();
		}
		int[] lista = new int[quant];
		for (int i = 0; i < quant; i++) {
			System.out.print("Digite um número: ");
			lista[i] = sc.nextInt();
		}

		// Consulta
		while (true) {
			System.out.print("Digite um número para buscar: ");
			int busca = sc.nextInt();
			boolean encontrado = false;
			for (int i = 0; i < quant; i++) {
				if (lista[i] == busca) {
					System.out.println("Valor encontrado na posição "+(i+1));
					encontrado = true;
					break;
				}
			}
			if (!encontrado)
				System.out.println("Valor não encontrado!");
		
			sc.nextLine();
			System.out.print("Deseja buscar outro valor? (S/N): ");
			String resposta = sc.nextLine();
			while (!(resposta.equals("S") || resposta.equals("N"))) {
				System.out.print("Responda com S ou N: ");
				resposta = sc.nextLine();
			}
			if (resposta.equals("N"))
				break;
		}

		sc.close();
	}
}
