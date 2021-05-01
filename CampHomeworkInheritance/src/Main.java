
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1,"Engin ","Demiroð","engin@gmail.com","12345","Yazýlým Geliþtirici",10);
		Student student = new Student(2,"Ahmet Emin ","Yýlmaz","ahmet@gmail.com","678910","Java + REACT","JavaCampHomework1 & JavaCampHomework2");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.getCourse(student);
		
		System.out.println("");
		
		UserManager userManager = new UserManager();
		userManager.changePassword(student);
		userManager.changePassword(instructor);
		

	}

}
