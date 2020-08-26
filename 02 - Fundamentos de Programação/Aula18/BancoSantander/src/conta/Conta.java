package conta;

public class Conta {

	private double saldo;

	/**
	 * Construtor da classe Conta
	 */
	public Conta() {

	}

	/**
	 * Deposita um valor na conta.
	 * 
	 * @param deposito
	 */
	public void depositar(double deposito) {
		saldo += deposito;
	}

	/**
	 * Saca um valor da conta.
	 * 
	 * @param valor
	 */
	public void sacar(double valor) {
		if (saldo - valor < 0) {
			System.out.println("Não foi possível realizar essa operação. Saldo insuficiente.");
		} else {
			saldo -= valor;
			consultar();
		}
	}

	/**
	 * Imprime uma string com o saldo atual da conta.
	 */
	public void consultar() {
		System.out.println("\nSALDO ATUAL: " + saldo + "\n");
	}

	/**
	 * Retorna o valor do saldo da conta.
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

}
