package inheritance2;

public class LogManager {
	
	public void log(int logType) {
		
		// if abuse
		if (logType == 1) {
			System.out.println("Logged to database");
		}
		else if(logType == 2) {
			System.out.println("Logged to file");
		} else {
			System.out.println("E-mail sent.");
		}
	}
}

/* Type of Logs
1. Database
2. File
3. Email 
*/