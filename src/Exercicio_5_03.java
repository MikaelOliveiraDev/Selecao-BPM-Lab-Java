// Frase invertida
import java.util.Scanner;

public class Exercicio_5_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        String[] palavras = frase.split(" ");
        String fraseInvertida = "";

        // Contar as palavras q começam com a ou A
        int quant = 0;
        for (String palavra : palavras)
            if (palavra.charAt(0) == 'a' || palavra.charAt(0) == 'A')
                quant++;

        // Inverter a frase
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        System.out.println("Frase Lida: "+frase);
        System.out.println("Frase Invertida: "+fraseInvertida);
        System.out.println("Quantidade de Palavras: "+quant);
        sc.close();
    }
}
