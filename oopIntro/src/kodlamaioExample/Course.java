package kodlamaioExample;

public class Course {
	int id;
	String name;
	String code;
	String description;
	
	public Course() {}
	public Course(int id, String name, String code, String description) {
		this();
		this.id = id;
		this.name = name;
		this.code = code;
		this.description = description;
	}
}
