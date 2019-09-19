package Exercicios;

public class Aplicacao {

	public static void main(String[] args) {

		Conta conta = new Conta(1581, 2806, 0);
		System.out.println("Agencia da conta: " + conta.getAgencia() + "\nNumero da conta: " + conta.getNumero()
				+ "\nSaldo: " + conta.getSaldo());

		// conta.setSaldo(20);
		conta.creditar(50);
		System.out.println("Seu novo saldo e: " + conta.getSaldo());
		conta.debitar(30);
		System.out.println("Seu novo saldo e: " + conta.getSaldo());
		conta.creditar(60);
		System.out.println("Seu novo saldo e: " + conta.getSaldo());
		conta.debitar(90);
		System.out.println("Seu novo saldo e: " + conta.getSaldo());

	}

}
