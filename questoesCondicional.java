package curso;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		EXERCÍCIO 1

//		int num;
//
//		System.out.println("Digite um número");
//		num = sc.nextInt();
//
//		if (num >= 0) {
//			System.out.println("POSITIVO");
//		}
//		else {
//			System.out.println("NEGATIVO");
//		}
		
//		EXERCÍCIO 2
		
//		int n;
//		System.out.println("Digite um número");
//		n = sc.nextInt();
//		
//		if (n % 2 == 0) {
//			System.out.println("É par");
//		}
//		else {
//			System.out.println("É ímpar");
//		}
		
//		EXERCÍCIO 3
		
//		int A, B;
//		System.out.println("Digite um número");
//		A = sc.nextInt();
//		System.out.println("Digite outro número");
//		B = sc.nextInt();
//		
//		if (A % B == 0 || B % A == 0) {
//			System.out.println("São múltiplos");
//		}
//		else {
//			System.out.println("Não são múltiplos");
//		}
		
//		EXERCÍCIO 4
		
//		int i, f;
//		i = sc.nextInt();
//		f = sc.nextInt();
//		
//		int duracao;
//		
//		if(i < f) {
//			duracao = f - i;
//		}
//		else {
//			duracao = 24 - i + f;
//		}
//		System.out.println("O jogo durou " + duracao + " hora(s)");
		
//		EXERCÍCIO 5
		
//		double n1, n2, nf;
//		
//		n1 = sc.nextDouble();
//		n2 = sc.nextDouble();
//		nf = n1 + n2;
//		
//		if( nf >= 60) {
//			System.out.printf("NOTA FINAL = %.1f", nf);
//		} 
//		else {
//			System.out.printf("NOTA FINAL = %.1f", nf);
//			System.out.println("REPROVADO");
//		}
		
//		EXERCÍCIO 6
		
//		System.out.println("Digite o código do produto: ");
//		int codigo = sc.nextInt();
//		System.out.println("Digite a quantidade: ");
//		int quantidade = sc.nextInt();
//		
//		double total;
//		
//		if (codigo == 1) {
//			total = quantidade * 4.0;
//		}
//		else if (codigo == 2) {
//			total = quantidade * 4.5;
//		}
//		else if (codigo == 3) {
//			total = quantidade * 5.0;
//		}
//		else if (codigo == 4) {
//			total = quantidade * 2.0;
//		}
//		else {
//			total = quantidade * 1.5;
//		}
//		System.out.printf("O total deu R$ %.2f", total);

// 		EXERCÍCIO 7
		
//		double v;
//		System.out.println("Digite um valor entre 0 e 100");
//		v = sc.nextDouble();
//		
//		if (v >= 0 && v < 25) {
//			System.out.println("O número " + v + " está no intervalo 0 - 25");
//		}
//		else if (v >= 25 && v < 50) {
//			System.out.println("O número " + v + " está no intervalo 25 - 50");
//		}
//		else if (v >= 50 && v < 75) {
//			System.out.println("O número " + v + " está no intervalo 50 - 75");
//		}
//		else if (v >= 75 && v <= 100) {
//			System.out.println("O número " + v + " está no intervalo 75 - 100");
//		}
//		else {
//			System.out.println("O valor " + v + " está fora do intervalo");
//		}
		
// 		EXERCÍCIO 8
		
//		System.out.println("Digite um valor x");
//		double x = sc.nextDouble();
//		System.out.println("Digite um valor y");
//		double y = sc.nextDouble();
//		
//		if (x == 0 && y == 0) {
//			System.out.println("Origem");
//		}
//		else if (x == 0) {
//			System.out.println("Eixo X");
//		}
//		else if (y == 0) {
//			System.out.println("Eixo Y");
//		}
//		else if (x > 0 && y > 0) {
//			System.out.println("Q1");
//		}
//		else if (x < 0 && y > 0) {
//			System.out.println("Q2");
//		}
//		else if (x < 0 && y < 0) {
//			System.out.println("Q3");
//		}
//		else if (x > 0 && y < 0) {
//			System.out.println("Q4");
//		}
//		else {
//			System.out.println("Não existe");
//		}
		
//		EXERCÍCIO 9 
		
//		double imposto;
//		double salario = sc.nextDouble();
//		
//		if (salario <= 2000.0) {
//			imposto = 0.0;
//		}
//		else if (salario <= 3000.0) {
//			imposto = (salario - 2000.0) * 0.08;
//		}
//		else if (salario <= 4500.0) {
//			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
//		}
//		else {
//			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
//		}
//
//		if (imposto == 0.0) {
//			System.out.println("Isento");
//		}
//		else {
//			System.out.printf("R$ %.2f%n", imposto);
//		}
		
		
		sc.close();
	}
}




