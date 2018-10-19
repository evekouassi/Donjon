
public class Personnage {
	String NomPers1;
	String NomPers2;
	Double TailPers1;
	Double TailPers2;

	// Constructeurs d'initialisation

	Personnage(String NomPers1, Double TailPers1, String NomPers2, Double TailPers2) {
		NomPers1 = "Eve";
		TailPers1 = 2.0;
		NomPers2 = "Nathalie";
		TailPers2 = 1.80;
	}

	public String getNomPers1() {
		return NomPers1;
	}

	public void setNomPers1(String nomPers1) {
		NomPers1 = nomPers1;
	}

	public String getNomPers2() {
		return NomPers2;
	}

	public void setNomPers2(String nomPers2) {
		NomPers2 = nomPers2;
	}

	public Double getTailPers1() {
		return TailPers1;
	}

	public void setTailPers1(Double tailPers1) {
		TailPers1 = tailPers1;
	}

	public Double getTailPers2() {
		return TailPers2;
	}

	public void setTailPers2(Double tailPers2) {
		TailPers2 = tailPers2;
	}

}
