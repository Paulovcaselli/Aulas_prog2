
/**
 *
 * @author paulo
 */
public class Estoque {

    private String nome;
    private int qtdAtual, qtdMinima;

    public Estoque() {

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String mudarNome(String nome) {
        this.setNome(nome);
        return nome;
    }

    public int mudarQtdMinima(int qtdMinima) {
        this.setQtdMinima(qtdMinima);
        return qtdMinima;
    }

    public void repor(int qtd) {
        this.setQtdAtual(this.getQtdAtual() + qtd);
    }

    public void darBaixa(int qtd) {
        this.setQtdAtual(this.getQtdAtual() - qtd);
    }

    public String mostrar() {
        return "Nome do produto: " + this.nome + "\nQuantidade atual: " + this.qtdAtual + "\nQuantidade minima: " + this.qtdMinima+"\n";
    }

    public boolean precisaRepor() {
        if (qtdAtual <= qtdMinima) {
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

}
