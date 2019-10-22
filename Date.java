import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	public Date() {
	    LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
	    String LocalInformation = myDateObj.format(myFormatObj);
	    System.out.println("Hello, today is " + LocalInformation + " please see below to take the next steps on what you need to do."); // Display the current date"
	}
	
}
