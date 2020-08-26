package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lanche.Bolo;
import lanche.Massa;
import lanche.Sanduiche;
import lanche.TiposDeMassa;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Escolha uma opção do cardápio");
		System.out.println("[ 1 ] SANDUICHE");
		System.out.println("[ 2 ] MASSA");
		System.out.println("[ 3 ] BOLO");
		
		Integer op = sc.nextInt();
		
		switch (op) {
		case 1:
			menuSanduiche();
			break;
		case 2:
			menuMassa();
			break;
		case 3:
			menuBolo();
			break;
		default:
			System.out.println("Opção invalida");
			break;
		}
		sc.close();

	} // end main
	
	public static void menuSanduiche() {
		
		Scanner sc = new Scanner(System.in);
		List<String> ingredientes = new ArrayList<>();
		
		System.out.println("Escolha os ingredientes do seu sanduíche");
		
		while(ingredientes.size() <= 10) {
			System.out.println("Digite o ingrediente: ");
			ingredientes.add(sc.nextLine().toUpperCase());
			System.out.println("Deseja adicionar mais ingredientes? (s/n)");
			String r;
			r = sc.nextLine();
			if(r.equals("n")){
				break;
			} // end if
		} // end while
		
		Sanduiche sanduiche =  new Sanduiche(15.90, ingredientes);
		
		System.out.println("Qual a distância do restaurante?");
		sanduiche.setTempo(sc.nextInt() * 10 + sanduiche.getTempo()) ;
		sc.nextLine();
		System.out.println(sanduiche.toString());
		
		sc.close();	
	} // end menuSanduiche
	
	public static void menuMassa() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual massa você deseja: MACARRAO, PIZZA ou LASANHA?");
		String tipoMassa = sc.nextLine().toUpperCase();
		System.out.println("Qual o molho?");
		String molho = sc.nextLine().toUpperCase();
		
		Massa massa = new Massa(25.90, molho, TiposDeMassa.valueOf(tipoMassa));
		
		System.out.println("Qual a distância do restaurante?");
		massa.setTempo(sc.nextInt() * 10 + massa.getTempo());
		sc.nextLine();
		System.out.println(massa.toString());
		
		sc.close();
	} // end menuMassa

	public static void menuBolo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a massa?");
		String massa = sc.nextLine().toUpperCase();
		System.out.println("Qual o recheio?");
		String recheio = sc.nextLine().toUpperCase();
		System.out.println("Qual a cobertura?");
		String cobertura = sc.nextLine().toUpperCase();
		
		Bolo bolo = new Bolo(19.90, massa, recheio, cobertura);
		
		System.out.println("Qual a distância do restaurante?");
		bolo.setTempo(sc.nextInt() * 10 + bolo.getTempo());
		sc.nextLine();
		System.out.println(bolo.toString());
		
		sc.close();
	} // menuBolo
}
