package Exercicios;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Triangulo t = new Triangulo(5,5,5);
		Triangulo t1 = new Triangulo(4,5,5);
		LivroNotas livro = new LivroNotas();
		
		System.out.print("O triangulo e equilatero? "+t.isEquilatero());
		System.out.print("\nO triangulo e isosceles? "+t1.isIsosceles());		
		
		livro.addNota(10);
		livro.addNota(5);
		//livro.addNota(7);
		//livro.addNota(8);
		System.out.println("\nmedia e: "+livro.calcMedia());
		
		
	}

}