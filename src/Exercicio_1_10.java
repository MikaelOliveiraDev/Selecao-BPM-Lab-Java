// Média geométrica
import java.util.Scanner;

public class Exercicio_1_10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		float num1 = entrada.nextFloat();
		System.out.print("Digite o segundo valor: ");
		float num2 = entrada.nextFloat();

		float media = (float) Math.sqrt(num1 * num2);
		System.out.println("A média geométrica entre os valores é " + media);

		entrada.close();
	}
}