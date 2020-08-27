package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String usuario = "";
		String senha = "";

		while (usuario.equals(senha)) {
			System.out.println("Ecolha um nome de usuário");
			System.out.println("NOME DE USUARIO: ");
			usuario = sc.nextLine().toLowerCase();
			System.out.println("Ecolha uma senha");
			System.out.println("SENHA: ");
			senha = sc.nextLine().toLowerCase();

			if (usuario.equals(senha)) {
				System.out.println("O nome de usuário e a senha devem ser diferentes.\nTente novamente\n\n");
			}
		}
		sc.close();
	}

}
