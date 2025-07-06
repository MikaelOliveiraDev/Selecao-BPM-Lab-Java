// Mais novos primeiro
import java.util.Scanner;

public class Exercicio_4_11 {
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

		// Ordenar
		for (int divI = 0; divI < idade.length; divI++) {
			int menorI = divI;
			for (int i = divI + 1; i < idade.length; i++) {
				if (idade[i] < idade[menorI]) {
					menorI = i;
				}
			}

			int bufferIdade = idade[divI];
			idade[divI] = idade[menorI];
			idade[menorI] = bufferIdade;

			String bufferSexo = sexo[divI];
			sexo[divI] = sexo[menorI];
			sexo[menorI] = bufferSexo;

			String bufferNome = nomes[divI];
			nomes[divI] = nomes[menorI];
			nomes[menorI] = bufferNome;
		}

		System.out.println("Exibindo dados...");
		for (int i = 0; i < idade.length; i++) {
			System.out.printf("%d %s %s\n", idade[i], sexo[i], nomes[i]);
		}

		sc.close();
	}
}
