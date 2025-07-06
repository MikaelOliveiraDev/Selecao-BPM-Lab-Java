// Peso ideal - versão 1
import java.util.Scanner;

public class Exercicio_2_07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o peso (kg): ");
		double peso = entrada.nextDouble();
		System.out.print("Digite a altura (m): ");
		double altura = entrada.nextDouble();

		double R = peso / (altura * altura); // Relação peso altura ou IMC
		
		if(R < 20)
			System.out.println("Abaixo do peso");
		else if (R < 25)
			System.out.println("Peso ideal");
		else 
			System.out.println("Acima do peso");
		
		entrada.close();
	}
}
