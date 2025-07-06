// Maiores de 18 - versão 2
import java.util.Scanner;

public class Exercicio_4_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[20];
		String[] sexo = new String[20];
		int[] idade = new int[20];

		// Colher os dados
		for (int i = 0; i < 20; i++) {
			System.out.println("Insira os dados da pessa "+ (i+1));
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			
			System.out.print("Sexo: ");
			sexo[i] = sc.nextLine();
			while (!(sexo[i].equalsIgnoreCase("F") || sexo[i].equalsIgnoreCase("M"))) {
				System.out.print("Digite M ou F: ");
				sexo[i] = sc.nextLine();
			}

			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			while (idade[i] <= 0) {
				System.out.print("Digite um número positivo: ");
				idade[i] = sc.nextInt();
			}

			sc.nextLine();
		}

		// Listar
		int quant = 0;
		System.out.println("\nListando os de maior...");
		for (int i = 0; i < 20; i++) {
			if (idade[i] >= 18) {
				System.out.printf("%s %s %d anos\n", nomes[i], sexo[i], idade[i]);
				quant++;
			}
		}
		double porct = (double) quant / 20.0 * 100;
		System.out.println("Total de maiores: "+quant);
		System.out.println("Equivalente a "+porct+"%");

		sc.close();
	}
}
