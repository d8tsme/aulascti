package prjtjava;

import java.util.Scanner;

public class qt3 {
	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <=10; i++) {
			System.out.println(n*i);
		}
	}
}
