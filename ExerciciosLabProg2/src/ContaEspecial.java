
/**
 *
 * @author paulo
 */
public class ContaEspecial extends Conta {

    private int limite;

    public ContaEspecial() {
        super();
        setLimite(limite);
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    @Override
    public void debitar(double valor) {

    }

}
