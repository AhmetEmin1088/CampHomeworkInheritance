
public class Instructor extends User{

	int termOfEmployment;
	String profession;
	
	public Instructor(int id, String firstName, String lastName, String emailAdress, String password, String profession, int termOfEmployment) {
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmailAdress(emailAdress);
		this.setPassword(password);
		this.setProfession(profession);
		this.setTermOfEmployment(termOfEmployment);
		
	}

	public int getTermOfEmployment() {
		return termOfEmployment;
	}

	public void setTermOfEmployment(int termOfEmployment) {
		this.termOfEmployment = termOfEmployment;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
