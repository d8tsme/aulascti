package prjtjava;

import java.util.Scanner;

public class qt2 {
	public static void main(String[] args){
		System.out.println("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if (n1>0) {
			System.out.println("Positivo");
		} if (n1<0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Zero");
		}
	}
}
