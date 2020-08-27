package guardavolumes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import peca.Peca;

public class GuardaVolumes {

	private Map<Integer, List<Peca>> dicionario;
	private static Integer contador = 0;

	/**
	 * Construtora da classe GuardaVolumes.
	 */
	public GuardaVolumes() {
		dicionario = new HashMap<>();
	}

	/**
	 * Guarda as peças no guarda-volumes e retorna o numero onde foram armazenadas
	 * as peças.
	 * 
	 * @param listaDePeca
	 * @return contador
	 */
	public Integer guardarPecas(List<Peca> listaDePeca) {
		dicionario.put(contador, listaDePeca);
		return contador;
	}

	/**
	 * Imprime todas as peças que estão no guarda-volumes.
	 */
	public void mostrarPecas() {
		dicionario.forEach((key, value) -> System.out.println(key + " - " + value));
	}

	/**
	 * Imprime todas as peças associadas ao número recebido como parâmetro.
	 * 
	 * @param numero
	 */
	public void mostrarPecas(Integer numero) {
		System.out.println(dicionario.get(numero));
	}

	/**
	 * Remove a lista de pecas associada ao número recebido.
	 * 
	 * @param numero
	 */
	public void devolverPecas(Integer numero) {
		dicionario.remove(numero);
	}

}
