// Produto da Matriz - versão 2
import java.util.Scanner;

public class Exercicio_4_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Colher os dados
		int[] lista = new int[20];
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Digite um número: ");
			lista[i] = sc.nextInt();
		}

		System.out.print("Digite um número multiplicador: ");
		int mult = sc.nextInt();

		// Multiplicar e armazenar
		int[] listaMult = new int[lista.length];
		for (int i = 0; i < listaMult.length; i++) {
			listaMult[i] = lista[i] * mult;
		}

		// Exibir
		for (int i : lista) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : listaMult) {
			System.out.print(i+" ");
		}
		System.out.println();

		sc.close();
	}
}
