package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		exercicio01();
//
//		System.out.println("Digite um número inteiro e positivo: ");
//		int N = sc.nextInt();
//		exercicio02(N);
//
//		System.out.println("Digite a quantidade de números a serem lidos");
//		int N = sc.nextInt();
//		exercicio03(N);
//
//		exercicio04();
//
//		exercicio05();
//
//		System.out.println("Digite a quantidade de termos ");
//		int termos = sc.nextInt();
//		System.out.println("Digite um valor para X ");
//		int X = sc.nextInt();
//
//		exercicio06(termos, X);
//		
//		exercicio07();
//		
//		System.out.println("Digite a quantidade de termos ");
//		int termos = sc.nextInt();
//		exercicio08(termos);
//
//		exercicio09();
//
//		System.out.println("Digite um número inteiro maior que 1");
//		int numero = sc.nextInt();
//		
//		exercicio10(numero);

		sc.close();
	}

	/**
	 * Exercício 01 -
	 */
	public static void exercicio01() {

		double salarioInicial = 1000.00;
		double salarioAtual = salarioInicial;
		double percentual = 0.015;

		for (int i = 1996; i < 2021; i++) {
			salarioAtual += salarioInicial * percentual;
			percentual *= 2;
		}
		System.out.println("Em 2020 o salário do empregado é " + salarioAtual);
	}

	/**
	 * Exercício 2 - Faça um programa que leia um valor N inteiro e positivo,
	 * calcule e mostre o valor de E, conforme a fórmula a seguir: E = 1 + 1! + 1 +
	 * 2! + 1 + 3! + ... + 1/N!
	 */
	public static void exercicio02(int N) {
		int E = 0;
		for (int i = 1; i <= N; i++) {
			int fat = 1;
			for (int j = i; j > 0; j--) {
				fat *= j;
			}
			E += fat;
		}
		E += N;

		System.out.println(E);
	}

	/**
	 * Exercício 3 - Faça um programa que leia um número N e que indique quantos
	 * valores inteiros e positivos devem ser lidos a seguir. Para cada número lido,
	 * mostre uma tabela contendo o valor lido e o fatorial desse valor.
	 */
	public static void exercicio03(int N) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		while (N > 0) {
			System.out.println("Digite um número inteiro positivo: ");
			numero = sc.nextInt();
			int fat = 1;
			for (int i = 1; i <= numero; i++)
				fat *= i;
			System.out.println("O fatorial de " + numero + " é " + fat);
			N--;
		}
	}

	/**
	 * Exercício 4 - Faça um programa que leia cinco pares de valores (a,b) todos
	 * inteiros e positivos, um de cada vez. Mostre os números inteiros pares de a
	 * até b (inclusive).
	 */
	public static void exercicio04() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a: ");
			int a = sc.nextInt();
			System.out.println("Digite b: ");
			int b = sc.nextInt();
			for (int j = a; j <= b; j++)
				if (j % 2 == 0)
					System.out.println(j);
		}
	}

	/**
	 * Exercício 5 – Faça um programa que leia dez conjuntos de dois valores, o
	 * primeiro representando o número do aluno e o segundo representando a sua
	 * altura em centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o
	 * número do aluno mais baixo e mais alto, junto com suas alturas.
	 */
	public static void exercicio05() {
		Scanner sc = new Scanner(System.in);
		double menor = 300;
		double maior = 0;
		int numeroDeAlunoMenor = 0;
		int numeroDeAlunoMaior = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número de aluno ");
			int numeroDeAluno = sc.nextInt();
			System.out.println("Digite a altura ");
			double altura = sc.nextDouble();
			if (altura > maior) {
				maior = altura;
				numeroDeAlunoMaior = numeroDeAluno;
			}
			if (altura < menor) {
				menor = altura;
				numeroDeAlunoMenor = numeroDeAluno;
			}
		}
		System.out.println("O maior aluno é " + numeroDeAlunoMaior + " - " + maior + " cm.");
		System.out.println("O menor aluno é " + numeroDeAlunoMenor + " - " + menor + " cm.");
	}

	/**
	 * Exercício 6 – Faça um programa que leia um número de termos e um valor
	 * positivo para X, calcule e mostre o valor da série a seguir:
	 */
	public static void exercicio06(int termos, int X) {
		double s = 0;
		for (int i = 2; i < termos + 2; i++) {
			int fat = 1;
			int pot = 1;
			for (int j = 0; j < i; j++)
				pot *= X;
			for (int k = 1; k < i; k++)
				fat *= k;
			if (i % 2 == 0)
				pot = -pot;
			s += (double) pot / fat;
		}
		System.out.println(s);
	}

	/**
	 * Exercício 7 - Faça um programa que monte os oito primeiros termos da
	 * sequência de Fibonacci.
	 */
	public static void exercicio07() {
		int fibo = 1;
		int anterior = 0;
		for (int i = 1; i <= 8; i++) {
			System.out.print(fibo + ((i == 8 ? "" : ", ")));
			int atual = fibo + anterior;
			anterior = fibo;
			fibo = atual;
		}
	}

	/**
	 * Exercício 8 – Faça um programa que leia o número de termos, determine e
	 * mostre os valores de acordo com a série abaixo: Série: 2, 7, 3, 4, 21, 12, 8,
	 * 63, 48, 16, 189, 192, 32, 567, 768, 64, ...
	 */
	public static void exercicio08(int termos) {
		for (int i = 0; i < termos; i++) {
			System.out.println("Não entendi o que o exercício quer ... :/");
		}
	}

	/**
	 * Exercício 9 – Faça um programa que calcule a soma dos primeiros 50 números
	 * pares. Esse programa não recebe valor. Os primeiros números pares são 2, 4,
	 * 6, ...
	 */
	public static void exercicio09() {
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				soma += i;
		}
		System.out.println("A soma dos 50 primeiros números pares é " + soma);
	}

	/**
	 * Exercício 10 – Faça um programa que receba um número inteiro maior que 1 e
	 * verifique se o número é primo ou não. Mostrar mensagem de um número primo ou
	 * de um número não primo. Obs: Um número é primo quando é divisível apenas pelo
	 * número um e por ele mesmo.
	 */
	public static void exercicio10(int numero) {
		boolean flag = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("É primo!");
		else
			System.out.println("Não é primo");
	}

}
