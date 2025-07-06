// Fórmula de Bhaskara
import java.util.Scanner;

public class Exercicio_2_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("De acordo com a fórmula ax² + bx + c:");
		System.out.print("Digite o valor de a: ");
		int a = sc.nextInt();
		System.out.print("Digite o valor de b: ");
		int b = sc.nextInt();
		System.out.print("Digite o valor de c: ");
		int c = sc.nextInt();

		int delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("Delta negativo - Nenhuma raiz");
		} else {
			double x1 = (-b + Math.sqrt(delta)) / 2 * a;
			double x2 = (-b - Math.sqrt(delta)) / 2 * a;
			
			if (x1 == x2) {
				System.out.println("Duas raízes iguais: " + x2);
			} else {
				System.out.printf("Duas raízes: %f e %f", x1, x2);
			}
		}

		sc.close();
	}
}
