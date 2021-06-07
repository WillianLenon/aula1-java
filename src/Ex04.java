import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
	decimais.
	*/
		Scanner sc = new Scanner (System.in);
		int numeroFuncionario;
		double horasTrabalhadas;
		double valorHoras;
		double salario;
		
		System.out.println("Informe o número do funcionário");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Informe o número de horas trabalhadas");
		horasTrabalhadas = sc.nextDouble();
		
		System.out.println("Valor recebido por hora");
		valorHoras = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHoras;
		
		System.out.println("Numero: "+ numeroFuncionario);
		System.out.printf("Salário: %.2f", salario);
		
		sc.close();

	}

}
