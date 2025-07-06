// Lei de Ohm
import java.util.Scanner;

public class Exercicio_1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da resistência (ohms): ");
        double resistencia = sc.nextDouble();
        System.out.print("Digite o valor da corrente elétrica (A): ");
        double corrente = sc.nextDouble();

        double tensao = resistencia * corrente;
        System.out.println("A tensão é de " + tensao + " volts");

        sc.close();
    }
}
