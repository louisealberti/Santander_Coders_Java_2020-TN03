package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int op = 1;

		while (op == 1 || op == 2) {

			System.out.println("\n\nDigite um número");
			num1 = sc.nextInt();
			System.out.println("Digite outro número");
			num2 = sc.nextInt();

			System.out.println("[ 1 ] Determinar menor");
			System.out.println("[ 2 ] Determinar maior");
			op = sc.nextInt();

			switch (op) {
			case 1:
				menor(num1, num2);
				break;
			case 2:
				maior(num1, num2);
				break;
			default:
				System.out.println("!----- | ENTRADA INVALIDA |-----!");
				break;
			}
		}

		System.out.println("Tchau!)");

		sc.close();
	}

	public static void maior(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("O número " + num1 + " é maior que " + num2);
		} else if (num1 < num2) {
			System.out.println("O número " + num2 + " é maior que " + num1);
		} else {
			System.out.println("Os números são iguais");
		}
	}

	public static void menor(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("O número " + num1 + " é menor que " + num2);
		} else if (num1 > num2) {
			System.out.println("O número " + num2 + " é menor que " + num1);
		} else {
			System.out.println("Os números são iguais");
		}
	}
}
