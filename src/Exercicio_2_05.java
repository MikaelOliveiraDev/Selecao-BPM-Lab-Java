// Terreno grande vs Terreno pequeno
import java.util.Scanner;

public class Exercicio_2_05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o tamanho da largura o terreno: ");
		int largura = entrada.nextInt();
		System.out.print("Digite o tamanho do comprimento do terreno: ");
		int comprimento = entrada.nextInt();

		int area = largura * comprimento;
		
		System.out.println("A área do terreno é "+ area);
		if(area > 100) 
			System.out.println("Terreno grande");
		else
			System.out.println("Terreno pequeno");
		
		entrada.close();
	}
}
