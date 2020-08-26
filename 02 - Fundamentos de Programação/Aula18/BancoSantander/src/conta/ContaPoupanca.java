package conta;

public class ContaPoupanca extends Conta {

	private double taxaJuros = 0.12;

	/**
	 * Construtor da classe ContaPoupanca.
	 */
	public ContaPoupanca() {
		super();
	}

	/**
	 * Construtor da classe ContaPoupança.
	 * 
	 * @param taxaJuros
	 */
	public ContaPoupanca(double taxaJuros) {
		super();
		this.taxaJuros = taxaJuros;
	}

	/**
	 * Retorna a taxa de juros da conta poupança.
	 * 
	 * @return taxaJuros
	 */
	public double getTaxaJuros() {
		return taxaJuros;
	}

	/**
	 * Define a taxa de juros da conta poupanca.
	 * 
	 * @param taxaJuros
	 */
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	/**
	 * Saca um valor da conta poupança.
	 */
	@Override
	public void sacar(double valor) {

		double limite = getSaldo() - valor;

		if (limite >= 0) {
			super.sacar(valor);
		} else {
			System.out.println("Valor superou seu saldo disponível!");
		}
	}

	/**
	 * Recolhe os juros mensais da conta poupança.
	 */
	public void recolherJuros() {
		double valor = getSaldo() * this.taxaJuros;
		super.depositar(valor);
	}

	/**
	 * Cria uma string com informações sobre a conta.
	 */
	@Override
	public String toString() {
		return "ContaPoupanca [taxaJuros=" + taxaJuros + ", getSaldo()=" + getSaldo() + "]";
	}
}
