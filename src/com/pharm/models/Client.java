package com.pharm.models;

public class Client extends Person{
    private int countPurchase;
	public Client(int id, String firstName, String lastName, String email, String telephone, int countPurchase) {
		super(id, firstName, lastName, email, telephone);
		this.countPurchase = countPurchase;
	}
	public Client(){
		
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
