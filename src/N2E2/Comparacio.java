package N2E2;

public class Comparacio implements Comparable<Restaurant>{
	
	/*
	public int compare(Restaurant res1, Restaurant res2) {
		int r = res1.getPuntuacio() - res2.getPuntuacio();

		if (r == 0) {
			r = res1.getNom().compareTo(res2.getNom());
		}

		return r;
	}*/

	@Override
	public int compareTo(Restaurant o) {
		int r = this.puntuacio - res.getPuntuacio();

		if (r == 0) {
			r = this.nom.compareTo(res.getNom());
		}

		return r;
	}

}
