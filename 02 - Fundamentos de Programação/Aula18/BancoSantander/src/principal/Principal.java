package principal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import cliente.Cliente;
import conta.Cheque;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Cliente> listaDeClientes = new ArrayList<Cliente>();

		// Clientes default para ajudar nos testes
		Conta contaA = new ContaCorrente();
		Conta contaB = new ContaPoupanca();

		Cliente clienteA = new Cliente(2021, "Silva", "1234567-0", "123.456.789-0", contaA);
		listaDeClientes.add(clienteA);
		Cliente clienteB = new Cliente(2020, "Costa", "1234567-1", "123.456.789-1", contaB);
		listaDeClientes.add(clienteB);

		// Menu Principal
		int op;

		System.out.println("Olá!");
		System.out.println("O que você deseja fazer?");
		System.out.printf("\n\n**** Menu Principal *****\n\n");
		System.out.println("[ 1 ] Cadastrar Novo Cliente");
		System.out.println("[ 2 ] Login");

		op = sc.nextInt();

		switch (op) {
		case 1:
			cadastrarCliente(listaDeClientes);
			break;
		case 2:
			identificacaoDoCliente(listaDeClientes);
			break;
		default:
			break;
		}
		sc.close();
	}

	/**
	 * Cadastra um novo cliente do banco.
	 * 
	 * @param listaDeClientes
	 */
	public static void cadastrarCliente(List<Cliente> listaDeClientes) {

		Scanner sc = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.println("Digite seu sobrenome");
		cliente.setSobrenome(sc.nextLine());
		System.out.println("Digite seu RG");
		cliente.setRg(sc.nextLine());
		System.out.println("Digite seu CPF");
		cliente.setCpf(sc.nextLine());

		int numero = listaDeClientes.get(listaDeClientes.size() - 1).getNumCliente();
		cliente.setNumCliente(numero + 1);

		System.out.println("Abrir Conta Poupança ou Conta Corrente? (CP/CC)");
		String c;
		Conta conta;
		c = sc.nextLine().toUpperCase();
		if (c.equals("CP")) {
			conta = new ContaPoupanca();
			cliente.setConta(conta);
			listaDeClientes.add(cliente);
			menuContaPoupanca(cliente);
		} else {
			conta = new ContaCorrente();
			cliente.setConta(conta);
			listaDeClientes.add(cliente);
			menuContaCorrente(cliente);
		}

		sc.close();

	} // end cadastrarCliente

	/**
	 * Identifica um cliente já cadastrado.
	 * 
	 * @param listaDeClientes
	 */
	public static void identificacaoDoCliente(List<Cliente> listaDeClientes) {

		Scanner sc = new Scanner(System.in);
		int numCliente;
		Cliente clienteAtual = null;

		System.out.println("\nIDENTIFIQUE-SE!");
		System.out.println("Digite seu número de cliente");
		numCliente = sc.nextInt();
		sc.nextLine();

		for (Cliente cliente : listaDeClientes) {
			if (numCliente == cliente.getNumCliente()) {
				clienteAtual = cliente;
			}
		}

		System.out.println("Oi, " + clienteAtual.getSobrenome() + "\n\n");
		System.out.println("O que você deseja fazer?\n\n");

		if (clienteAtual.getConta() instanceof ContaCorrente) {
			menuContaCorrente(clienteAtual);
		} else {
			menuContaPoupanca(clienteAtual);
		}
		sc.close();
	} // end identificacaoDoCliente

	/**
	 * Oferece as movimentações de uma conta conrrente.
	 * 
	 * @param cliente
	 */
	public static void menuContaCorrente(Cliente cliente) {

		Scanner sc = new Scanner(System.in);
		int op;

		do {

			System.out.printf("[ 1 ] Consultar\n");
			System.out.printf("[ 2 ] Sacar\n");
			System.out.printf("[ 3 ] Depositar\n");
			System.out.printf("[ 4 ] Depositar Cheque\n");
			System.out.printf("[ 0 ] Encerrar\n");
			System.out.print("\nOpção Desejada: ");
			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				cliente.getConta().consultar();
				break;
			case 2:
				System.out.println("Digite o valor do saque");
				cliente.getConta().sacar(sc.nextDouble());
				sc.nextLine();
				break;
			case 3:
				System.out.println("Digite o valor do depósito");
				cliente.getConta().depositar(sc.nextDouble());
				sc.nextLine();
				break;
			case 4:
				System.out.println("Preencha as informações do cheque");
				ContaCorrente conta = (ContaCorrente) cliente.getConta();
				conta.depositarCheques(preencherCheque());
				break;
			case 0:
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		} while (op != 0);

		sc.close();
	} // end menuContaCorrente

	/**
	 * Oferece as movimentações de uma conta poupança.
	 * 
	 * @param cliente
	 */
	public static void menuContaPoupanca(Cliente cliente) {

		Scanner sc = new Scanner(System.in);
		int op;

		do {

			System.out.printf("[ 1 ] Consultar\n");
			System.out.printf("[ 2 ] Sacar\n");
			System.out.printf("[ 3 ] Depositar\n");
			System.out.printf("[ 4 ] Recolher Juros\n");
			System.out.printf("[ 0 ] Encerrar\n");
			System.out.print("\nOpção Desejada: ");
			op = sc.nextInt();

			switch (op) {
			case 1:
				cliente.getConta().consultar();
				break;
			case 2:
				System.out.println("Digite o valor do saque");
				cliente.getConta().sacar(sc.nextDouble());
				sc.nextLine();
				break;
			case 3:
				Double valor;
				System.out.println("Digite o valor do depósito");
				valor = sc.nextDouble();
				cliente.getConta().depositar(valor);
				sc.nextLine();
				break;
			case 4:
				System.out.println("\nRecolhendo Juros...\n");
				ContaPoupanca conta = (ContaPoupanca) cliente.getConta();
				conta.recolherJuros();
				System.out.println(conta.toString());
				break;
			case 0:
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		} while (op != 0);

		sc.close();
	} // end menuContaPoupanca

	/**
	 * Preenche um cheque para depositar na conta corrente.
	 * 
	 * @return
	 */
	public static Cheque preencherCheque() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do cheque");
		double valor;
		valor = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o nome do banco");
		String banco = "";
		banco = sc.nextLine();
		System.out.println("Digite o dia");
		int dia = 0;
		dia = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o mês");
		int mes = 0;
		dia = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o ano");
		int ano = 0;
		dia = sc.nextInt();
		sc.nextLine();
		Calendar calendar = Calendar.getInstance();
		calendar.set(ano, mes, dia);

		Cheque cheque = new Cheque(valor, banco, calendar);
		return cheque;
	}

}
