import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
	hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
	decimais.
	*/
		Scanner sc = new Scanner (System.in);
		int numeroFuncionario;
		double horasTrabalhadas;
		double valorHoras;
		double salario;
		
		System.out.println("Informe o n�mero do funcion�rio");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Informe o n�mero de horas trabalhadas");
		horasTrabalhadas = sc.nextDouble();
		
		System.out.println("Valor recebido por hora");
		valorHoras = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHoras;
		
		System.out.println("Numero: "+ numeroFuncionario);
		System.out.printf("Sal�rio: %.2f", salario);
		
		sc.close();

	}

}
