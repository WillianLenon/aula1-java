import java.util.Scanner;

public class Ex02 {
	public static void main (String args []) {
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
			casas decimais conforme exemplos.
			Fórmula da área: area = π . raio2
			Considere o valor de π = 3.14159
		*/
		Scanner sc = new Scanner (System.in);
		double raio, area;
		
		System.out.println("Digite o valor do raio de um círculo:");
		raio = sc.nextDouble();
		
		area = 3.14159 * (Math.pow(raio, 2.0));
		
		System.out.printf("A área deste círculo é: %.4f", area);
		sc.close();
		
	}

}
