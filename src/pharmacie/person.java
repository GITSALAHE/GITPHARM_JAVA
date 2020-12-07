package pharmacie;

public class person {
		
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		private String telephone;
		
		public person(int id, String firstName, String lastName, String email, String telephone) {
			// TODO Auto-generated constructor stub
			this.id =id;
			this.firstName=firstName;
			this.lastName=lastName;
			this.email=email;
			this.telephone=telephone;
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
