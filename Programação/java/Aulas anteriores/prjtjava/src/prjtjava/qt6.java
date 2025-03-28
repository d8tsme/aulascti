package prjtjava;

import java.util.Scanner;

public class qt6 {
	public static void main(String[] args) {
		System.out.println("Digite 5 numeros: ");
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		for(int i = 1; i <=5; i++) {
			int n = sc.nextInt();
			soma = soma + n;
		}
		System.out.println(soma);
	}
}
