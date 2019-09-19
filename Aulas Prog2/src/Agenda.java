import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opt;
		String nome;

		System.out.print("Qual seu nome?");
		nome = ler.nextLine();
		System.out.print("Qual opcao voce deseja usar: \n0-Seu Nome\n1-Inserir\n2-Remover\n3-Editar\n4-Localizar\n5-Sair\n\nOpcao:");
		opt = ler.nextInt();

		switch (opt) {

		case 0:
			System.out.print("Seu nome e: "+nome);
			break;
		case 1:
			System.out.print("\nDigite seu nome: ");
			nome = ler.nextLine();
			break;
		case 2:
			System.out.print("\nQuem voce quer remover: ");
			break;
		case 3:
			System.out.print("\nQuem voce quer editar: ");
			break;
		case 4:
			System.out.print("\nLocalizar pessoa: ");
			break;
		case 5:
			System.exit(0);
		default:
			System.out.print("\nNumero nao e valido!");
		}

	}

}
