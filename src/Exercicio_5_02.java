// Quantidade de palavras
import java.util.Scanner;

public class Exercicio_5_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();

        String[] palavras = frase.split("\\W+");

        System.out.println("Frase Lida: " + frase);
        System.out.println("Quantidade de Palavras: " + palavras.length);
    }
}
