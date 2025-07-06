import java.util.Scanner;

public class Exercicio_5_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.print("Digite uma palavra para buscar: ");
        String palavraBusca = sc.nextLine();
        System.out.print("Digite uma palavra para substituir: ");
        String palavraSub = sc.nextLine();

        String fraseLowerCase = frase.toLowerCase();
        String[] palavras = fraseLowerCase.split(" ");

        boolean encontrada = false;
        String fraseDestacada = "";
        String fraseSub = "";
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].equalsIgnoreCase(palavraBusca)) {
                fraseDestacada += palavras[i].toUpperCase() + " ";
                fraseSub += palavraSub.toUpperCase() + " ";
                encontrada = true;
            } else {
                fraseDestacada += palavras[i] + " ";
                fraseSub += palavras[i] + " ";
            }
        }

        System.out.println(frase);
        if (encontrada) {
            System.out.println(fraseDestacada);
            System.out.println(fraseSub);
        } else {
            System.out.println("Palavra não encontrada");
        }

        sc.close();
    }
}
