import java.util.Scanner;

public class Exercicio_5_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String frase = sc.nextLine();
        String[] palavras = frase.split(" ");

        int palavrasA = 0;
        int palavrasO = 0;
        for (String palavra : palavras) {
            boolean encontrouA = false;
            boolean encontrouO = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (!encontrouA) {
                    encontrouA = palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A';
                    if (encontrouA) {
                        palavrasA++;
                    }
                }
                if (!encontrouO) {
                    encontrouO = palavra.charAt(i) == 'o' || palavra.charAt(i) == 'O';
                    if (encontrouO) {
                        palavrasO++;
                    }
                }
                if (encontrouA && encontrouO) {
                    break;
                }
            }
        }
        System.out.println("Frase Lida: " + frase);
        System.out.println("\tQuantidade de Palavras com A: " + palavrasA);
        System.out.println("\tQuantidade de Palavras com O: " + palavrasO);

        sc.close();
    }
}
