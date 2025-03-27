package aulaProva;

import java.util.Scanner;

public class qt03 {

	public static void main(String[] args) {
		int[] n = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o numero " + (i+1) + ":");
			n[i] = sc.nextInt();
		}
		sc.close();
	}

}
