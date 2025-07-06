// Volume da esfera
import java.util.Scanner;

public class Exercicio_1_05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do diâmetro da esfera: ");
		float diametro = entrada.nextFloat();
		float raio = diametro / 2; 
		float pi = 3.1415f;

		float volume = 4 * pi * raio * raio * raio / 3;
		System.out.println("O volume da esfera é " + volume);

		entrada.close();
	}
}
