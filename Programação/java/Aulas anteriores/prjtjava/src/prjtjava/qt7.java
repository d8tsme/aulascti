package prjtjava;

import java.util.Scanner;

public class qt7 {
	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = sc.nextInt();
		while (n1<n2) {
			n1++;
			if (n1 % 2 == 0) {
				System.out.println(n1);
			}
		}
	}
}
