// Aluno aprovado
import java.util.Scanner;

public class Exercicio_2_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		float p1 = sc.nextInt();
		float p2 = sc.nextInt();

		double media = (p1 + p2 * 2) / 3;
		
		if (media < 5) 
			System.out.println("Reprovado");
		else 
			System.out.println("Aprovado");
		
		sc.close();
	}
}
