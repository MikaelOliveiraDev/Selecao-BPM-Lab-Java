// Bergamaschi

public class Exercicio_3_09 {
	public static void main(String[] args) {
		int atual = 1;
		int ultimo = 1;
		int penultimo = 1;
		int antepenultimo = 0;

		for (int i = 0; i < 20; i++) {
			if (i < 3) {
				System.out.print(1 + " ");
			} else {
				antepenultimo = penultimo;
				penultimo = ultimo;
				ultimo = atual;
				atual = ultimo + penultimo + antepenultimo;
				System.out.print(atual + " ");
			}
		}
		System.out.println();
	}
}
