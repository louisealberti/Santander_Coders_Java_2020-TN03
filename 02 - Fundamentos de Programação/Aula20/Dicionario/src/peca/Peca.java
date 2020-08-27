package peca;

public abstract class Peca {

	private String marca;
	private String modelo;
	
	public Peca(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public abstract void retirada();
}
