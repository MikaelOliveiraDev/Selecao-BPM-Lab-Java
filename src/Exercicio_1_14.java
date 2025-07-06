// Velocidade do Automóvel
import java.util.Scanner;

public class Exercicio_1_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade inicial do automóvel (m/s): ");
        int velInicial = scanner.nextInt();
        System.out.print("Digite a aceleração (m/s²): ");
        int aceleracao = scanner.nextInt();
        System.out.print("Digite o tempo de percurso (s): ");
        int tempoPercurso = scanner.nextInt();

        // Velocidade em m/s
        int velFinal = velInicial + aceleracao * tempoPercurso;
        // Converter para km/h
        velFinal *= 3.6;

        System.out.printf("O automóvel atinge %dkm/h no instante %ds", velFinal, tempoPercurso);

        scanner.close();

    }
}
