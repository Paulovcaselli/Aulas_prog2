
public class ControleRemotoArCondicionado implements ControleRemoto {
	int temperatura = 0;

	public ControleRemotoArCondicionado() {
		this.temperatura = 25;
	}

	@Override
	public void aumentar() {
		if (temperatura < 27) {
			temperatura++;
			System.out.println(temperatura);
		} else if (temperatura == 27) {
			System.out.println("A temperatura já está no máximo!");
		}

	}

	@Override
	public void diminuir() {
		if (temperatura > 18) {
			temperatura--;
			System.out.println(temperatura);
		} else if (temperatura == 18) {
			System.out.println("A temperatura já está no mínimo!");
		}

	}

	public int getTemperatura() {
		return temperatura;
	}

}
