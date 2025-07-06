import java.util.Scanner;

public class Exercicio_1_17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número qualquer X: ");
		double x = entrada.nextDouble();
		System.out.print("Digite um número qualquer Y: ");
		double y = entrada.nextDouble();

		double potencia = Math.pow(x, y);
		System.out.println(x + " elevado a "+y+" é igual a " + potencia);

		
		System.out.print("Digite um número qualquer N: ");
		double n = entrada.nextDouble();

		double exp = Math.exp(n);
		double log = Math.log(n);
		System.out.println("euler elevado a N é igual a " + exp);
		System.out.println("O logaritmo natural de N é " + log);

		entrada.close();
	}

}
