import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/
		Scanner sc = new Scanner (System.in);
		int codigo1, quantidadePecas1, codigo2, quantidadePecas2;
		double valorUnitarioPeca1, valorUnitarioPeca2, totalPeca1, totalPeca2, valorTotal;
		
		System.out.println("Informe o código da peça 1");
		codigo1 = sc.nextInt();
		
		System.out.println("Informe a quantidade de peças");
		quantidadePecas1 = sc.nextInt();
		
		System.out.println("Informe o valor unitário");
		valorUnitarioPeca1 = sc.nextDouble();
		
		totalPeca1 = quantidadePecas1 * valorUnitarioPeca1;
		
		System.out.println("Informe o código da peça 2");
		codigo2 = sc.nextInt();
		
		System.out.println("Informe a quantidade de peças");
		quantidadePecas2 = sc.nextInt();
		
		System.out.println("Informe o valor unitário");
		valorUnitarioPeca2 = sc.nextDouble();
		
		totalPeca2 = quantidadePecas2 * valorUnitarioPeca2;
		
		valorTotal = totalPeca1 + totalPeca2;
		
		System.out.printf("Valor a pagar: R$%.2f", valorTotal);
		sc.close();
		
	}

}
