
public class Eletrodomestico {

	private boolean ligado;
	private int voltagem;
	private int consumo;

	public Eletrodomestico(boolean ligado, int voltagem, int consumo) {
		setLigado(ligado);
		setVoltagem(voltagem);
		setConsumo(consumo);
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

}
