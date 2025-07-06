// Área do triângulo
import java.util.Scanner;

public class Exercicio_1_04 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor da base do triângulo: ");
		float base = entrada.nextFloat();
		System.out.print("Digite o valor da altura: ");
		float altura = entrada.nextFloat();
		
		float area = (base * altura) / 2;
		System.out.println("A área do triângulo é " + area);

		entrada.close();
	}
}
