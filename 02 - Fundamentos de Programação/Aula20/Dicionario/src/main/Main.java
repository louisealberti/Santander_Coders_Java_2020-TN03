package main;

import java.util.ArrayList;
import java.util.List;

import guardavolumes.GuardaVolumes;
import peca.Peca;

public class Main {

	public static void main(String[] args) {

		List<Peca> listaDePecas = new ArrayList<>();

		GuardaVolumes guardaVolumes = new GuardaVolumes();
		
		Integer numero = guardaVolumes.guardarPecas(listaDePecas);
		
		guardaVolumes.devolverPecas(numero);
		guardaVolumes.mostrarPecas();

	}

}
