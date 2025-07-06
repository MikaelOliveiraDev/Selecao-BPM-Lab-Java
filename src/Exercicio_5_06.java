
import java.util.Scanner;

public class Exercicio_5_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite a chave de criptografia (1-10): ");
        int chave = sc.nextInt();
        while (chave < 1 || chave > 10) {
            System.out.println("Erro: a chave deve ser um número entre 1 e 10.");
            System.out.println("Digite novamente: ");
            chave = sc.nextInt();
        }

        // Criptografia
        String fraseEncriptada = "";
        for (char c : frase.toCharArray()) {
            // Maiúsculas vão de 65 até 90 no ASCII
            // Minúsculas vão de 97 até 122
            if (64 < c && c <= 90 - chave ||
                    96 < c && c <= 122 - chave) { // Quando o caractere está dentro da zona segura
                fraseEncriptada += (char) (c + chave);
            } else if (90 - chave < c && c <= 90) { // Quando precisa dar a volta
                fraseEncriptada += (char) (c + chave - 90 + 64);
            } else if (122 - chave < c && c <= 122) {
                fraseEncriptada += (char) (c + chave - 122 + 96);
            } else { // Quando não é letra
                fraseEncriptada += c;
            }
        }

        System.out.println("Frase Lida: " + frase);
        System.out.println("Chave da Criptografia: " + chave);
        System.out.println("Frase Criptografada: " + fraseEncriptada);

        sc.close();
    }
}
