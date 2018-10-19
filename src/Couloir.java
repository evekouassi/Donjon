
public class Couloir extends Chateau {
	
	//Variables d'instance
	String NomCoul1;
	String NomCoul2;
	Double DimCoul1;
	Double DimCoul2;
	
	
	//Constructeurs d'initialisation
	
	Couloir(String Nomchat, double Dimchat, int Nbpchat, int Nbcoulchat, String NomCoul1, String NomCoul2,Double DimCoul1,Double DimCoul2 ){
		
		super(Nomchat, Dimchat, Nbpchat,Nbcoulchat);
		NomCoul1="Mystère";
		DimCoul1=20.0;
		NomCoul2="Silence";
		DimCoul2=21.0;
		
				
	}


	public String getNomCoul1() {
		return NomCoul1;
	}


	public void setNomCoul1(String nomCoul1) {
		NomCoul1 = nomCoul1;
	}


	public String getNomCoul2() {
		return NomCoul2;
	}


	public void setNomCoul2(String nomCoul2) {
		NomCoul2 = nomCoul2;
	}


	public Double getDimCoul1() {
		return DimCoul1;
	}


	public void setDimCoul1(Double dimCoul1) {
		DimCoul1 = dimCoul1;
	}


	public Double getDimCoul2() {
		return DimCoul2;
	}


	public void setDimCoul2(Double dimCoul2) {
		DimCoul2 = dimCoul2;
	}
	
}