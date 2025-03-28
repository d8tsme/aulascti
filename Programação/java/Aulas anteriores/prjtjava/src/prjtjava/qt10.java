package prjtjava;

import java.util.Scanner;

public class qt10 {
	public static void main(String[] args) {
		System.out.println("Escolha a operação desejada: 1 – Soma, 2 – Subtração, 3 – Multiplicação, 4 – Divisão");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println("Digite 2 numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		switch(p) {
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3:
			System.out.println(n1*n2);
			break;
		case 4:
			System.out.println(n1/n2);
			break;
		}
	}
}
