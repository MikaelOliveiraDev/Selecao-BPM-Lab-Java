import java.util.*;

public class Exercicio_6_02 {
	static Scanner sc = new Scanner(System.in);
	static char[][] tabuleiro = new char[3][3];
	static int turno = 0;
	static String[] jogadores = new String[2];

	public static void printTabuleiro() {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				// Margem esquerda
				if (coluna == 0) System.out.print(" ");

				// O caractere
				System.out.print(tabuleiro[linha][coluna]);

				// Nova linha ou barra
				if (coluna == 2) System.out.println();
				else System.out.print(" | ");
			}
		}
	}

	public static int[] pedirCoord() {
		System.out.print(jogadores[turno] +", digite uma coordenada: ");
		int num = sc.nextInt() - 1;

		int coluna = num % 3;
		int linha = num / 3;
		linha = 2 - linha; // inverte a o indice da linha

		return new int[]{linha, coluna};
	}

	public static boolean coordVasia(int linha, int coluna) {
		if (tabuleiro[linha][coluna] != ' ') {
			System.out.println("A coordenada já está ocupada!");
			return false;
		} else {
			return true;
		}
	}

	public static char ganhou() {
		/* Retorna 'x', 'o', 'n' ou ' ' */

		// Verifica se ganhou horizontalmente
		for (int linha = 0; linha < 3; linha++ ) {
			if (tabuleiro[linha][0] != ' ' &&
					tabuleiro[linha][0] == tabuleiro[linha][1] &&
					tabuleiro[linha][0] == tabuleiro[linha][2])
					return tabuleiro[linha][0];
		}

		// Verifica se ganhou verticalmente
		for (int coluna = 0; coluna < 3; coluna++ ) {
			if (tabuleiro[0][coluna] != ' ' &&
					tabuleiro[0][coluna] == tabuleiro[1][coluna] &&
					tabuleiro[0][coluna] == tabuleiro[2][coluna])
				return tabuleiro[0][coluna];
		}

		// Verifica se ganhou na diagonal
		if (tabuleiro[0][0] != ' ' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2])
			return tabuleiro[0][0];
		if (tabuleiro[2][0] != ' ' && tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[2][0] == tabuleiro[0][2])
			return tabuleiro[2][0];

		// Verifica se ainda existe espaços
		for (int linha = 0; linha < 3; linha++ ) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (tabuleiro[linha][coluna] == ' ') {
					return ' ';
				}
			}
		}
		// Ninguem ganhou
		return 'n';
	}

	public static void main(String[] args) {
		// Solicitar nomes
		System.out.print("Digite o nome do jogador 1: ");
		jogadores[0] = sc.nextLine();
		System.out.print("Digite o nome do jogador 2: ");
		jogadores[1] = sc.nextLine();

		// Apresentação das teclas
		System.out.println("Utilize as teclas do number pad correspondentes:");
		System.out.println(" 7 | 8 | 9");
		System.out.println(" 4 | 5 | 6");
		System.out.println(" 1 | 2 | 3");

		while (true) {
			// Inicia tabuleiro com espaços
			for (int linha = 0; linha < 3; linha++) {
				for (int coluna = 0; coluna < 3; coluna++) {
					tabuleiro[linha][coluna] = ' ';
				}
			}

			// Loop dos turnos
			while (true) {
				int[] coord = pedirCoord();
				int linha = coord[0];
				int coluna = coord[1];

				if (coordVasia(linha, coluna)) {
					tabuleiro[linha][coluna] = turno == 0 ? 'x' : 'o';
					turno = turno == 0 ? 1 : 0;
					printTabuleiro();

					char ganhou = ganhou();
					if (ganhou == 'n') {
						System.out.println("Fim do Jogo!\nEmpate!");
						break;
					} else if (ganhou == 'x') {
						System.out.println("Fim do Jogo!\n" + jogadores[0] + " ganhou!");
						break;
					} else if (ganhou == 'o') {
						System.out.println("Fim do Jogo!\n" + jogadores[1] + " ganhou!");
					}
				}
			}

			// Pergunta para repetir
			System.out.print("Deseja jogar novamente? (S/N): ");
			sc.nextLine();
			String resposta = sc.nextLine();

			while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
				System.out.print("Digite S para sim, ou N para não: ");
				resposta = sc.nextLine();
			}

			if (resposta.equalsIgnoreCase("N"))
				break;

			sc.close();
		}
	}
}