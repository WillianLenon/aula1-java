import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
*/
		Scanner sc = new Scanner (System.in);
		int codigo1, quantidadePecas1, codigo2, quantidadePecas2;
		double valorUnitarioPeca1, valorUnitarioPeca2, totalPeca1, totalPeca2, valorTotal;
		
		System.out.println("Informe o c�digo da pe�a 1");
		codigo1 = sc.nextInt();
		
		System.out.println("Informe a quantidade de pe�as");
		quantidadePecas1 = sc.nextInt();
		
		System.out.println("Informe o valor unit�rio");
		valorUnitarioPeca1 = sc.nextDouble();
		
		totalPeca1 = quantidadePecas1 * valorUnitarioPeca1;
		
		System.out.println("Informe o c�digo da pe�a 2");
		codigo2 = sc.nextInt();
		
		System.out.println("Informe a quantidade de pe�as");
		quantidadePecas2 = sc.nextInt();
		
		System.out.println("Informe o valor unit�rio");
		valorUnitarioPeca2 = sc.nextDouble();
		
		totalPeca2 = quantidadePecas2 * valorUnitarioPeca2;
		
		valorTotal = totalPeca1 + totalPeca2;
		
		System.out.printf("Valor a pagar: R$%.2f", valorTotal);
		sc.close();
		
	}

}
