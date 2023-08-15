package view;

import java.util.Scanner;

import Controller.MDC;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int a = ler.nextInt();
		System.out.println("Digite o segundo número");
		int b = ler.nextInt();
	
		MDC CalcMDC = new MDC();
		
		System.out.println((CalcMDC.CalculoMDC(a, b)));
	}

}
