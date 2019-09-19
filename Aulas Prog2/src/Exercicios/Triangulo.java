package Exercicios;

import java.util.Scanner;

public class Triangulo {
	Scanner ler = new Scanner(System.in);
	double l1, l2, l3;

	public Triangulo(double l1, double l2, double l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	boolean isEquilatero() {
		if ((l1 == l2) && (l1 == l3)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isIsosceles() {
		if ((l1 == l2) || (l2 == l3) || (l2 == l3)) {
			return true;
		} else {
			return false;
		}

	}

}
