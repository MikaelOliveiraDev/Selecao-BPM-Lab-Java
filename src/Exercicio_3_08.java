// Fibonnacci

public class Exercicio_3_08 {
	public static void main(String[] args) {
		int atual = 0;
		int ultimo = 0;
		int penultimo = 1;

		for (int i = 0; i < 30; i++) {
			atual = ultimo + penultimo;
			System.out.print(atual + " ");

			penultimo = ultimo;
			ultimo = atual;
		}
	}
}
