// Teste do Triângulo
import java.util.Scanner;

public class Exercicio_2_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho de um lado: ");
		int ladoA = sc.nextInt();
		System.out.print("Digite o tamanho de outro lado: ");
		int ladoB = sc.nextInt();
		System.out.print("Digite o tamanho de mais um lado: ");
		int ladoC = sc.nextInt();
		

		if(ladoA + ladoB > ladoC 
		&& ladoB + ladoC > ladoA 
		&& ladoA + ladoC > ladoB) {
			if(ladoA != ladoB
			&& ladoA != ladoC
			&& ladoB != ladoC) {
				System.out.println("É um triângulo escarleno!");
			} else if (ladoA != ladoB
			|| ladoA != ladoC
			|| ladoB != ladoC) {
				System.out.println("É um triângulo isósceles!");
			} else {
				System.out.println("É um triângulo iquilátero!");
			}
		} else {
			System.out.print("Não é triângulo!!!");
		}

		sc.close();
	}
}
