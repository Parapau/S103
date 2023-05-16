package N3E1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static Set<Persona> pipol = new HashSet<Persona>();
	static File file = new File("C:\\Users\\formacio\\Desktop\\Persones.txt");
	static Scanner entrada = new Scanner(System.in);

	public static void main(String args[]) {

		String coma = "";
		boolean fixa = true;
		Scanner entradaFitxer = null;
		try {
			entradaFitxer = new Scanner(file);
		} catch (FileNotFoundException e) {
			fixa = false;
		}
		String nom, cognom, DNI;
		Persona persona = null;
		boolean seguir = true;
		int opcio;

		if (fixa) {
			entradaFitxer.useDelimiter(",");

			while (entradaFitxer.hasNext()) {
				nom = entradaFitxer.next();
				cognom = entradaFitxer.next();
				DNI = entradaFitxer.next();
				persona = new Persona(nom, cognom, DNI);
				pipol.add(persona);
			}
		}
		do {
			System.out.println("Que vols fer?\n" + "1.Afegir una nova persona\n"
					+ "2.Veure les personse ordenades per nom A-Z\n"
					+ "3.Veure les personse ordenades per nom Z-A\n"
					+ "4.Veure les personse ordenades per cognom A-Z\n"
					+ "5.Veure les personse ordenades per cognom Z-A\n"
					+ "6.Veure les personse ordenades per DNI 1-9\n"
					+ "7.Veure les personse ordenades per DNI 9-1\n" + "0.Sortir");
			opcio = numeros();
			switch (opcio) {
			case 1:
				System.out.println("Molt Be");
				novaPersona();
				break;
			case 2:
				System.out.println("Molt be");
				ordreANom();
				break;
			case 3:
				System.out.println("Molt Be");
				ordreDNom();
				break;
			case 4:
				System.out.println("Molt be");
				ordreACognom();
				break;
			case 5:
				System.out.println("Molt Be");
				ordreDCognom();
				break;
			case 6:
				System.out.println("Molt be");
				ordreADNI();
				break;
			case 7:
				System.out.println("Molt Be");
				ordreDDNI();
				break;
			case 0:
				System.out.println("adeu");
				seguir = false;
				break;
			default:
				System.out.println("Aixo no es una opcio");
				break;
			}
		} while (seguir);


		try {
			FileWriter escriptor = new FileWriter("C:\\Users\\formacio\\Desktop\\Persones.txt");
			for (Persona i : ordreFinal()) {
				escriptor.write(coma + i.getNom() + "," + i.getCognom() + "," + i.getDNI());
				coma = ","; //esto sirve para que la primera no tenga coma pero cuando salte de persona si que la tenga
			}
			// escriptor.write();
			System.out.println(":)");
			escriptor.close();
		} catch (IOException e) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
		}

	}

	public static void novaPersona() {
		String nom, cognom, DNI;
		boolean seguir;
		Persona persona = null;
		do {
			System.out.println("Diguem el nom de la persona");
			nom = entrada.nextLine();
			System.out.println("Diguem el cognom de la persona");
			cognom = entrada.nextLine();
			System.out.println("Diguem el seu DNI");
			DNI = entrada.nextLine();
			persona = new Persona(nom, cognom, DNI);
			if (!pipol.add(persona)) {
				seguir = true;
				System.out.println(
						"Aquesta persona ja esta registrada, assegura't que les dades estiguin ben introduides");
			} else {
				seguir = false;
			}
		} while (seguir);

	}

	public static void ordreDDNI() {
		List<Persona> llista = new ArrayList<Persona>(pipol);

		llista.sort(Comparator.comparing(Persona::getDNI, Comparator.reverseOrder()));// Se que aixo es una lambda y no ho hauria de saber, pero ho he trobat per internet i crec que ho entenc, aixi que ho poso

		System.out.println("Nom	 Cognom	 DNI");

		for (Persona i : llista) {
			System.out.println(i);
		}

		/*
		 * Collections.sort(llista, new Comparator<Persona>() { public int
		 * compare(Persona p1, Persona p2) { return
		 * p1.getDNI().compareToIgnoreCase(p2.getDNI()); } });
		 */

	}

	public static void ordreADNI() {
		List<Persona> llista = new ArrayList<Persona>(pipol);

		llista.sort(Comparator.comparing(Persona::getDNI));

		System.out.println("Nom	 Cognom	 DNI");

		for (Persona i : llista) {
			System.out.println(i);
		}
	}

	public static void ordreDCognom() {
		List<Persona> llista = new ArrayList<Persona>(pipol);

		llista.sort(Comparator.comparing(Persona::getCognom, Comparator.reverseOrder()));

		System.out.println("Nom	 Cognom	 DNI");

		for (Persona i : llista) {
			System.out.println(i);
		}
	}

	public static void ordreACognom() {
		List<Persona> llista = new ArrayList<Persona>(pipol);

		llista.sort(Comparator.comparing(Persona::getCognom));

		System.out.println("Nom	 Cognom	 DNI");

		for (Persona i : llista) {
			System.out.println(i);
		}

	}

	public static void ordreDNom() {
		List<Persona> llista = new ArrayList<Persona>(pipol);

		llista.sort(Comparator.comparing(Persona::getNom, Comparator.reverseOrder()));

		System.out.println("Nom	 Cognom	 DNI");

		for (Persona i : llista) {
			System.out.println(i);
		}

	}

	public static void ordreANom() {
		List<Persona> llista = new ArrayList<Persona>(pipol);

		llista.sort(Comparator.comparing(Persona::getNom));

		System.out.println("Nom	 Cognom	 DNI");

		for (Persona i : llista) {
			System.out.println(i);
		}

	}

	public static List<Persona> ordreFinal() {
		List<Persona> llista = new ArrayList<Persona>(pipol);

		llista.sort(Comparator.comparing(Persona::getNom));

		return llista;
	}

	public static int numeros() {
		int opcio = 0;
		boolean numeros;
		do {
			try {
				opcio = Integer.parseInt(entrada.nextLine());
				numeros = true;
			} catch (java.lang.NumberFormatException e) {
				System.err.println("Aixo no es un numero.");
				numeros = false;
			}
		} while (!numeros);
		return opcio;
	}
}
