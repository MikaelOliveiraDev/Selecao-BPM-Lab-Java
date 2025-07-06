// Volume do cubo e da esfera
import java.util.Scanner;

public class Exercicio_1_08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float r, a; // raio da esfera e aresta do cubo
		float volumeEsfera, volumeCubo, volumeLivre;
		float PI = (float) Math.PI;

		System.out.print("Digite o valor do raio da efera: ");
		r = entrada.nextFloat();
		System.out.print("Digite o valor da aresta do cubo: ");
		a = entrada.nextFloat();

		volumeEsfera = 4 * PI * r*r*r / 3;
		volumeCubo = a * a * a;
		volumeLivre = volumeCubo - volumeEsfera;

		System.out.println("O volume livre é " + volumeLivre);

		entrada.close();
	}
}
