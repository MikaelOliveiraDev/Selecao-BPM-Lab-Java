// Volume do cone
import java.util.Scanner;

public class Exercicio_1_07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor da altura do cone: ");
		float altura = entrada.nextFloat();
		System.out.print("Digite o valor do raio da base: ");
		float raio = entrada.nextFloat();
		
		double volume = altura * Math.PI * raio * raio / 3;
		System.out.println("O volume do cone é " + volume);
		
		entrada.close();
	}
}
