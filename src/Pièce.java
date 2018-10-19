
public class Pièce extends Chateau {
	//Variables d'instance
	String Nompiece1;
	String Nompiece2;
	Double Dimpiece1;
	Double Dimpiece2;
  
	//Constructeur d'initialisation
	
	Pièce(String Nomchat, double Dimchat, int Nbpchat, int Nbcoulchat, String Nompiece1, Double Dimpiece1,String Nompiece2, Double Dimpiece2){
		super(Nomchat, Dimchat, Nbpchat,Nbcoulchat);
       
		Nompiece1="C";
		Dimpiece1= 200.5;
		Nompiece2="D";
		Dimpiece2=100.0;
		
}

	public String getNompiece1() {
		return Nompiece1;
	}

	public void setNompiece1(String nompiece1) {
		Nompiece1 = nompiece1;
	}

	public String getNompiece2() {
		return Nompiece2;
	}

	public void setNompiece2(String nompiece2) {
		Nompiece2 = nompiece2;
	}

	public Double getDimpiece1() {
		return Dimpiece1;
	}

	public void setDimpiece1(Double dimpiece1) {
		Dimpiece1 = dimpiece1;
	}

	public Double getDimpiece2() {
		return Dimpiece2;
	}

	public void setDimpiece2(Double dimpiece2) {
		Dimpiece2 = dimpiece2;
	}
}
