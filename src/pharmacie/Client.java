package pharmacie;

public class Client extends person{
	private int countPurchase;
	public Client(int id, String firstName, String lastName, String email, String telephone, int countPurchase) {
		super(id, firstName, lastName, email, telephone);
		this.countPurchase = countPurchase;
	}
	public int getCountPurchase() {
		return countPurchase;
	}
	public void setCountPurchase(int countPurchase) {
		this.countPurchase = countPurchase;
	}
	@Override
	public String toString() {
		return "\nclient " + super.toString() + ", countPurchase=" + countPurchase + "\n";
	}


}
