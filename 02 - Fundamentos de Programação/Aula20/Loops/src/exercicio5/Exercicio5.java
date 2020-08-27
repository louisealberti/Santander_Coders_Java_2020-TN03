package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op = 0;
		double num1, num2;

		while (op != 5) {

			System.out.println("|  CALCULADORA  |\n");
			System.out.println("Escolha uma opção");
			System.out.println("[ 1 ] SOMAR");
			System.out.println("[ 2 ] SUBTRAIR");
			System.out.println("[ 3 ] MULTIPLICAR");
			System.out.println("[ 4 ] DIVIDIR");
			System.out.println("[ 5 ] SAIR\n");

			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Digite o primeiro número");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo número");
				num2 = sc.nextDouble();
				somar(num1, num2);
				break;
			case 2:
				System.out.println("Digite o primeiro número");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo número");
				num2 = sc.nextDouble();
				subtrair(num1, num2);
				break;
			case 3:
				System.out.println("Digite o primeiro número");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo número");
				num2 = sc.nextDouble();
				multiplicar(num1, num2);
				break;
			case 4:
				System.out.println("Digite o primeiro número");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo número");
				num2 = sc.nextDouble();
				dividir(num1, num2);
				break;
			case 5:
				System.out.println("Tchau!");
				break;
			default:
				System.out.println("! -----| OPÇAO INVALIDA |-----!\n");
			}
		}
		sc.close();
	}

	public static void somar(double num1, double num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
	}

	public static void subtrair(double num1, double num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) + "\n");
	}

	public static void multiplicar(double num1, double num2) {
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2) + "\n");
	}

	public static void dividir(double num1, double num2) {
		System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2) + "\n");
	}
}
