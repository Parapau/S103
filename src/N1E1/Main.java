package N1E1;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Main {
	public static void main (String args[]) {
		Month mesos = new Month();
		mesos.getMesos().add("Gener");
		mesos.getMesos().add("Febrer");
		mesos.getMesos().add("Març");
		mesos.getMesos().add("Abril");
		mesos.getMesos().add("Maig");
		mesos.getMesos().add("Juny");
		mesos.getMesos().add("Juliol");
		mesos.getMesos().add("Setembre");
		mesos.getMesos().add("Octubre");
		mesos.getMesos().add("Novembre");
		mesos.getMesos().add("Desembre");		

		System.out.println(mesos.getMesos());

		mesos.getMesos().add(7, "Agost");

		System.out.println(mesos.getMesos());

		Set<String> mesosHash = new HashSet<String>(mesos.getMesos());

		System.out.println(mesosHash);

		mesosHash.addAll(mesos.getMesos());

		System.out.println(mesosHash);


		System.out.println();

		System.out.println();

		System.out.println();



		for (String i : mesos.getMesos()) {
			System.out.println(i);
		}

		System.out.println();

		System.out.println();

		System.out.println();


		Iterator <String> iteracio = mesos.getMesos().iterator();

		while (iteracio.hasNext()) {
			System.out.println(iteracio.next());
		}
	}
}
