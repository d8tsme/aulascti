package prjtjava;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		// Escrever algo - Saída
		System.out.println("Olá");
		
		//Ler algo - Entrada
		System.out.println("Digite o seu nome:");
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		System.out.println("O nome digitado foi " + nome);
		
		//Estrutura de Condição (if e else)
		System.out.println("DIGITE UM NUMERO: ");
		Scanner p = new Scanner(System.in);
		int n1 = p.nextInt();
		if (n1 >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		p.close();
	}
}
