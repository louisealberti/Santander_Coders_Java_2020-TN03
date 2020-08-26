package cliente;

import conta.Conta;

public class Cliente {
	
	private Integer numCliente;
	private String sobrenome;
	private String rg;
	private String cpf;
	private Conta conta;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer numCliente, String sobrenome, String rg, String cpf, Conta conta) {
		this.numCliente = numCliente;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.conta = conta;
	}

	public Integer getNumCliente() {
		return numCliente;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getRg() {
		return rg;
	}

	public void setNumCliente(Integer numCliente) {
		this.numCliente = numCliente;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getCpf() {
		return cpf;
	}

	public Conta getConta() {
		return conta;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;		
	}
	
	
	

}
