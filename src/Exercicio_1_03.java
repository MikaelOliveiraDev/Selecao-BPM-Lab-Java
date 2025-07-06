// Área do quadrado - versão 2

import java.util.Scanner;

public class Exercicio_1_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor da diagonal: ");
		float diagonal = entrada.nextFloat();
		
		float area = (diagonal * diagonal) / 2;
		System.err.println("A área do quadrado é " + area);

		entrada.close();
	}
}
