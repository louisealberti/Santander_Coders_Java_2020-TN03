package lanche;

import java.util.List;

public class Sanduiche extends Lanche {
	
	
	// Campos
	private List<String> ingredientes;

	/**
	 * Contrutor da classe Sanduíche
	 * @param preco
	 * @param ingredientes 
	 */
	public Sanduiche(Double preco, List<String> ingredientes) {
		super(preco);
		this.ingredientes = ingredientes;
		setTempo(15);
	}
	
	public String stringfy() {
		String str = "\n";
		for(String ingrediente : ingredientes) {
			str = str.concat("             ... " + ingrediente + "\n");
		}
		return str;
	}
	
	@Override
	public String toString() {
		return "\n|---------- SANDUICHE ----------|\n\nINGREDIENTES ... " + stringfy() 
				+ "\nPREÇO .......... R$" + getPreco() + "\nTEMPO .......... " + getTempo() + " MIN";
	}
}
