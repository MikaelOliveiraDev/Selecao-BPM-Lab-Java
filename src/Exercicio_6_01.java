// Desenhando um Triângulo
import java.util.Scanner;

public class Exercicio_6_01 {
    public static void aumentaDiminuiChar(char c1, char c2, int tamanho) {
        for (int i = 1; i <= tamanho; i++) {
            String linha = "";
            for (int j = 0; j < tamanho; j++) {
                if (j < i) {
                    linha += c1;
                } else {
                    linha += c2;
                }
            }
            System.out.println(linha);
        }
    }
    public static void diminuiAumentaChar(char c1, char c2, int tamanho) {
        for (int i = 1; i <= tamanho; i++) {
            String linha = "";
            for (int j = tamanho; j > 0; j--) {
                if (j > i) {
                    linha += c1;
                } else {
                    linha += c2;
                }
            }
            System.out.println(linha);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura do triângulo (3-20): ");
        int altura = sc.nextInt();
        if (altura < 3 || altura > 20) {
            System.out.println("Não é possível desenhar o triângulo solicitado");
            return;
        }

        System.out.println("Digite o tipo do triângulo:\n(RIE / RSE / RID / RSD): ");
        String tipo = sc.next();

        switch (tipo) {
            case "RIE":
            case "rie": aumentaDiminuiChar('*', ' ', altura); break;
            case "RSE":
            case "rse": diminuiAumentaChar('*', ' ', altura); break;
            case "RID":
            case "rid": diminuiAumentaChar(' ', '*', altura); break;
            case "RSD":
            case "rsd": aumentaDiminuiChar(' ', '*', altura); break;
            default:
                System.out.println("Não é possível desenhar o triângulo solicitado");
        }

        sc.close();
    }
}
