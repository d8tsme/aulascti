package prjtjava;

import java.util.Scanner;

public class qt4 {
	public static void main(String[] args) {
		System.out.println("Senha: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if(n1 != 1234) {
			System.out.println("Acesso Negado");
		} else {
			System.out.println("Acesso Permitido");
		}
	}
}
