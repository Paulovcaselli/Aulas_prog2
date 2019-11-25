
public class EmpregadoHora extends EmpregadoAbstrato {

	public EmpregadoHora(String nome, String cpf) {
		super(nome, cpf);
	}

	protected double horasTrabalhadas, valorHora;

	@Override
	public double getPagamento() {
		return horasTrabalhadas * valorHora;
	}

}
