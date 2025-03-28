package prjtjava;

import java.util.Scanner;

public class qt5 {
	public static void main(String[] args) { 
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("ímpar");
		}
	}
}
