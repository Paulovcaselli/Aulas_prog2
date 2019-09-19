import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int notamaior, notamenor, media, n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
		
		System.out.print("Digite a nota do aluno: ");
		n1=ler.nextInt();
		notamaior = n1;
		System.out.print("Digite a nota do aluno: ");
		n2=ler.nextInt();
		
		if(n2>n1) {
			notamaior=n2;
		}else {
			
		}
		System.out.print("Digite a nota do aluno: ");
		n3=ler.nextInt();
		if(n3>n2) {
			notamaior=n3;
		}else {
			
		}		
		System.out.print("Digite a nota do aluno: ");
		n4=ler.nextInt();
		if(n4>n3) {
			notamaior=n4;
		}else {
			
		}		
		System.out.print("Digite a nota do aluno: ");
		n5=ler.nextInt();
		if(n5>n4) {
			notamaior=n5;
		}else {
			
		}		
		System.out.print("Digite a nota do aluno: ");
		n6=ler.nextInt();
		if(n6>n5) {
			notamaior=n6;
		}else {
			
		}		
		System.out.print("Digite a nota do aluno: ");
		n7=ler.nextInt();
		if(n7>n6) {
			notamaior=n7;
		}else {
			
		}		
		System.out.print("Digite a nota do aluno: ");
		n8=ler.nextInt();
		if(n8>n7) {
			notamaior=n8;
		}else {
			
		}		
		System.out.print("Digite a nota do aluno: ");
		n9=ler.nextInt();
		if(n9>n8) {
			notamaior=n9;
		}else {
			
		}
		System.out.print("Digite a nota do aluno: ");
		n10=ler.nextInt();
		if(n10>n9) {
			notamaior=n10;
		}else {
			
		}		
		
		System.out.println(notamaior);
		
		
	}

}
