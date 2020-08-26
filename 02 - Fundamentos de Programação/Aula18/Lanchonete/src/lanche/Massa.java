package lanche;

public class Massa extends Lanche {
	
	private String molho;
	private TiposDeMassa tipo;
	
	
	public Massa(Double preco, String molho, TiposDeMassa tipo) {
		super(preco);
		this.molho = molho;
		this.tipo = tipo;
		setTempo(30);
	}

	@Override
	public String toString() {
		return "\n|---------- MASSA ----------|\n\nPRODUTO ......... " + tipo + "\nMOLHO ........... " 
				+ molho + "\nPREÇO ........... R$" + getPreco() + "\nTEMPO ........... " + getTempo() + " MIN";
	}
}
