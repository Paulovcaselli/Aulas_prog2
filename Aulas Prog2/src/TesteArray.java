import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float cotacoes[] = { 1.74f, 1.55f, 1.81f, 1.27f };
		for (float cot : cotacoes) {
			System.out.println(cot);
		}

		int numLin, numCol, numSaida;

		System.out.print("Digite o numero de linhas: ");
		numLin = ler.nextInt();
		System.out.print("Digite o numero de colunas: ");
		numCol = ler.nextInt();
		System.out.print("Digite o numero para preencher a matriz: ");
		numSaida = ler.nextInt();

		int matriz[][] = new int[numLin][numCol];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = numSaida;
			}

		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
