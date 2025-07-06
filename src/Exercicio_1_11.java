// Milhas vc km
import java.util.Scanner;

public class Exercicio_1_11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite as milhas marítimas: ");
		float milhas = entrada.nextFloat();
		
		float km = milhas * 1.852f;
		System.out.printf("%.2f milhas equivale a %.2f km", milhas, km);

		entrada.close();
	}
}
