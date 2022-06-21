package Algoritmo79_CalculaRendimentosPoupancaProgramada;

import java.util.Scanner;

public class Algoritmo79_CalculaRendimentosPoupancaProgramada {

	public static void main(String[] args) {

		extracted();
		
		
	}

	public static void extracted() {
		double va, i, p;
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da Aplicação: ");
		p = scanner.nextDouble();
		System.out.println("Digite a taxa ( 0 - 1 ): ");
		i = scanner.nextDouble();
		System.out.println("Digite o número de meses: ");
		n = scanner.nextInt();
		
		double poten = ( 1 + i );
		
		va = p * ( Math.pow(poten,  n) - 1 ) / i;
		
		System.out.println("Valor acumulado: " + va);
	}

}
