// Área do quadrado - versão 1

import java.util.Scanner;

public class Exercicio_1_02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor da aresta: ");
		int aresta = entrada.nextInt();
		int area = aresta * aresta;
		System.out.println("A área do quadrado é " + area);

		entrada.close();
	}	
}
