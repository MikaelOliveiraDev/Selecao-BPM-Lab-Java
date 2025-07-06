// Ordem inversa
import java.util.Scanner;

public class Exercicio_4_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] lista = new int[10];

		for (int i = 0; i < lista.length; i++) {
			System.out.print("Digite um número: ");
			lista[i] = sc.nextInt();
		}

		System.out.print("Os números na ordem inversa: ");
		for (int i = lista.length - 1; i >= 0; i--) {
			System.out.print(lista[i]+" ");
		}
		System.out.println();

		sc.close();
	}
}
