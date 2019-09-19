package Exercicios;

public class LivroNotas {
	double somaNota, qtNota;
	//int cont = 0;
	
	public LivroNotas() {
		this.somaNota = 0;
		this.qtNota = 0;
	}
	
	public void addNota(int nota) {
		somaNota += nota;
		qtNota++;
	}


	public double calcMedia() {
		return somaNota/qtNota;
	}
}
