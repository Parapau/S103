package N1E1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Main {
	public static void main (String args[]) {
		
		ArrayList<Month> mesos = new ArrayList<Month>();
		
		Month m1 = new Month ("Gener");
		Month m2 = new Month ("Febrer");
		Month m3 = new Month ("Març");
		Month m4 = new Month ("Abril");
		Month m5 = new Month ("Maig");
		Month m6 = new Month ("Juny");
		Month m7 = new Month ("Juliol");
		Month m8 = new Month ("Setembre");
		Month m9 = new Month ("Octubre");
		Month m10 = new Month ("Novembre");
		Month m11 = new Month ("Desembre");

		
		
		mesos.add(m1);
		mesos.add(m2);
		mesos.add(m3);
		mesos.add(m4);
		mesos.add(m5);
		mesos.add(m6);
		mesos.add(m7);
		mesos.add(m8);
		mesos.add(m9);
		mesos.add(m10);
		mesos.add(m11);		

		System.out.println(mesos);

		Month m12 = new Month("Agost");
		mesos.add(7, m12);

		System.out.println(mesos);

		Set<Month> mesosHash = new HashSet<Month>(mesos);

		System.out.println(mesosHash);

		mesosHash.addAll(mesos);

		mesosHash.add(m5);
		
		System.out.println(mesosHash);


		System.out.println();

		System.out.println();

		System.out.println();



		for (Month i : mesos) {
			System.out.println(i);
		}

		System.out.println();

		System.out.println();

		System.out.println();


		Iterator <Month> iteracio = mesos.iterator();

		while (iteracio.hasNext()) {
			System.out.println(iteracio.next());
		}
	}
}
