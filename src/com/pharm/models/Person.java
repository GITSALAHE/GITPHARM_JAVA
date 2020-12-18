package com.pharm.models;

public class Person{
		
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		private String telephone;
		
		public Person(int id, String firstName, String lastName, String email, String telephone) {
			this.id =id;
			this.firstName=firstName;
			this.lastName=lastName;
			this.email=email;
			this.telephone=telephone;
		}
		public Person(){
			
		}
	

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		@Override
		public String toString() {
			return "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", telephone=" + telephone + "";
		}
		
}
