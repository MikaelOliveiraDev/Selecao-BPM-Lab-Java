// Compra e troco
import java.util.Scanner;

public class Exercicio_1_18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Obter preços
		System.out.println("Digite o valor de 5 produtos:");
		System.out.print("Produto 1: ");
		double p1 = entrada.nextDouble();
		System.out.print("Produto 2: ");
		double p2 = entrada.nextDouble();
		System.out.print("Produto 3: ");
		double p3 = entrada.nextDouble();
		System.out.print("Produto 4: ");
		double p4 = entrada.nextDouble();
		System.out.print("Produto 5: ");
		double p5 = entrada.nextDouble();
		
		double soma = p1 + p2 + p3 + p4 + p5;
		System.out.println("O somatório dos itens é: " + soma);

		// Pagamento e troco
		System.out.print("Digite o valor pago: ");
		double pago = entrada.nextDouble();
		double troco = pago - soma;
		System.out.println("O troco é: " + troco);

		entrada.close();
	}
}
