// Sexo M ou F
import java.util.Scanner;

public class Exercicio_3_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu sexo (M/F): ");
		String sexo = entrada.nextLine();

		while (!sexo.equals("M")
		&& !sexo.equals("F") 
		&& !sexo.equals("f") 
		&& !sexo.equals("m")) {
			System.out.print("Digite \"M\" para masculino ou \"F\" para feminino: ");
			sexo = entrada.next();
		}
		System.out.println("Fim");

		entrada.close();
	}
}
