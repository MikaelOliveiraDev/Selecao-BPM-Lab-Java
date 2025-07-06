// Maior, menor, soma e média, positivos e negativos - versão 2
import java.util.Scanner;

public class Exercicio_3_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean repetir = true;
		while (repetir) {
			System.out.print("Digite a quantidade de números (max 20): ");
			int quant = sc.nextInt();
			while (quant <= 0 || quant > 50) {
				System.out.println("Erro: o número deve ser positivo e menor que 20(vinte).");
				System.out.print("Digite novamente: ");
				quant = sc.nextInt();
			}

				int maior;
				int menor;
				int soma;
				int positivos = 0; // a quantidade de valores q são positivos
				int negativos = 0;

				// Inicialização
				System.out.print("Digite um número: ");
				int num = sc.nextInt();
				maior = num;
				menor = num;
				if (num > maior) maior = num;
				else if (num < menor) menor = num;

				soma = num;

				if (num > 0) positivos++;
				else if (num < 0) negativos++; 

				for (int i = 1; i < quant; i++) {
			System.out.print("Digite mais um número: ");
			num = sc.nextInt();

			if (num > maior) maior = num;
			else if (num < menor) menor = num;

			soma += num;

			if (num > 0) positivos++;
			else if (num < 0) negativos++; 
		}

		System.out.println("O maior valor é "+maior);
		System.out.println("O menor valor é "+menor);
		System.out.println("A soma dos valores é "+soma);
		System.out.println("A média entre os valores é "+(soma / quant));
		System.out.println("A porcentagem de valores positivos é "+(positivos / quant * 100)+"%");
		System.out.println("A porcentagem de valores negativos é "+(negativos / quant * 100)+"%");

		System.out.print("\nDeseja executar novamente? (S/N): ");
		String res = sc.nextLine();
		while (!(res.equals("S") || res.equals("N"))) {
			System.out.print("Digite \"S\" para \"Sim\" ou \"N\" para \"Não\": ");
			res = sc.nextLine();
		}
		if (res.equals("S"))
			repetir = true;
		else 
			repetir = false;
	}
	
	sc.close();
	}	
}
