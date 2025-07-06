// Nota para aprovação
import java.util.Scanner;

public class Exercicio_1_19 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota da primeira avaliação: ");
		double P1 = entrada.nextDouble();

		int media = 5; // nota de aprovação é 5
		double P2 = (media * 3 - P1) / 2;

		System.out.println("O aluno precisa tirar, no mínimo, "+P2+" na segunda avaliação para ser aprovado.");
		entrada.close();
	}
}
