
public class Chateau {
	// Variables d'instances
	String Nomchat;
	double Dimchat;
	int Nbpchat;
	int Nbcoulchat;

	// Constructeurs d'initialisation

	Chateau(String Nomchat, double Dimchat, int Nbpchat, int Nbcoulchat) {

		Nomchat = "Chateau de versailles";
		Dimchat = 562.5;
		Nbpchat = 2;
		Nbcoulchat = 2;
	}

	public String getNomchat() {
		return Nomchat;
	}

	public void setNomchat(String nomchat) {
		Nomchat = nomchat;
	}

	public double getDimchat() {
		return Dimchat;
	}

	public void setDimchat(double dimchat) {
		Dimchat = dimchat;
	}

	public int getNbpchat() {
		return Nbpchat;
	}

	public void setNbpchat(int nbpchat) {
		Nbpchat = nbpchat;
	}

	public int getNbcoulchat() {
		return Nbcoulchat;
	}

	public void setNbcoulchat(int nbcoulchat) {
		Nbcoulchat = nbcoulchat;
	}

}
