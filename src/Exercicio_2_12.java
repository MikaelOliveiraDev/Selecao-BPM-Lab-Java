// Velocidade permitida
import java.util.Scanner;

public class Exercicio_2_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a velocidade inicial (m/s): ");
		int vi = sc.nextInt();
		System.out.print("Digite a aceleração (m/s²): ");
		int a = sc.nextInt();
		System.out.print("Digite o tempo de percurso (s): ");
		int t = sc.nextInt();

		double vf = vi + a * t;
		vf *= 3.6; // converter para km/h

		if (vf <= 40) 
			System.out.println("Veículo muito lento");
		else if (vf <= 60) 
			System.out.println("Velocidade permitida");
		else if (vf <= 120)
			System.out.println("Veículo rápido");
		else 
			System.out.println("Veículo muito rápido");
		
		sc.close();
	}
}
