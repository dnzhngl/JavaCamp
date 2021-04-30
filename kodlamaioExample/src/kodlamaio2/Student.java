package kodlamaio2;

public class Student extends User {
	int studentNo;
	
	public Student() {}
	
	// Constructor with base class's fields / super()
	public Student(int id, String firstName, String lastName, String email, String password, int studentNo) {
		
		super(id, firstName, lastName, email, password);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

}
