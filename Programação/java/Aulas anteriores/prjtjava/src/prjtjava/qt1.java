package prjtjava;

import java.util.Scanner;

public class qt1 {
	public static void main(String[] args) {
		System.out.println("Digite os numeros: ");
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc1.nextInt();
		int n2 = sc1.nextInt();
		sc1.close();
		if(n1>n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}
}
