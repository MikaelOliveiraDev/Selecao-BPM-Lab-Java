// Graus vs Fahrenheit
import java.util.Scanner;

public class Exercicio_1_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em grau Celsius: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Em Fahrenheit: " + fahrenheit);

        entrada.close();
    }
}
