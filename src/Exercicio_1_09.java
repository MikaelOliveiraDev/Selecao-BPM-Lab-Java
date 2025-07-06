// Média aritimética
import java.util.Scanner;

public class Exercicio_1_09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float soma = 0;
		byte i = 0;
		while (i < 4) {
			i++;
			System.out.print("Digite o " + i + "° número: ");
			soma += entrada.nextFloat();
		}

		float media = soma / 4;
		System.out.println("A média entre os números é " + media);

		entrada.close();
	}
}
