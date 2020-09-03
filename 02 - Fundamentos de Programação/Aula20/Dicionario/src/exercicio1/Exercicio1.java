package exercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercicio1 {

	public static void main(String[] args) {

		Map<Integer, String> loteriaDosSonhos = new HashMap<>();

		loteriaDosSonhos.put(0, "Ovos");
		loteriaDosSonhos.put(1, "Água");
		loteriaDosSonhos.put(2, "Escopeta");
		loteriaDosSonhos.put(3, "Cavalo");
		loteriaDosSonhos.put(4, "Dentista");
		loteriaDosSonhos.put(5, "Fogo");

		Map<String, ArrayList<String>> dicionarioDeApelidos = new HashMap<>();
		ArrayList<String> apelidos = new ArrayList<>();

		apelidos.add("Juan");
		apelidos.add("Fissura");
		apelidos.add("Maromba");

		dicionarioDeApelidos.put("João", apelidos);

		apelidos = new ArrayList<>();

		apelidos.add("Nigh Watch");
		apelidos.add("Bruce Wayne");
		apelidos.add("Tampinha");
		dicionarioDeApelidos.put("Miguel", apelidos);

		apelidos = new ArrayList<>();

		apelidos.add("Wonder Woman");
		apelidos.add("Mary");
		apelidos.add("Marilene");
		dicionarioDeApelidos.put("Maria", apelidos);

		apelidos = new ArrayList<>();

		apelidos.add("Lukinha");
		apelidos.add("Jorge");
		apelidos.add("George");
		dicionarioDeApelidos.put("Lucas", apelidos);

		loteriaDosSonhos.forEach((key, value) -> System.out.println(key + " - " + value));

		dicionarioDeApelidos.forEach((key, value) -> System.out.println(key + " - " + value));

	}

}
