// Produto - versão 1
import java.util.Scanner;

public class Exercicio_4_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Colher os dados
		int[] lista = new int[20];
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Digite um número: ");
			lista[i] = sc.nextInt();
		}

		// Multiplicar e armazenar
		System.out.print("Digite a constante multiplicativa: ");
		int mult = sc.nextInt();
		for (int i = 0; i < lista.length; i++) {
			lista[i] *= mult;
		}

		// Exibir
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		
		System.out.println();
		sc.close();
	}
}
