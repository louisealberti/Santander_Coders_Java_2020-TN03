package lanche;

public abstract class Lanche {
	
	private Double preco;
	private Integer tempo;
	
	public Lanche(Double preco) {
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	/**
	 * Informa o tempo para preparar e entregar o sanduíche.
	 * @return tempo para preparar e entregar o sanduíche.
	 */
	public Integer getTempo() {
		return tempo;
	}
	/**
	 * Configura o tempo para preparar e entregar o sanduíche.
	 * @param tempo
	 */
	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}
}
