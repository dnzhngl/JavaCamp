package kodlamaio2;

public class Main {

	public static void main(String[] args) {
		
		//Instructor
		Instructor instructor = new Instructor(1, "Ahmet", "Tas","ahmetTas@xyz.com","12345", 2523);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.shareCourse();
		
		// Student
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Ayse");
		student.setLastName("Ciçek");
		student.setEmail("ayseCicek@abc.com");
		student.setPassword("12345");
		student.setStudentNo(3578);
		
		StudentManager studentManager = new StudentManager();
		studentManager.enrollCourse(student);
		
		// User
		UserManager userManager = new UserManager();
		userManager.register(instructor);
		userManager.delete(instructor);
		
		userManager.register(student);
		userManager.update(student);

	}

}
