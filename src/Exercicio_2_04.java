// Terreno grande
import java.util.Scanner;

public class Exercicio_2_04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o tamanho da largura do terreno: ");
		int largura = entrada.nextInt();
		System.out.print("Digite o tamanho do comprimento do terreno: ");
		int comprimento = entrada.nextInt();

		int area = largura * comprimento;

		if(area > 100)
			System.out.println("Terreno grande");
		
		entrada.close();
	}
}
