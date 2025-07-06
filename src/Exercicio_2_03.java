// Maior valor - versão 2
import java.util.Scanner;

public class Exercicio_2_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double a = entrada.nextDouble();
		System.out.print("Digite outro número: ");
		double b = entrada.nextDouble();

		if(a == b) 
			System.out.println("Os dois números são idênticos: " + a);
		else if (a > b) 
			System.out.println(a + " é maior que " + b);
		else 
			System.out.println(b + " é maior que " + a); 
		
		entrada.close();
	}
}
