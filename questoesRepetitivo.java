package curso;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		EXERCÍCIO 1
		
//		int senha = sc.nextInt();
//		
//		while (senha != 2002) {
//			System.out.println("Senha inválida");
//			senha = sc.nextInt();
//		}
//		System.out.println("Acesso Permitido");
		
//		EXERCÍCIO 2
		
//		System.out.println("Eixo x: ");
//		int x = sc.nextInt();
//		
//		System.out.println("Eixo y: ");
//		int y = sc.nextInt();
//		
//		while (x != 0 && y != 0) {
//			if (x > 0 && y > 0) {
//				System.out.println("Primeiro quadrante");
//				
//				System.out.println("Eixo x: ");
//				x = sc.nextInt();
//				
//				System.out.println("Eixo y: ");
//				y = sc.nextInt();
//			}
//			else if (x > 0 && y < 0) {
//				System.out.println("Quarto quadrante");
//				
//				System.out.println("Eixo x: ");
//				x = sc.nextInt();
//				
//				System.out.println("Eixo y: ");
//				y = sc.nextInt();
//			}
//			else if (x < 0 && y > 0) {
//				System.out.println("Segundo quadrante");
//				
//				System.out.println("Eixo x: ");
//				x = sc.nextInt();
//				
//				System.out.println("Eixo y: ");
//				y = sc.nextInt();
//			}
//			else if (x < 0 && y < 0) {
//				System.out.println("Terceiro quadrante");
//				
//				System.out.println("Eixo x: ");
//				x = sc.nextInt();
//				
//				System.out.println("Eixo y: ");
//				y = sc.nextInt();
//			}
//			else {
//				System.out.println(" ");
//			}
//		}
		
// 		EXERCÍCIO 3
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int cod = sc.nextInt();
		
		while (cod != 4) {
			switch (cod) {
				case 1: 
					alcool = alcool + 1;
				case 2:
					gasolina = gasolina + 1;
				case 3:
					diesel = diesel + 1;
				default: 
					cod = sc.nextInt();
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
