
public class Student extends User{

	String takenCourses;
	String submittedHomeworks;
	
	public Student(int id, String firstName, String lastName, String emailAdress, String password, String takenCourses, String submittedHomeworks) {
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmailAdress(emailAdress);
		this.setPassword(password);
		this.setTakenCourses(takenCourses);
		this.setSubmittedHomeworks(submittedHomeworks);
	}

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}

	public String getSubmittedHomeworks() {
		return submittedHomeworks;
	}

	public void setSubmittedHomeworks(String submittedHomeworks) {
		this.submittedHomeworks = submittedHomeworks;
	}
}
