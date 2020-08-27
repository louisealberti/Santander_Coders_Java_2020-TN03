package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {

		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(5);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(8);
		lista.add(8);
		
		lista.forEach(System.out::println);
		
		List<Integer> lista2 = new ArrayList<>();
		
		lista2.add(1);
		lista2.add(5);
		lista2.add(5);
		lista2.add(6);
		lista2.add(7);
		lista2.add(8);
		lista2.add(8);
		lista2.add(8);
		
		lista.forEach(System.out::println);
	}

}
