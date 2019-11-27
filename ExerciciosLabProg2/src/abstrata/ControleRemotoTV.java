package abstrata;


public class ControleRemotoTV implements ControleRemoto{

    @Override
    public void aumentar() {
        System.out.println("TV: Aumente o volume!");
    }

    @Override
    public void diminuir() {
        System.out.println("TV: Diminua o volume!");
    }

}
