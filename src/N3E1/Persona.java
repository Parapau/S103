package N3E1;

public class Persona {
	String nom, cognom;
	int DNI;

	public Persona(String nom, String cognom, int DNI) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.DNI = DNI;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public int getDNI() {
		return DNI;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setDNI(int DNI) {
		this.DNI = DNI;
	}
	

	@Override
	public int hashCode() {
		int hash;
		hash = getNom().hashCode() + getCognom().hashCode() + getDNI();
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
	
	@Override
	public String toString() {
		return getNom() + " 	" + getCognom() + "	 " + getDNI();
	}
	
	
	
}
