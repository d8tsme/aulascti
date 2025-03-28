package prjtjava;

import java.util.Scanner;

public class qt8 {
	public static void main(String[] args) {
		int maior = 0;
		int menor = 0;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <=10; i++) {
			System.out.println("numero: ");
			n = sc.nextInt();
			if (n > maior) {
				maior = n;
			} if (n < menor || menor == 0) {
				menor = n;
			}
		}
		System.out.println("menor: " + menor + " maior: " + maior);
	}
}
