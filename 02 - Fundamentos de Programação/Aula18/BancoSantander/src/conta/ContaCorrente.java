package conta;

public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;

	/**
	 * Construtor da classe ContaCorrente.
	 */
	public ContaCorrente() {
		super();
	}

	/**
	 * Construtor da classe ContaCorrente.
	 * 
	 * @param limiteChequeEspecial
	 */
	public ContaCorrente(double limiteChequeEspecial) {
		super();
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	/**
	 * Informa o valor do limite do cheque especial do cliente.
	 * 
	 * @return limiteChequeEspecial
	 */
	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	/**
	 * Define o valor do limite do cheque especial.
	 * 
	 * @param limiteChequeEspecial
	 */
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	/**
	 * Saca um valor da conta corrente.
	 */
	@Override
	public void sacar(double valor) {
		double limite = getSaldo() - valor;

		if ((limite + limiteChequeEspecial) >= 0) {
			super.sacar(valor);
			if (limite < 0) {
				limiteChequeEspecial = limiteChequeEspecial - limite;
			}
		} else {
			System.out.println("Valor superou seu saldo disponível!");
		}
	}

	/**
	 * Deposita um valor na conta corente.
	 * 
	 * @param cheque
	 */
	public void depositarCheques(Cheque cheque) {
		depositar(cheque.getValor());
	}

}
