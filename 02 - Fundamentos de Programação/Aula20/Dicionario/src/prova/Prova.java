package prova;

import java.util.Set;

public class Prova {

	public void somaTotal(Set<Integer> conjuntoDeInteiros) {
		int soma = 0;
		for (Integer inteiro : conjuntoDeInteiros) {
			soma += inteiro;
		}
		System.out.println(soma);
	}
}
