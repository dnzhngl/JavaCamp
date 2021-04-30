package kodlamaio2;

public class Instructor extends User {

	private int instructorNo;

	public Instructor() {}
	
	// Constructor with base class's fields / super()
	public Instructor(int id, String firstName, String lastName, String email, String password, int instructorNo) {
		
		super(id, firstName, lastName, email, password);
		this.instructorNo = instructorNo;
	}

	public int getInstructorNo() {
		return instructorNo;
	}

	public void setInstructorNo(int instructorNo) {
		this.instructorNo = instructorNo;
	}

}
