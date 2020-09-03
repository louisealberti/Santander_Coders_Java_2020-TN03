package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		int nota = 0;
		Scanner sc = new Scanner(System.in);

		while (nota >= 0 && nota <= 10) {
			System.out.println("Digite uma nota entre 0 e 10");
			nota = sc.nextInt();
		}

		System.out.println("!-----| VALOR INVALIDO |-----!");
		sc.close();

	}
}
