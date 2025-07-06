// Funções trigonométricas
import java.util.Scanner;

public class Exercicio_1_16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um ângulo: ");
		float angulo = entrada.nextInt();
		angulo *= Math.PI / 180; // Converte para radianos

		double seno = Math.sin(angulo);
		double coss = Math.cos(angulo);
		double tang = Math.tan(angulo);
		double seca = 1 / coss;

		System.out.println("Seno:     "+seno);
		System.out.println("Cosseno:  "+coss);
		System.out.println("Tangente: "+tang);
		System.out.println("Secante:  "+seca);

		entrada.close();
	}
}
