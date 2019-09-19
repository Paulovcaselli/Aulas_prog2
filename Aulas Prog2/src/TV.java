
public class TV extends Eletrodomestico {
	private int canal, volume, tamanho;

	public TV(boolean ligado, int voltagem, int consumo, int canal, int volume, int tamanho) {
		super(ligado, voltagem, consumo);
		setCanal(canal);
		setVolume(volume);
		setTamanho(tamanho);

	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
