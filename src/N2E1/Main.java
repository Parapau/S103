package N2E1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Set<Restaurant> restaurants = new HashSet<Restaurant>();
	static Scanner entrada = new Scanner(System.in);
	public static void main (String args[]) {
		boolean seguir = true;
		int opcio;


		ArrayList<Restaurant> si = new ArrayList<Restaurant>();


		do {
			System.out.println("Que vols fer?\n"
					+ "1.Afegir restaurant\n"
					+ "2.Veure restaurants\n"
					+ "0.Sortir");
			opcio = numeros();
			switch (opcio) {
			case 1:
				System.out.println("Molt Be");
				nouRestaurant();
				break;
			case 2:
				System.out.println("Molt be");
				veureRestaurant();
				break;
			case 0:
				System.out.println("adeu");
				seguir = false;
				break;
			default:
				System.out.println("1, 2 o 0, no hi han mes opcions");
				break;
			}
		} while (seguir);

	}


	public static void nouRestaurant() {
		String nom;
		int punts;
		Restaurant restaurant = null;

		System.out.println("Digues el nom");
		nom = entrada.nextLine();

		System.out.println("Quina puntuacio te");
		punts = numeros();

		restaurant = new Restaurant (nom, punts);

		if (!restaurants.add(restaurant))
			System.out.println("Aquest restaurant ja esta a la llista");
		else {
			System.out.println("Restaurant afegit");


		}
	}
	
	public static void veureRestaurant() {
		for (Iterator<Restaurant> i = restaurants.iterator(); i.hasNext(); ) {
			System.out.println(i.next());
		}
	}







	public static int numeros (){
		int opcio = 0;
		boolean numeros;
		do {
			try {
				opcio = Integer.parseInt(entrada.nextLine());
				numeros = true;
			}
			catch (java.lang.NumberFormatException e) {
				System.err.println("Aixo no es un numero.");
				numeros = false;
			}
		} while (!numeros);
		return opcio;
	}
}

