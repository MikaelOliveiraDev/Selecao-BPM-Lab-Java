//Listando as mulheres
import java.util.Scanner;

public class Exercicio_4_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[20];
		String[] sexo = new String[20];
		int[] idade = new int[20];

		// Colher os dados
		for (int i = 0; i < 20; i++) {
			System.out.println("Insira os dados da pessoa "+ (i+1));
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
		System.out.println("\nListando mulheres:");
		for (int i = 0; i < 20; i++) {
			if(sexo[i].equalsIgnoreCase("F"))
				System.out.printf("%s %s %d anos.\n", nomes[i], sexo[i], idade[i]);
			
		}

		sc.close();
	}
}
