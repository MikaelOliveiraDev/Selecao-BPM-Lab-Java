// Cotação do dolar

import java.util.Scanner;

public class Exercicio_1_15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a cotação atual do dolar em reais: BRL ");
		float cotacao = entrada.nextFloat();
		System.out.print("Quantos dolares quer converter? USD ");
		float dolares = entrada.nextFloat();

		float reais = cotacao * dolares;

		System.out.println("O valor em reais é "+ reais);

		entrada.close();
	}
}
