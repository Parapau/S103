package N2E1;

public class Restaurant {
	private int puntuacio;
	private String nom;
	
	public Restaurant(String nom, int puntuacio) {
		super();
		this.puntuacio = puntuacio;
		this.nom = nom;
	}
	public int getPuntuacio() {
		return puntuacio;
	}

	public String getNom() {
		return nom;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return getNom() + "  " + getPuntuacio();
	}

	@Override
	public int hashCode() {
		int hash;
		hash = getNom().hashCode() + getPuntuacio();
		return hash;
	}
	
	@Override 
	public boolean equals(Object o) {
		boolean retorn;
		if (this.hashCode() == o.hashCode()) {
			retorn = true;
		} else {
			retorn = false;
		}
		return retorn;
	}
	
	
	
	
	
	
	
	
	
	
}
