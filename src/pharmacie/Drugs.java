package pharmacie;

public class Drugs {
	private int id;
	private String nameDrugString;
	private String descString;
	private float price;
	public Drugs(int id, String nameDrugString, String descString, float price) {
		this.id = id;
		this.nameDrugString = nameDrugString;
		this.descString = descString;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nDrugs id=" + id + ", nameDrugString=" + nameDrugString + ", descString=" + descString + ", price="
				+ price + " dhs\n";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameDrugString() {
		return nameDrugString;
	}
	public void setNameDrugString(String nameDrugString) {
		this.nameDrugString = nameDrugString;
	}
	public String getDescString() {
		return descString;
	}
	public void setDescString(String descString) {
		this.descString = descString;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
