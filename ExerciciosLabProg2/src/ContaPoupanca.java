
/**
 *
 * @author paulo
 */
public class ContaPoupanca extends Conta {

    private double variacao;

    public ContaPoupanca() {
        super();
        setVariacao(variacao);
    }

    public double getVariacao() {
        return variacao;
    }

    public void setVariacao(double variacao) {
        this.variacao = variacao;
    }

    public void renderJuros(double variacao) {
        creditar(getSaldo() * this.variacao);
    }
}
