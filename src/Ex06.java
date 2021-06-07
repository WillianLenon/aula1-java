import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.
*/
		Scanner sc = new Scanner(System.in);
		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Informe o valor de A:");
		a = sc.nextDouble();
		
		System.out.println("Informe o valor de B:");
		b = sc.nextDouble();
		
		System.out.println("Informe o valor de C:");
		c = sc.nextDouble();
		
		//C�lculo �rea do triangulo retangulo
		areaTriangulo = (a * c) / 2;		
		System.out.printf("Triangulo: %.3f", areaTriangulo);
		System.out.println("");
		
		//Calculo area do circulo
		
		areaCirculo = Math.PI * (Math.pow(c, 2));
		System.out.printf("Circulo: %.3f", areaCirculo);
		System.out.println("");
		
		//Calculo area do trapezio
		
		areaTrapezio = (a + b) * c / 2;
		System.out.printf("Trapezio: %.3f", areaTrapezio);
		System.out.println("");
		
		//Calculo area do quadrado
		areaQuadrado = b * b;
		System.out.printf("Quadrado : %.3f", areaQuadrado);
		System.out.println("");
		
		//Calculo area do retangulo
		areaRetangulo = a * b;
		System.out.printf("Retangulo : %.3f", areaRetangulo);
		
		sc.close();

	}

}
