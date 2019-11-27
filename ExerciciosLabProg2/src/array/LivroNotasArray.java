package array;

/**
 *
 * @author paulo
 */
public class LivroNotasArray {

    private int numNotas;
    Double[] notas;

    public LivroNotasArray() {
        this.numNotas = 0;
        notas = new Double[5];
    }

    public void adicionaNota(double nota) {
        numNotas++;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = nota;
        }
    }

    public double calculaMedia() {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            //if (notas[i] == null) {
            //    notas[i] = notas[i] + 1;
            media += notas[i];
            media = media / numNotas;
        }
        //}
        return media;
    }

    public int getNumNotas() {
        return numNotas;
    }

    public double getSomaNotas() {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            //if (notas[i] == null) {
            //notas[i] = notas[i] + 1;
            media += notas[i];
        }
        //}
        return media;
    }
}
