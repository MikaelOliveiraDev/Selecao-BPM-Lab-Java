import java.util.Scanner;

public class Exercicio_5_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.print("Digite uma palavra para buscar: ");
        String palavraBusca = sc.nextLine();

        String fraseLowerCase = frase.toLowerCase();
        String[] palavras = fraseLowerCase.split(" ");

        boolean encontrada = false;
        String fraseDestacada = "";
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].equalsIgnoreCase(palavraBusca)) {
                palavras[i] = palavras[i].toUpperCase();
                encontrada = true;
            }

            fraseDestacada += palavras[i]+ " ";
        }

        System.out.println(frase);
        if (encontrada)
            System.out.println(fraseDestacada);
        else
            System.out.println("Palavra não encontrada");

        sc.close();
    }
}
