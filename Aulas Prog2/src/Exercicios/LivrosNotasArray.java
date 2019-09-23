package Exercicios;

public class LivrosNotasArray {

	private int qtdNotas;
	private double notas[];

	public LivrosNotasArray(int tam) {
		this.qtdNotas = 0;
		this.notas = new double[tam];
	}

	public void adiconarNota(double nota) {
		notas[qtdNotas] = nota;
		qtdNotas++;
	}

	public double calcularMedia() {
		double somaNotas = 0;
		for (double i : notas) {
			somaNotas += i;
		}
		return somaNotas / qtdNotas;
	}

	/*public double getMaiorNota() {

	}

	public double getMenorNota() {

	}
	*/

}