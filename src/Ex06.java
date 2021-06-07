import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/
		Scanner sc = new Scanner(System.in);
		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Informe o valor de A:");
		a = sc.nextDouble();
		
		System.out.println("Informe o valor de B:");
		b = sc.nextDouble();
		
		System.out.println("Informe o valor de C:");
		c = sc.nextDouble();
		
		//Cálculo área do triangulo retangulo
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
