import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
			de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
			*/
		Scanner sc = new Scanner (System.in);
		int a, b, c, d, diferenca;
		
		System.out.println("Informe o primeiro valor:");
		a = sc.nextInt();
		
		System.out.println("Informe o segundo valor:");
		b = sc.nextInt();
		
		System.out.println("Informe o terceiro valor:");
		c = sc.nextInt();
		
		System.out.println("Informe o quarto valor:");
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		System.out.println("Diferen�a = " + diferenca);
		sc.close();
	}

}
