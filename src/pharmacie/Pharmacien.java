package pharmacie;

public class Pharmacien extends person{
	
	public Pharmacien(int id, String firstName, String lastName, String email, String telephone) {
		super(id, firstName, lastName, email, telephone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\npharmacien " + super.toString() + "\n";
	}
		
}
