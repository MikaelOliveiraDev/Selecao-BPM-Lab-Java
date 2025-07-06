// Área da retângulo
import java.util.Scanner;

public class Exercicio_1_01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor da base: ");
		int base = entrada.nextInt();
		System.out.println("Digite o valor da altura: ");
		int altura = entrada.nextInt();

		int area = base * altura;
		System.out.println("A área do retâgulo é " + area);

		entrada.close();
	}
}
