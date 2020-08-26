package conta;

import java.util.Calendar;

public class Cheque {

	private double valor;
	private String banco;
	private Calendar dataPagamento;

	/**
	 * Construtor da classe Cheque.
	 */
	public Cheque() {

	}

	/**
	 * Construtor da classe Cheque.
	 * 
	 * @param valor
	 * @param banco
	 * @param dataPagameto
	 */
	public Cheque(double valor, String banco, Calendar dataPagameto) {
		this.valor = valor;
		this.banco = banco;
		this.dataPagamento = dataPagameto;
	}

	/**
	 * Retorna o valor do cheque.
	 * 
	 * @return valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * Define o valor do cheque.
	 * 
	 * @param valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * Retorna o banco do cheque.
	 * 
	 * @return banco
	 */
	public String getBanco() {
		return banco;
	}

	/**
	 * Define o banco do cheque.
	 * 
	 * @param banco
	 */
	public void setBanco(String banco) {
		this.banco = banco;
	}

	/**
	 * Retorna a data de pagamento do cheque.
	 * 
	 * @return
	 */
	public Calendar getDataPagameto() {
		return dataPagamento;
	}

	/**
	 * Define a data de pagamento do cheque.
	 * 
	 * @param dataPagameto
	 */
	public void setDataPagameto(Calendar dataPagameto) {
		this.dataPagamento = dataPagameto;
	}

}
