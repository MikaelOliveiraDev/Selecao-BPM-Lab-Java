import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_5_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma frase: ");
        String frase = sc.nextLine();
        String fraseInversa = "";

        int upper = 0;
        int lower = 0;
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < 26; j++) {
                char letraUpper = (char) ('A' + j);
                char letraLower = (char) ('a' + j);

                if (frase.charAt(i) == letraUpper) {
                    fraseInversa += letraLower;
                    upper++;
                } else if (frase.charAt(i) == letraLower) {
                    fraseInversa += letraUpper;
                    lower++;
                }
            }
        }
        System.out.println("Frase Lida: " + frase);
        System.out.println("\tQuantidade de Maiúsculas: " + upper);
        System.out.println("\tQuantidade de Minúsculas: " + lower);
        System.out.println("Frase Lida (Trocada): " + fraseInversa);

        sc.close();
    }
}
