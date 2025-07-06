// Peso ideal - versão 2
import java.util.Scanner;

public class Exercicio_2_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu peso (kg): ");
		int peso = sc.nextInt();
		System.out.print("Digite sua altura (m): ");
		double altura = sc.nextDouble();

		sc.nextLine();
		System.out.print("Digite seu sexo (m/f): ");
        String sexo = sc.nextLine();

		double r = peso / (altura * altura);

        switch (sexo) {
            case "f" -> {
                System.out.print("Você está ");
                if (r < 19)
                    System.out.println("abaixo do peso");
                else if (r < 24)
                    System.out.println("no peso ideal");
                else
                    System.out.println("acima do peso");
            }
            case "m" -> {
                System.out.print("Você está ");
                if (r < 20)
                    System.out.println("abaixo do peso");
                else if (r < 25)
                    System.out.println("no peso ideal");
                else
                    System.out.println("acima do peso");
            }
            default -> System.out.println("Dados de sexo incompativeis");
        }

		sc.close();
	}
}
