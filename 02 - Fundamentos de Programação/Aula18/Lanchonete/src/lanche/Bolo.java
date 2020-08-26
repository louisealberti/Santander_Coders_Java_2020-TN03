package lanche;

public class Bolo extends Lanche {
	
	private String massa;
	private String recheio;
	private String cobertura;	
	
	public Bolo(Double preco, String massa, String recheio, String cobertura) {
		super(preco);
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
		setTempo(10);
	}

	@Override
	public String toString() {
		return "\n|---------- BOLO ----------|\n\nMASSA .......... " + massa + "\nRECHEIO ........ " + recheio 
				+ "\nCOBERTURA ...... " + cobertura + "\nPREÇO .......... R$" + "20,99\nTEMPO .......... " 
				+ getTempo() + " MIN";
	}
}
