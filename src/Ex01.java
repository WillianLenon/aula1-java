import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
		mensagem explicativa, conforme exemplos.
		*/
		
		Scanner sc =  new Scanner (System.in);
		int valor1, valor2, soma;
		System.out.println("Informe o primeiro valor:");
		valor1 = sc.nextInt();
		System.out.println("Informe o segundo valor:");
		valor2 = sc.nextInt();
		soma = valor1 + valor2;
		System.out.println("A soma dos valores �: "+ soma);
		sc.close();
	}

}
