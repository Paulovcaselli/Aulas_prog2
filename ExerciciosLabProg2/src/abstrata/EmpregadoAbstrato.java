package abstrata;

public abstract class EmpregadoAbstrato {

    private String nome, cpf;

    public EmpregadoAbstrato(String nome, String cpf) {
        setNome(nome);
        setCPF(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public abstract double getPagamento();

    public String toString() {
        return "EmpregadoAbstrato [nome=" + nome + ", cpf=" + cpf + "]";
    }

}
