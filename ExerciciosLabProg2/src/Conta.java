
/**
 *
 * @author paulo
 */
public class Conta {

    private int numero;
    private double saldo;

    public Conta() {
        setNumero(numero);
        setSaldo(saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        if (saldo > 0) {
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

}
