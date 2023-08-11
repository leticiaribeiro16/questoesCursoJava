package curso;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Exercício 1 FUNCIONOU

		int x, y, soma;
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
		System.out.printf("SOMA: %d", soma);
		
		
		// Exercício 2 FUNCIONOU
		
		double raioCirculo, area;
		double pi = 3.14159;
		
		raioCirculo = sc.nextDouble();
		
		area = pi * raioCirculo * raioCirculo;
		
		System.out.printf("A área é %.4f%n", area);
		
		// Exercício 3 FUNCIONOU
		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.printf("A diferença desses números é: %d", diferenca);
		
		// Exercício 4
		int nFuncionario, horas;
		double vHora, salario;
		
		nFuncionario = sc.nextInt();
		horas = sc.nextInt();
		vHora = sc.nextDouble();
		
		salario = vHora * horas;
		
		System.out.println("NUMBER = " + nFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		// Exercício 5
		int cp1, np1, cp2, np2;
		double vu1, vu2;
		double t1, t2, total;
		
		cp1 = sc.nextInt();
		np1 = sc.nextInt();
		vu1 = sc.nextDouble();
		
		cp2 = sc.nextInt();
		np2 = sc.nextInt();
		vu2 = sc.nextDouble();
		
		t1 = np1 * vu1;
		t2 = np2 * vu2;
		total = t1 + t2;
		
		System.out.printf("Código 1: %d%nCódigo 2: %d%nTotal das peças 1: R$ %.2f%nTotal das peças 2 R$ %.2f%nTotal geral R$ %.2f", cp1, cp2, t1, t2, total);
		
		// Exercício 6
		double A, B, C, pi, aT, aC, aTr, aQ, aR;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		pi = 3.14159;
		
		aT = A * C / 2;
		aC = pi * Math.pow(C, 2);
		aTr = (A + B) * C / 2;
		aQ = B * B;
		aR = A * B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f", aT, aC, aTr, aQ, aR);
		
		sc.close();
	}
}
