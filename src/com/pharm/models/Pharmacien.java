package com.pharm.models;

public class Pharmacien extends Person{
    public Pharmacien(int id, String firstName, String lastName, String email, String telephone) {
		super(id, firstName, lastName, email, telephone);
	}
	
	public Pharmacien(){
		
	}
	@Override
	public String toString() {
		return "\npharmacien " + super.toString() + "\n";
	}
}
