// Ordem alfabética
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_4_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[20];

		System.out.println("Digite o nome das pessoas: ");
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Pessoa "+(i+1)+": ");
			nomes[i] = sc.nextLine();
		}

		Arrays.sort(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}

		sc.close();
	}
}
