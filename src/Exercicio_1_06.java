// Área do círculo
import java.util.Scanner;

public class Exercicio_1_06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do diâmetro do círculo: ");
		float diametro = entrada.nextFloat();
		float raio = diametro / 2;
		float pi = 3.1415f;
		float area = pi * raio * raio;

		System.out.println("A área do circulo é "+ area);
	}
}
