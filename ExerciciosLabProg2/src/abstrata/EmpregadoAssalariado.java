package abstrata;

public class EmpregadoAssalariado extends EmpregadoAbstrato {

    private String nome;
    private String cpf;
    protected double salario;

    public EmpregadoAssalariado(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPagamento() {
        return salario;
    }

    @Override
    public String toString() {
        return "EmpregadoAssalariado [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
    }

}
