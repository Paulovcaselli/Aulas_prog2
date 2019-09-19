package Exercicios;

/*4 – Pensando em um sistema de controle para um banco
que possui dois tipos de conta: conta simples (conta
corrente) e conta poupança. Defina em termos de OO como
podemos representar tal sistema
(classes/atributos/métodos).*/

public class Conta {

	private int agencia, numero, saldo;

	public Conta(int agencia, int numero, int saldo) {
		setAgencia(agencia);
		setNumero(numero);
		setSaldo(saldo);
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void creditar(int valor) {
		this.saldo += valor;
	}

	public void debitar(int valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Voce nao tem saldo suficiente!");
		}
	}
}