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

	public double getMaiorNota() {
		double maiorNota = 0;
		double menorNota = 20;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
			} else {
				menorNota = notas[i];
			}
		}
		return maiorNota;
	}

	public double getMenorNota() {
		double maiorNota = 0;
		double menorNota = 20;
		for (int i = 0; i < notas.length; i++) {
			if (menorNota > notas[i]) {
				menorNota = notas[i];
			} else {
				maiorNota = notas[i];
			}
		}
		return menorNota;
	}
	
	
	
	
	
	

}