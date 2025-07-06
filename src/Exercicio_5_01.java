// Quantidade de vogais
import java.util.Scanner;

public class Exercicio_5_01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = entrada.nextLine();

        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int c : texto.toCharArray()) {
            switch (c) {
                case 'a':
                case 'A': a++; break;
                case 'e':
                case 'E': e++; break;
                case 'i':
                case 'I': i++; break;
                case 'o':
                case 'O': o++; break;
                case 'u':
                case 'U': u++; break;
                default: break;
            }
        }
        int vogais = a + e + i + o + u;

        System.out.println("Frase Lida: " + texto);
        System.out.println("Quantidade de Vogais: " + vogais);
        System.out.println("\tLetras A: " + a);
        System.out.println("\tLetras E: " + e);
        System.out.println("\tLetras I: " + i);
        System.out.println("\tLetras O: " + o);
        System.out.println("\tLetras U: " + u);
    }
}
