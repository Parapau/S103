package N1E3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws FileNotFoundException {
		Map<String, String> paisos = new HashMap<String, String>();
		//ArrayList<String> paisos = new ArrayList<String>();
		//ArrayList<String> capitals = new ArrayList<String>();
		File file = new File ("C:\\Users\\formacio\\Desktop\\countries.txt");//l'arxiu esta malament, posa que la capital de georgia es atlanta, atlanta es la capital de l'estat de georgia a estats units, la capital del pais georgia es tiblissi.
		Scanner entradaFitxer = new Scanner (file);
		Scanner entrada = new Scanner(System.in);
		String nom, pais, capital, nomCapital;
		int punts = 0, num;
		double random;
		List <String> claus = null;
		
		while (entradaFitxer.hasNext()) {
			pais = entradaFitxer.next();
			capital =entradaFitxer.next();
			paisos.put(pais, capital);
		}
		claus = new ArrayList<String>(paisos.keySet());
		System.out.println("Benvigut/da al joc mes divertit del mon\nSabers-se capitals de paisos!!!\nApasionant\nCom et dius?");
		nom = entrada.nextLine();
		System.out.println("Un nom  molt bonic \nA continuacio et dire un pais, tu hauras de respondre amb el nom de la seva capital, siusplau, si el nom "
				+ "te algun espai substitueixlo per una barra baixa (_), moltes gracies\nA mes a mes, el joc estara amb alngles perque practiquis, aixi que respon "
				+ "els noms en angles\nComencem!");
		

		
		
		for (int i = 0 ; i < 10 ; i++) {
			random = Math.random()*paisos.size();
			num = (int) random;
			
			System.out.println("Capital of " + claus.get(num) + ":");
			
			nomCapital = entrada.nextLine();
			
			if (nomCapital.equalsIgnoreCase(paisos.get(claus.get(num)))){
				System.out.println("Nice!");
				punts++;
			} else {
				System.out.println("No, sorry, the capital is " + paisos.get(claus.get(num)));
			}
		}
		System.out.println("Congatulations " + nom + " you got " + punts + " points");
		
		
		try {
			/*File text = new File ("C:\\Users\\formacio\\Desktop\\Scoreboard.txt");
			if (text.createNewFile()) {
				System.out.println("Fitxer scoreborad creat");
			}else {
				System.out.println("ja existeix");
			}*/
			FileWriter escriptor = new FileWriter("C:\\Users\\formacio\\Desktop\\Scoreboard.txt", true);
			escriptor.write("\n" + nom + ": " + punts);
			System.out.println(":)");
			escriptor.close();
		} catch (IOException e) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
		}

		
	}
}





































