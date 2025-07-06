// Segundo maior que primeiro
import java.util.Scanner;

public class Exercicio_3_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		int num2 = sc.nextInt();

		while (num2 <= num1) {
			System.out.println("O segundo deve ser maior que o primeiro.");
			System.out.print("Digite novamente: ");
			num2 = sc.nextInt();
		}
		System.out.println("Fim");

		sc.close();
	}
}
