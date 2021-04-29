package kodlamaio1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java", "JAVA01", "Introduction to JAVA");
		Course course2 = new Course(2, "C#", "CSHARP01", "Introduction to JAVA");
		Course course3 = new Course(3, "Advance Java", "JAVA02", "Advance JAVA");

		Course[] courses = { course1, course2, course3 };
		
		CourseManager courseManager = new CourseManager();	
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		
		User user1 = new User(1, "Ahmet", "Tas", "ahmet@kodlamaio.com","12345");	
		User user2 = new User(2, "Mehmet", "Dağ", "mehmet@kodlamaio.com","12345");	
		User user3 = new User(3, "Ayse", "Ates", "ayse@kodlamaio.com","12345");	
		
		User[] users = { user1, user2, user3 };
	}

}
