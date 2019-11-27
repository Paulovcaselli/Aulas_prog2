package array;

/**
 *
 * @author paulo
 */
public class TesteLivroNotas {

    public static void main(String[] args) {
        LivroNotas livro = new LivroNotas();

        livro.adicionaNota(8);
        livro.adicionaNota(7);
        livro.adicionaNota(9);

        livro.getNumNotas();
        System.out.println("Quantidade de notas: " + livro.getNumNotas());

        livro.calculaMedia();
        System.out.println("Media das notas: " + livro.calculaMedia());
        
        LivroNotasArray livro2 = new LivroNotasArray();
        
        livro2.adicionaNota(2);
        livro2.adicionaNota(2);
        livro2.adicionaNota(2);
        livro2.adicionaNota(2);
        livro2.adicionaNota(2);
        livro2.adicionaNota(2);        
        /*livro2.adicionaNota(8);
        livro2.adicionaNota(6);
        livro2.adicionaNota(9);
        livro2.adicionaNota(3);
        livro2.adicionaNota(3);*/
        
        System.out.println("Quantidade de notas: " + livro2.getNumNotas());
        System.out.println("Media das notas: " + livro2.calculaMedia());
        System.out.println("A soma das notas e: " + livro2.getSomaNotas());
    }

}
